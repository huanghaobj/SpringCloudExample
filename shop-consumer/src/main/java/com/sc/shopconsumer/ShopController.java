package com.sc.shopconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @Autowired
    ShopService shopService;

  /*  @GetMapping("/sayHello")
    public String hello(){
        return shopService.hello("寒山飞狐");
    }*/
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return shopService.hello(name);
    }
}
