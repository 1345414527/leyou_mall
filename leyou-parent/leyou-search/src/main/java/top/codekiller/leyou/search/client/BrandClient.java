package top.codekiller.leyou.search.client;

import org.springframework.cloud.openfeign.FeignClient;
import top.codekiller.leyou.api.BrandApi;

@FeignClient(value="item-service")
public interface BrandClient extends BrandApi {
}
