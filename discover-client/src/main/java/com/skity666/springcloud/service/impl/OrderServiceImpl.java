package com.skity666.springcloud.service.impl;

import com.skity666.springcloud.entity.Order;
import com.skity666.springcloud.service.IOrderService;
import com.skity666.springcloud.service.IRemoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author Skity666
 * @Date 2020/11/11 0011 22:15
 * @Version 1.0
 **/
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IRemoteUserService userService;
    @Override
    public Order order(Integer id) {
//        第一种方式利用RestTemplate
//        1，写死url,属于硬编码
//        RestTemplate restTemplate=new RestTemplate();
//        return new Order(id,restTemplate.getForObject("http://localhost:8762/getUser/2",String.class));
//        2(利用loadBalancerClient通过应用名获取url，然后再使用restTemplate）
//        ServiceInstance serviceInstance=loadBalancerClient.choose("eureka-client");
//        String url=String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()+"getUser/3");
//        RestTemplate restTemplate=new RestTemplate();
//        return new Order(id,restTemplate.getForObject(url,String.class));
//        3加@LoadBalanced注解
//        String url="http://eureka-client/getUser/4";
//        return new Order(id,restTemplate.getForObject(url,String.class));
//        第二种方式Feign简化ribbon
        return new Order(id,userService.getUser(id));
//        return new Order(id,"订单");
    }
}
