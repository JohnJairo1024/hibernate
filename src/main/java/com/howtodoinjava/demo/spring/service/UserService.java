package com.howtodoinjava.demo.spring.service;

import com.howtodoinjava.demo.spring.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> list();
}
