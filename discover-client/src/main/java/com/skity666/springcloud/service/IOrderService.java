package com.skity666.springcloud.service;

import com.skity666.springcloud.entity.Order;
import org.springframework.stereotype.Service;

public interface IOrderService {

    Order order(Integer id);
}
