package org.example.Start;

import org.example.Dao.AccountDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean对象的作用域与生命周期
 */
public class Starter05 {

    public static void main(String[] args) {

        //加载配置文件
      //  BeanFactory factory = new ClassPathXmlApplicationContext("Spring05.xml");

//        AccountDao accountDao = (AccountDao) factory.getBean("AccountDao");
//        System.out.println(accountDao);
//
//        AccountDao accountDao02 = (AccountDao) factory.getBean("AccountDao");
//        System.out.println(accountDao02);

        // Bean对象的销毁
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring05.xml");
        ac.close();
    }
}
