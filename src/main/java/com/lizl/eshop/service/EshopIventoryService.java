package com.lizl.eshop.service;

import com.lizl.eshop.service.fallback.EshopIventoryServiceFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lizhaoliang on 18/2/24.
 */
@FeignClient(value = "eshop-inventory-service", fallback = EshopIventoryServiceFallBack.class)
public interface EshopIventoryService {

    @RequestMapping(value = "/product-inventory/findByProductId",method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "productId") Integer productId);

}