package com.wangxin.eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author:jzwx
 * @Desicription: DemoProvider1Application
 * @Date:Created in 2018-12-10 11:47
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
public class DemoProvider1Application {
    public static void main(String[] args) {
        SpringApplication.run(DemoProvider1Application.class, args);
    }
}
