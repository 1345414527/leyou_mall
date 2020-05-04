package com.leyou.order.service.api;

import org.springframework.cloud.openfeign.FeignClient;
 import top.codekiller.leyou.api.GoodsApi;

@FeignClient(value = "leyou-gateway", path = "/api/item")
public interface GoodsService extends GoodsApi {
}
