package org.example;

import org.example.dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring 配置文件的加载
 *      1.通过相对路径加载配置文件
 *          ClassPathXmlApplicationContext("配置文件名");
 *      2.通过绝对路径加载配置文件
 *          FileSystemXmlApplicationContext(“配置文件的绝对路径”);
 *
 *      1.单个配置文件加载
 *          new ClassPathXmlApplicationContext("配置文件名")
 *      2.多个配置文件加载
 *          1.通过可变参数，设置多个配置文件
 *              new ClassPathXmlApplicationContext("配置文件名1","配置文件名2")
 *          2.设置一个总配置文件，在总配置文件中导入需要加载的配置文件
 *              <import resource="beans.xml"/>
 *
 */
public class Strarter {
    public static void main(String[] args) {

        //加载多个配置文件
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml","beans.xml");

        //加载总配置文件

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.test();

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
        userDao.test();
    }
}
