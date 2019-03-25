package com.sc.shopconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "shopClient")
public interface ShopService {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

}
