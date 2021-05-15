package org.example;

import org.example.service.AccountService;
import org.example.service.ResourceService;
import org.example.service.TestService;
import org.example.service.TypeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter03 {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring03.xml");

        TypeService typeService = (TypeService) factory.getBean("TypeService");
        typeService.test();

        ResourceService resourceService = (ResourceService) factory.getBean("ResourceService");
        resourceService.test();

       /* TestService testService = (TestService) factory.getBean("TestService");
        testService.test();
*/
    }
}
