package org.example.service;

import org.example.dao.UserDao;
import org.example.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource//自动注入
    private UserDao userDao;

    /**
     * 通过用户名查询用户对象，返回User对象
     * @param name
     * @return
     */
    public User queryUserByName(String name){
        User user = userDao.queryUserByName(name);
        return user;
    }
}
