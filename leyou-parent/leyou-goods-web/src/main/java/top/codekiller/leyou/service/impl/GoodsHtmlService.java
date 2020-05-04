package top.codekiller.leyou.service.impl;

import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import sun.net.ftp.FtpClient;
import top.codekiller.leyou.pojo.Spu;
import top.codekiller.leyou.service.IGoodsHtmlService;

import javax.servlet.ServletInputStream;
import java.io.*;
import java.net.*;
import java.util.Map;

@Service
@Slf4j
public class GoodsHtmlService implements IGoodsHtmlService {

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private GoodsService goodsService;

    @Value("${file.path}")
    String filePath;

    /**
     *页面静态化
     * @param spuId
     */
    @Override
    public void createHtml(Long spuId) {
        //初始化运行上下文
        Context context=new Context();
        //设置数据模型
        context.setVariables(goodsService.loadData(spuId));

        Writer writer=null;

        try {
            File file = new File(filePath + spuId + ".html");
            writer=new PrintWriter(file);
            this.templateEngine.process("item",context,writer);
        } catch (FileNotFoundException e) {
            log.error("页面静态化失败：{}"+e,spuId);
        } finally {
            IOUtils.closeQuietly(writer);
        }
    }


    public  void deleteHtml(Long id){
        File file = new File(filePath, id + ".html");
        file.deleteOnExit();
    }




}
