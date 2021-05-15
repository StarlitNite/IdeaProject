package com.example;

import com.example.dao.UserDao;
import com.example.factory.MyClassPathXmlApplication;
import com.example.factory.MyFactory;
import com.example.service.UserService;

public class Starter {
    public static void main(String[] args) {

        //得到工厂类
        MyFactory myFactory = new MyClassPathXmlApplication("spring.xml");
        //通过getBean方法，得到指定的Bean对象
        UserService userService = (UserService) myFactory.getBean("userService");

        userService.test();

        UserDao userDao = (UserDao) myFactory.getBean("userDao");
        userDao.test();
    }
}
