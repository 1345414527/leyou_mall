package top.codekiller.leyou.client;

import org.springframework.cloud.openfeign.FeignClient;
import top.codekiller.leyou.api.BrandApi;

@FeignClient(value="item-service")
public interface BrandClient extends BrandApi {
}
