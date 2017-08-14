package com.ygz.learn.spring.ioc.service;

import com.ygz.learn.spring.ioc.dao.UserDao;
import com.ygz.learn.spring.ioc.entity.User;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 14/08/2017.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void save(User user) {
        userDao.save(user);
        System.out.println("service----save---user:"+user);
    }

    @Override
    public List get(final String id) {
        List<User> users = userDao.get(id);
        System.out.println("service----get---user:"+users.size());
        return users;
    }
}
