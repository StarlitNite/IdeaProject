package org.example.dao;

import org.example.po.User;

/**
 * 用户接口类
 */
public interface UserDao {
    //不需要再加注解，因为有扫描器
    //通过用户名查询用户对象
    public User queryUserByName(String userName);
}
