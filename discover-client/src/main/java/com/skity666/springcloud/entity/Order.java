package com.skity666.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Order
 * @Description TODO
 * @Author Skity666
 * @Date 2020/11/11 0011 22:12
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
public class Order {
    private Integer id;
    private String name;
}
