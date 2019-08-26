package com.lzj.springcloud.service;

import com.lzj.springcloud.entity.User;
import java.util.List;

public interface UserService {

    public boolean addUser(User user);

    public User getUser(int id);

    public List<User> getUsers();
}
