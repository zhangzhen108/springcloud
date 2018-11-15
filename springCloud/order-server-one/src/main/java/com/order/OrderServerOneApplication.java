package com.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.order.dao.demo")
public class OrderServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServerOneApplication.class, args);
    }
}
