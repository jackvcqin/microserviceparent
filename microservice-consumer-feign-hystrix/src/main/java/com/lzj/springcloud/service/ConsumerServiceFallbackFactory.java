package com.lzj.springcloud.service;

import com.lzj.springcloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumerServiceFallbackFactory implements FallbackFactory<ConsumerService> {

    @Override
    public ConsumerService create(Throwable throwable) {
        return new ConsumerService() {
            @Override
            public User get(int id) {
                User user = new User(id, "该用户不存在", 0);
                return user;
            }

            @Override
            public boolean add(User user) {
                return false;
            }

            @Override
            public List<User> getAll() {
                return null;
            }
        };
    }
}
