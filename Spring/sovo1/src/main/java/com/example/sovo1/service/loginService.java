package com.example.sovo1.service;

import com.example.sovo1.emtity.user;
import com.example.sovo1.emtity.vo.userVo;

public interface loginService {

    public userVo checkLogin(String username, String password);

    public user register(String username, String password,String ident);

    user findUserByUserName(userVo userVo);



}
