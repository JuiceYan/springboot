package com.ygz.learn.spring.ioc;

import com.ygz.learn.spring.ioc.dao.UserDao;
import com.ygz.learn.spring.ioc.dao.UserDaoImpl;
import com.ygz.learn.spring.ioc.entity.User;
import com.ygz.learn.spring.ioc.service.UserService;
import com.ygz.learn.spring.ioc.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

/**
 * Created by Administrator on 13/08/2017.
 */
public class SpringIocTest {
    @Test
   public void testApplicationContext(){
        ClassPathResource pathResource = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(beanFactory);
        definitionReader.loadBeanDefinitions(pathResource);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.get("2").stream().peek(System.out::println);
    }

    @Test
    public void testData(){
        UserServiceImpl userService = new UserServiceImpl();
        UserDao userDao = new UserDaoImpl();
        userService.setUserDao(userDao);

        userService.get("1").stream().peek(System.out::println);
        User user = new User();
        user.setId("qwe");
        userService.save(user);
        userService.get("qwe").forEach(System.out::println);
    }
}
