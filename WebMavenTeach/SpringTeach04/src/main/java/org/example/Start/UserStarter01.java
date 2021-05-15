package org.example.Start;

import org.example.Dao.UserDao;
import org.example.Service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserStarter01 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("Spring.xml");

        UserDao userDao = (UserDao) factory.getBean("UserDao");
        userDao.test();

        UserService userService = (UserService) factory.getBean("UserService");
        userService.test();
    }
}
