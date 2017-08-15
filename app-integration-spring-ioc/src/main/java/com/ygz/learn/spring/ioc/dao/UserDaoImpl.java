package com.ygz.learn.spring.ioc.dao;

import com.ygz.learn.spring.ioc.entity.User;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 14/08/2017.
 */
public class UserDaoImpl implements UserDao {
    private static  List<User> users = new ArrayList<User>(20);
    static {
        for (int id = 0; id < 20; id++){
            User user = new User();
            user.setId(id+"");
            user.setName("Juice"+id);
            user.setAge(id+10);
            user.setPwd(id+"123"+id);
            users.add(user);
        }
    }
    @Override
    public void save(User user) {
        users.add(user);
        System.out.println("dao save success---");
    }

    @Override
    public List<User> get(String id) {
        List<User> userList = users.stream()
                .filter(user-> StringUtils
                .contains(user.getId(),id))
                .collect(Collectors.<User>toList());
        return userList;
    }
}
