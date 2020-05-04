package top.codekiller.leyou.listener;

import com.netflix.discovery.converters.Auto;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import top.codekiller.leyou.service.impl.GoodsHtmlService;

import java.io.File;

@Component
public class GoodsListener {

    @Autowired
    private GoodsHtmlService goodsHtmlService;

    @Value("${file.path}")
    private String filePath;


    @RabbitListener(bindings = @QueueBinding(
            value=@Queue(value="LEYOU.ITEM.SAVE.QUEUE",durable = "true"),
            exchange = @Exchange(value="LEYOU.ITEM.EXCHANGE"
                                ,ignoreDeclarationExceptions = "true"
                                ,type = ExchangeTypes.TOPIC),
            key={"item.insert","item.update"}
    ))
    public void save(Long id){
        if(id==null){
            return ;
        }
        goodsHtmlService.createHtml(id);
    }


    @RabbitListener(bindings = @QueueBinding(
            value=@Queue(value = "LEYOU.ITEM.DELETE.QUEUE",durable = "true"),
            exchange = @Exchange(value="LEYOU.ITEM.EXCHANGE"
                                ,ignoreDeclarationExceptions = "true"
                                ,type = ExchangeTypes.TOPIC),
            key = {"item.delete"}
    ))
    public void delete(Long id){
        this.goodsHtmlService.deleteHtml(id);
    }
}
