package com.wangxin.eureka.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:jzwx
 * @Desicription: HelloController
 * @Date:Created in 2018-12-10 11:49
 * @Modified By:
 */
@RestController
public class HelloController {
    @RequestMapping("/info")
    public String hello(){
        return "hello xxx，this is demo-provider2 messge";
    }

    /**
     * 服务提供者(生产者)
     * @param name
     * @return
     */
    @RequestMapping("/producerHello")
    public String hello(@RequestParam("name")String name){
        return "hello " + name + "，this is demo-provider2 messge";
    }
}
