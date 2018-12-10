package com.wangxin.eureka.demo.controller;

import com.wangxin.eureka.demo.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:jzwx
 * @Desicription: ConsumerController
 * @Date:Created in 2018-12-10 14:22
 * @Modified By:
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloRemote helloRemote;

    /**
     * 消费者的接口，去调用服务提供者
     * 问题：只能使用@RequestMapping("/consumerHello/{name}")  @PathVariable("name")方法 不知道有没有其它方式代替？
     *
     * @param name
     * @return
     */
    @RequestMapping("/consumerHello/{name}")
    public String index(@PathVariable(value = "name") String name) {
        return helloRemote.sayHello(name);
    }

    @RequestMapping(value = "/info")
    public String info() {
        return " Hi,I am a consumer!";
    }
}
