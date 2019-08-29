package com.lzj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ConsumerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerZuulApplication.class, args);
    }

}