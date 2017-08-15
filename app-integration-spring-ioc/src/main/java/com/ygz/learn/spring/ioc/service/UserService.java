package com.ygz.learn.spring.ioc.service;

import com.ygz.learn.spring.ioc.entity.User;

import java.util.List;

/**
 * Created by Administrator on 14/08/2017.
 */
public interface UserService {
    void save(User user);
    List get(String id);
}
