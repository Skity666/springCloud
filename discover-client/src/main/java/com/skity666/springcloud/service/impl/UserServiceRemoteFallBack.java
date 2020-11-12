package com.skity666.springcloud.service.impl;

import com.skity666.springcloud.service.IRemoteUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceRemoteFallBack implements IRemoteUserService {

    @Override
    public String getUser(Integer id) {
        return "一直连接不上，看看是不是没启动啊，orderId："+id ;
    }
}