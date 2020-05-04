package top.codekiller.leyou.search.client;

import org.springframework.cloud.openfeign.FeignClient;
import top.codekiller.leyou.api.SpecificationApi;

@FeignClient(value="item-service")
public interface SpecificationClient extends SpecificationApi {


}
