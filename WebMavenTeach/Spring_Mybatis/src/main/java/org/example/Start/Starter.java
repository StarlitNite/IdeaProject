package org.example.Start;

import org.example.controller.UserController;
import org.example.po.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        //得到Controller类
        UserController userController = (UserController) ac.getBean("userController");

        User user = userController.queryByName("admin");

        System.out.println(user);

    }
}
