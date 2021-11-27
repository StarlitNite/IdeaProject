package com.stufood.service.Impl;

import com.stufood.dao.UserDao;
import com.stufood.entity.User;
import com.stufood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User findUserByNameAndPwd(String userName, String userPwd) {
        User user = userDao.findUserByNameAndPwd(userName,userPwd);
        return user;
    }

}
