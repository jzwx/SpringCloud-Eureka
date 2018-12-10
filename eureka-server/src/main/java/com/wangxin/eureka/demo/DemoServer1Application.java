package com.wangxin.eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:jzwx
 * @Desicription: EurekaServerApplication
 * @Date:Created in 2018-12-10 10:58
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaServer
public class DemoServer1Application {
    public static void main(String[] args) {
        SpringApplication.run(DemoServer1Application.class, args);
    }
}
