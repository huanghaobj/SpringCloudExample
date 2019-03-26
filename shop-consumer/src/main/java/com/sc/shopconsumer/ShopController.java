package com.sc.shopconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Shop controller.
 */
@RestController
public class ShopController {
    @Autowired
    ShopService shopService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return shopService.hello(name);
    }
}
