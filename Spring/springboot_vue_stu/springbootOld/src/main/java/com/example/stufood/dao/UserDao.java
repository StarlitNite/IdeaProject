package com.example.stufood.dao;

import com.example.stufood.entity.User;

public interface UserDao {

    User findUserByNameAndPwd(String userName, String userPwd);
}
