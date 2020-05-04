package top.codekiller.aliyunSms.listener;

import com.aliyuncs.exceptions.ClientException;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import top.codekiller.aliyunSms.properties.SmsProperties;
import top.codekiller.aliyunSms.util.SendSmsUtils;
import java.util.Map;

@Component
public class SmsListener {

    @Autowired
    private SmsProperties smsProperties;

    @Autowired
    private SendSmsUtils sendSmsUtils;




    @RabbitListener(bindings = @QueueBinding(
            value=@Queue(value="LEYOU.SMS.QUEUE",durable = "true"),
            exchange = @Exchange(value="LEYOU.SMS.EXCHANGE",ignoreDeclarationExceptions = "true",type= ExchangeTypes.TOPIC),
            key={"verifycode.sms"}
    ))
    public void sendSms(Map<String,String> msg) throws ClientException {
        if(msg==null||CollectionUtils.isEmpty(msg)){
            //放弃处理
            return ;
        }
        String phoneNum=msg.get("phone");
        String code=msg.get("code");

        if(StringUtils.isAllBlank(phoneNum,code)){
            //放弃处理
            return ;
        }


        if(!StringUtils.isEmpty(phoneNum)&&!StringUtils.isEmpty(code)){
            JsonObject jsonObject=new JsonObject();
            jsonObject.addProperty("code",code);
            sendSmsUtils.sendSms(phoneNum,jsonObject.toString(),smsProperties.getSignName(),smsProperties.getVerifyCodeTemplate());
        }
    }



}
