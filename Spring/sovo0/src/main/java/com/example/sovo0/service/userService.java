package com.example.sovo0.service;

import com.example.sovo0.entity.user;

public interface userService {

    //用户登录
    user login(user user);

    //用户注册
    int register(user user);

    //修改密码
    public void updateUser(user user);


}
