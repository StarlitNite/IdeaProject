package org.example.Service;

import org.example.Dao.IUserDao;
import org.example.Dao.UserDao;
import org.example.Dao.UserDao01;

import javax.annotation.Resource;

/**
 * @Resource注解
 * 实现Bean对象的自动注入
 *      1.默认会根据bean标签的id属性值查找(属性字段名与bean标签的id属性值相等)
 *      2.如果属性名名称未找到，则会根据类型（Class）查找
 *      3.属性字段可以提供set方法，也可以不提供
 *      4.注解可以声明在属性字段级别或set方法级别
 *      5.可以设置name属性，name属性必须和bean标签的id属性值一致；如果设置了name属性，就只会按照name属性值查找bean对象，如果写接口，用接口的实现类时，类的属性都是
 *      6.当注入接口时，如果接口只有一个实现则能正常实例化；如果接口有多个实现类（注入接口失败，原因是只需要一个接口，但是匹配到了两个接口），则需要name属性设置id属性值
 *
 */

public class UserService {

    @Resource
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 注入接口
     */
    @Resource(name = "UserDao02")//设置name属性值
    //private UserDao01 userDao01; 直接注入接口的实现类
    private IUserDao iUserDao;//注入接口

    public void test(){
        System.out.println("UserService...");
        userDao.test();
        iUserDao.test();
    }
}
