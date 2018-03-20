package com.lizl.eshop.service.fallback;

import com.lizl.eshop.service.EshopPriceService;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lizhaoliang on 18/3/20.
 */
public class EshopPriceServiceFallBack implements EshopPriceService{
    @Override
    public String findByProductId(@RequestParam(value = "productId") Integer productId) {
        return "降级数据";
    }
}
