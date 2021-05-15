package com.example;

import com.example.controller.UserInfoController;
import com.example.model.ResultInfo;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Junit单元测试
 *      1.方法不能是静态方法
 *      2.不能有参数
 *      3.返回值是void
 *      4.每个单元测试方法上都需要设置@Test注解
 */
public class UserInfoTest {

    @Test
    public void testLogin(){
        //加载配置文件
        BeanFactory factory = new ClassPathXmlApplicationContext("spring04.xml");
        //得到Bean对象
        UserInfoController userInfoController = (UserInfoController) factory.getBean("userInfoController");
        //调用方法
        ResultInfo resultInfo = userInfoController.userLogin("admin", "123456");
        System.out.println(resultInfo);
    }
}
