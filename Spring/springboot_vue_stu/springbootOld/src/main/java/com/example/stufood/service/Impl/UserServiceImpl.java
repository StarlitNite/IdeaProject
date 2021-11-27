package com.example.stufood.service.Impl;

import com.example.stufood.dao.UserDao;
import com.example.stufood.entity.User;
import com.example.stufood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByNameAndPwd(String userName, String userPwd) {
        User user = userDao.findUserByNameAndPwd(userName,userPwd);
        if (user == null){
            throw new UsernameNotFoundException("用户不存在");
        }else {

        }
        return user;
    }
}
