package com.skity666.springcloud.rest;

import com.skity666.springcloud.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Skity666
 * @Date 2020/11/11 0011 21:33
 * @Version 1.0
 **/
@RestController
public class UserController {

    @GetMapping("getUser/{id}")
    public User getUser( @PathVariable Integer id){
        return new User(id,"Skity666");
    }
}
