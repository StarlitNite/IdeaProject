package com.stufood.service;

import com.stufood.entity.User;



public interface UserService {
    User findUserByNameAndPwd(String userName, String userPwd);


}
