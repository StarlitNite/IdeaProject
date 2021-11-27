package com.example.stufood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/getlucky")
    public ModelAndView getlucky(ModelAndView mv) {
        mv.setViewName("/lucky"); //设置模板为根目录的lucky.html
        String sWelcomeWords="欢迎使用Thymeleaf!";
        mv.addObject("welcomewords",sWelcomeWords); //将sWelcomeWords变量的值，绑定到该模板的welcomewords标签上
        return mv; //返回并渲染
    }
}

