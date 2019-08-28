package com.lzj.springcloud.controller;

import com.lzj.springcloud.entity.User;
import com.lzj.springcloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserConsumerController {

//    private static String REST_URL_PREFIX = "http://localhost:8002";
    private static String REST_URL_PREFIX = "http://MICROSERVICECLOUD-PROVIDER";

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ConsumerService service;

    @RequestMapping(value="/consumer/add")
    public boolean addUser(User user){
//        Boolean flag = restTemplate.postForObject(REST_URL_PREFIX + "/add", user, Boolean.class);
        Boolean flag = service.add(user);
        return flag;
    }

    @RequestMapping(value="/consumer/get/{id}")
    public User get(@PathVariable("id") Integer id){
//        User user = restTemplate.getForObject(REST_URL_PREFIX + "/get" + "/" + id, User.class);
        User user = service.get(id);
        return user;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value="/consumer/list")
    public List<User> getList(){
//        List list = restTemplate.getForObject(REST_URL_PREFIX + "/getUser/list", List.class);
        List list = service.getAll();
        return list;
    }
}