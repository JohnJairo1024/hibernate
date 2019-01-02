package com.howtodoinjava.demo.spring.dao;

import com.howtodoinjava.demo.spring.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> list();
}
