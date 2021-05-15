package org.example.Dao;

import org.example.Service.AccountService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


/**
 * 通过实现org.springframework.beans.factory.InitializingBean 接口，查看Bean对象实例化的时机
 */
@Repository
public class AccountDao implements InitializingBean {

    @Resource
    private AccountService accountService;

    public void test(){
        System.out.println("TypeDao...");
        accountService.test();
    }

    /**
     * 初始化方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AccountDao init...");
    }

    /**
     * 销毁方法
     */
    public void destroy(){
        System.out.println("AccountDao销毁了...");
    }
}
