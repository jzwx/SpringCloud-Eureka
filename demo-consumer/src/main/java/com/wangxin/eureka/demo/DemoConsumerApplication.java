package com.wangxin.eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author:jzwx
 * @Desicription: DemoConsumerApplication
 * @Date:Created in 2018-12-10 13:57
 * @Modified By:
 */
@EnableEurekaClient //启用服务注册与发现
@EnableFeignClients //启用feign进行远程调用
@SpringBootApplication
public class DemoConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }
}
