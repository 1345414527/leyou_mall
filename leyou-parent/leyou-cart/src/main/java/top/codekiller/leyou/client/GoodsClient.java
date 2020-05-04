package top.codekiller.leyou.client;

import org.springframework.cloud.openfeign.FeignClient;
import top.codekiller.leyou.api.GoodsApi;


@FeignClient(value="item-service")
public interface GoodsClient extends GoodsApi {
}
