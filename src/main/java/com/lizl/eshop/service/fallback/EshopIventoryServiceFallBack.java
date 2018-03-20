package com.lizl.eshop.service.fallback;

import com.lizl.eshop.service.EshopIventoryService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lizhaoliang on 18/3/14.
 */
@Component
public class EshopIventoryServiceFallBack implements EshopIventoryService {
    @Override
    public String findByProductId(@RequestParam(value = "id") Integer id) {
        return "降级数据";
    }

}
