package top.codekiller.leyou.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leyou.common.utils.JsonUtils;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import top.codekiller.auth.pojo.UserInfo;
import top.codekiller.leyou.client.GoodsClient;
import top.codekiller.leyou.interceptor.LoginInterceptor;
import top.codekiller.leyou.pojo.Cart;
import top.codekiller.leyou.pojo.Sku;
import top.codekiller.leyou.service.ICartService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static  final String KEY_PREFIX="user:card:";

    @Autowired
    private GoodsClient goodsClient;


    /**
     * 添加购物车信息
     * @param cart
     */
    @Override
    public void addCart(Cart cart) {
        //获取用户信息
        UserInfo userInfo = LoginInterceptor.getUserInfo();

        //查询购物车记录
        BoundHashOperations<String, Object, Object> hashOperations = redisTemplate.boundHashOps(KEY_PREFIX + userInfo.getId());

        String key=String.valueOf(cart.getSkuId());
        Integer num=cart.getNum();
        //判断当前的商品是否在购物车中
        if(hashOperations.hasKey(key)){
            //在，更新数量
            String cartJson=hashOperations.get(key).toString();
            cart=JsonUtils.parse(cartJson,Cart.class);
            cart.setNum(cart.getNum()+num);
            hashOperations.put(key,JsonUtils.serialize(cart));
        }else{
            //不在，新增购物车
            Sku sku = this.goodsClient.querySkuBySkuId(cart.getSkuId());
            cart.setUserId(userInfo.getId());
            cart.setImage(sku.getImages());
            cart.setTitle(sku.getTitle());
            cart.setImage(StringUtils.isBlank(sku.getImages())?"":StringUtils.split(sku.getImages(),",")[0]);
            cart.setPrice(sku.getPrice());
            hashOperations.put(key,JsonUtils.serialize(cart));
        }
    }

    /**
     * 获取购物车信息
     * @return
     */
    @Override
    public List<Cart> queryCards() {
        UserInfo userInfo=LoginInterceptor.getUserInfo();

        //判断是否存在购物车记录
        if(this.redisTemplate.hasKey(KEY_PREFIX+userInfo.getId())) {
            //获取购物车记录
            BoundHashOperations<String, Object, Object> hashOperation = this.redisTemplate.boundHashOps(KEY_PREFIX + userInfo.getId());

            List<Object> cartsJson=hashOperation.values();

            //如果购物车集合为空，直接返回null
            if(CollectionUtils.isEmpty(cartsJson)){
                return null;
            }

            //把List<Object>集合转化为List<Cart>集合
            return cartsJson.stream().map((value) -> JsonUtils.parse(value.toString(), Cart.class)).collect(Collectors.toList());
        }

        return null;
    }

    /**
     * 更新sku的数量
     * @param cart
     */
    @Override
    public void updateCart(Cart cart) {
        UserInfo userInfo=LoginInterceptor.getUserInfo();

        //判断用户是否有购物车信息
        if(!this.redisTemplate.hasKey(KEY_PREFIX+userInfo.getId())){
            return ;
        }

        //获取用户的购物车信息
        BoundHashOperations<String, Object, Object> hashOperation = this.redisTemplate.boundHashOps(KEY_PREFIX + userInfo.getId());
        String key=String.valueOf(cart.getSkuId());
        Integer num=cart.getNum();
        if(!hashOperation.hasKey(key)){
            return ;
        }
        String cartsJson=String.valueOf(hashOperation.get(key));
        cart = JsonUtils.parse(cartsJson, Cart.class);
        cart.setNum(num);
        hashOperation.put(key, JsonUtils.serialize(cart));
    }
}
