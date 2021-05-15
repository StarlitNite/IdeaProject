package org.example.controller;

import org.example.po.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    /**
     *
     * @param uname
     * @return
     */
    public User queryByName(String uname){
        return userService.queryUserByName(uname);
    }
}
