package com.example.stufood.service;

import com.example.stufood.entity.User;



public interface UserService {
    User findUserByNameAndPwd(String userName, String userPwd);
}
