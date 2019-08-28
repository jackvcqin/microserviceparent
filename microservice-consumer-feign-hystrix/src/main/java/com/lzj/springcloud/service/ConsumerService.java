package com.lzj.springcloud.service;

import com.lzj.springcloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "microservicecloud-provider", fallbackFactory = ConsumerServiceFallbackFactory.class)
public interface ConsumerService {

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") int id);

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(User user);

    @RequestMapping(value = "/getUser/list", method = RequestMethod.GET)
    public List<User> getAll();
}

