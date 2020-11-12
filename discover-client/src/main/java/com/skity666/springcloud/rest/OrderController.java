package com.skity666.springcloud.rest;

import com.skity666.springcloud.entity.Order;
import com.skity666.springcloud.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author Skity666
 * @Date 2020/11/11 0011 22:09
 * @Version 1.0
 **/
@RestController
public class OrderController {

    @Autowired
    private IOrderService service;

    @GetMapping("order/{id}")
    public Order order(@PathVariable Integer id) {
        return service.order(id);
    }
}
