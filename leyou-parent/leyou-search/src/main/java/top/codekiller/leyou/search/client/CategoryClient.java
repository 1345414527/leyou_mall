package top.codekiller.leyou.search.client;

import org.springframework.cloud.openfeign.FeignClient;
import top.codekiller.leyou.api.CategoryApi;

@FeignClient(value="item-service")
public interface CategoryClient extends CategoryApi {
}
