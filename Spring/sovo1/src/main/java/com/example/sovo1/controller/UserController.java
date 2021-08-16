package com.example.sovo1.controller;


import com.example.sovo1.emtity.user;
import com.example.sovo1.emtity.vo.userVo;
import com.example.sovo1.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController("/user")
public class UserController {

    @Autowired
    private loginService loginService;

    @RequestMapping("/getlogin")
    public String getlogin(){
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(user user, ModelAndView mv, HttpServletRequest res) {
        userVo login = loginService.checkLogin(user.getUsername(), user.getPassword());

        System.out.println(login);
        if (login!=null){
            res.getSession().setAttribute("login", login);
            System.out.println("成功");
            mv.setViewName("index");
        }else {
            System.out.println("失败");
            mv.setViewName("login");
        }
        return mv;
    }

    @PostMapping("/register")
    public Map<String, String>
    /*private loginServiceImpl loginService;*/
}
