package top.codekiller.leyou.client;

import org.springframework.cloud.openfeign.FeignClient;
import top.codekiller.leyou.api.CategoryApi;

@FeignClient(value="item-service")
public interface CategoryClient extends CategoryApi {
}
