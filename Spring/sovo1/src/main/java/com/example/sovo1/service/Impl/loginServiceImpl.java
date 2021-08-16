package com.example.sovo1.service.Impl;

import com.example.sovo1.mapper.userMapper;
import com.example.sovo1.emtity.user;
import com.example.sovo1.emtity.vo.userVo;
import com.example.sovo1.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginService {

    @Autowired
    private userMapper userMapper;

    @Override
    public userVo checkLogin(String username, String password) {
        return userMapper.login(username, password);
    }

    @Override
    public user register(String username, String password,String ident) {
        return userMapper.register(username, password,ident);
    }


    public user findUserByUserName(userVo userVo) {
        return null;
    }
}
