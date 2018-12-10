package com.wangxin.eureka.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:jzwx
 * @Desicription: HelloRemote
 * @Date:Created in 2018-12-10 14:18
 * @Modified By:
 */
@Service
@FeignClient(name = "demo-provider")
public interface HelloRemote {
    //需要匹配服务提供者接口名称
    @RequestMapping(value = "/producerHello")
    public String sayHello(@RequestParam(value = "name") String name);
}
