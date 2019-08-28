package com.lzj.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.lzj.springcloud.service")
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }

}