package com.skity666.springcloud.service;

import com.skity666.springcloud.service.impl.UserServiceRemoteFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Skity666
 * @Description 跨服务调用
 * @Date 23:08 2020/11/11 0011
 * @Param
 * @return
 **/
@FeignClient(value = "eureka-client",fallback = UserServiceRemoteFallBack.class)
public interface IRemoteUserService {

    @GetMapping("getUser/{id}")
    String getUser(@PathVariable Integer id);
}
