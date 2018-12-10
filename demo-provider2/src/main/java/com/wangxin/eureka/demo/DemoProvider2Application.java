package com.wangxin.eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author:jzwx
 * @Desicription: DemoProvider2Application
 * @Date:Created in 2018-12-10 12:30
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
public class DemoProvider2Application {
    public static void main(String[] args) {
        SpringApplication.run(DemoProvider2Application.class, args);
    }
}
