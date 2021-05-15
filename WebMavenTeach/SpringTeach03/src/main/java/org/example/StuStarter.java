package org.example;

import org.example.service.StuService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StuStarter {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("StuSpring.xml");
        StuService stuService = (StuService) beanFactory.getBean("StuService");
        System.out.println(stuService.ID);
        System.out.println(stuService.Password);
        stuService.DogSer();
//自己写的内容
    }
}
