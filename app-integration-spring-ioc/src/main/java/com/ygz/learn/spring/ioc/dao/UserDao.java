package com.ygz.learn.spring.ioc.dao;

import com.ygz.learn.spring.ioc.entity.User;

import java.util.List;

/**
 * Created by Administrator on 14/08/2017.
 */
public interface UserDao {
    void save(User user);

    List<User> get(String id);
}
