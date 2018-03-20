package com.lizl.eshop.controller;

import com.lizl.eshop.service.EshopIventoryService;
import com.lizl.eshop.service.EshopPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhaoliang on 18/3/20.
 */
@RestController
@RequestMapping("/one")
public class EshopOneController {

    @Autowired
    EshopIventoryService eshopIventoryService;

    @Autowired
    EshopPriceService eshopPriceService;

    @RequestMapping("/findInventoryByProuctId")
    @ResponseBody
    public String findInventoryByProductId(Integer productId){
        return eshopIventoryService.findByProductId(productId);
    }

    @RequestMapping("/findPriceByProductId")
    @ResponseBody
    public String findPriceByProductId(Integer productId){
        return eshopPriceService.findByProductId(productId);
    }
}
