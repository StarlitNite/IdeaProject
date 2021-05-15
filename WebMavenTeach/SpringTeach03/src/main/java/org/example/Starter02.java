package org.example;

import org.example.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter02 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring02.xml");

        /*使用空构造实例化*/
        AccountService accountService = (AccountService) factory.getBean("AccountService");

        System.out.println(accountService);
    }
}
