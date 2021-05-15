package org.example.Start;

import org.example.Dao.UserDao;
import org.example.Service.TypeService;
import org.example.Service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserStarter02 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("Spring02.xml");

        TypeService typeService = (TypeService) factory.getBean("TypeService");
        typeService.test();
    }
}
