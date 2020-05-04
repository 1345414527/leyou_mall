package top.codekiller.leyou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leyou.common.pojo.PageResult;
import com.netflix.discovery.converters.Auto;
import com.netflix.discovery.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.codekiller.leyou.mapper.*;
import top.codekiller.leyou.pojo.*;
import top.codekiller.leyou.pojo.bo.SpuBo;
import top.codekiller.leyou.service.IGoodsService;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
public class GoodsService implements IGoodsService {

    @Autowired
    private SpuMapper spuMapper;

    @Autowired
    private SpuDetailMapper spuDetailMapper;

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SkuMapper skuMapper;

    @Autowired
    private StockMapper stockMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 根据条件来分页查询Spu
     * @param key 关键字
     * @param saleable 是否上架
     * @param page 查询的页码
     * @param rows 当前页的数据量
     * @return
     */
    @Override
    public PageResult<SpuBo> querySpuByPage(String key, Boolean saleable, Integer page, Integer rows) {
        LambdaQueryWrapper<Spu> queryWrapper=new QueryWrapper<Spu>().lambda();
        //添加查询条件
        if(StringUtils.isNotBlank(key)){
            queryWrapper.like(Spu::getTitle,key);
        }
        //添加上下架的过滤
        if(saleable!=null) {
            queryWrapper.eq(Spu::getSaleable, saleable);
        }
        //进行分页查询,获取当前页对象
        IPage<Spu> ipage=spuMapper.selectPage(new Page<Spu>(page,rows),queryWrapper);
        //获取spu集合
        List<Spu> spus=ipage.getRecords();
        //转化成spubo的集合
        List<SpuBo> spuBos=spus.stream().map(spu->{
            SpuBo spuBo = new SpuBo();
            BeanUtils.copyProperties(spu,spuBo);
            //查询品牌名称
            Brand brand=this.brandMapper.selectById(spu.getBrandId());
            spuBo.setBname(brand.getName());
            //查询分类名称
            List<String> categoryNames=this.categoryService.queryNamesByIds(Arrays.asList(spu.getCid1(),spu.getCid2(),spu.getCid3()));
            String cname=StringUtils.join(categoryNames,"-");
            spuBo.setCname(cname);
            return spuBo;
        }).collect(Collectors.toList());
        //返回pageResult<SpuBo>
        PageResult<SpuBo> pageResult=new PageResult<SpuBo>(ipage.getTotal(),(int)ipage.getPages(),spuBos);
        return pageResult;
    }


    /**
     * 增加商品的spu和sku
     * @param spuBo
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveGoods(SpuBo spuBo) {
        //先新增spu
         //防止id注入
        spuBo.setId(null);
        spuBo.setSaleable(true);
        spuBo.setValid(true);
        spuBo.setCreateTime(new Date());
        spuBo.setLastUpdateTime(spuBo.getCreateTime());
        this.spuMapper.insert(spuBo);
        //再去新增spuDetail
        SpuDetail spuDetail=spuBo.getSpuDetail();
        spuDetail.setSpuId(spuBo.getId());
        this.spuDetailMapper.insert(spuDetail);

        saveSkuAndStock(spuBo);

       this.sendMsg("insert",spuBo.getId());
    }

    /**
     * 对sku和库存的插入进行了一个封装
     * @param spuBo
     */
    @Transactional(rollbackFor = Exception.class)
    public void saveSkuAndStock(SpuBo spuBo){
        List<Sku> skus=spuBo.getSkus();
        skus.forEach(sku->{
            //新增sku
            sku.setId(null);
            sku.setSpuId(spuBo.getId());
            sku.setCreateTime(new Date());
            sku.setLastUpdateTime(sku.getCreateTime());
            this.skuMapper.insert(sku);

            //新增stock
            Stock stock=new Stock();
            stock.setSkuId(sku.getId());
            stock.setStock(sku.getStock());
            this.stockMapper.insert(stock);
        });
    }


    /**
     * 根据spu的id查询SpuDetail
     * @param spuId
     * @return
     */
    @Override
    public SpuDetail querySpuBySupId(Long spuId) {
        return spuDetailMapper.selectById(spuId);
    }

    @Override
    public List<Sku> querySkuBySpuId(Long spuId) {
        return this.skuMapper.querySkuBySpuId(spuId);
    }

    /**
     * 更新商品
     * @param spuBo
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateGoods(SpuBo spuBo) {
        //根据spuid查询要删除的sku
        List<Sku> skus=this.skuMapper.selectList(new QueryWrapper<Sku>().lambda().eq(Sku::getSpuId,spuBo.getId()));
        //删除stock
        skus.forEach(sku -> {
            this.stockMapper.deleteById(sku.getId());
        });

        //删除sku
        skus.forEach(sku->{
            this.skuMapper.deleteById(sku.getId());
        });

        //新增sku和stock
        this.saveSkuAndStock(spuBo);

        //更新spu和spuDetails
        spuBo.setCreateTime(null);
        spuBo.setLastUpdateTime(new Date());
        spuBo.setValid(null);
        spuBo.setSaleable(null);
        this.spuMapper.updateById(spuBo);
        this.spuDetailMapper.updateById(spuBo.getSpuDetail());

        sendMsg("update",spuBo.getId());
    }

    /**`
     * 根据id获取spu
     * @param id
     * @return
     */
    @Override
    public Spu querySpuById(Long id) {
        return this.spuMapper.selectById(id);
    }


    private void sendMsg(String type,Long spuId){
        try {
            //item.insert,item.delete,item.update
            this.amqpTemplate.convertAndSend("item."+type,spuId);
        } catch (AmqpException e) {
            log.error("商品{}的消息发送错误:{}"+e.getCause()+e.getMessage(),type,spuId);
        }
    }


    /**
     * 通过skuId查询sku
     * @param skuId
     * @return
     */
    @Override
    public Sku querySkuBySkuId(Long skuId) {
        return this.skuMapper.selectById(skuId);
    }
}
