package com.example.SpringMVC01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    /**
     * 控制器中的方法
     *      访问路径：hello.do
     * @return
     */
    @RequestMapping("/hello")
    public ModelAndView hello(){
        //得到ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();

        /**
         * 设置数据模型
         */
        modelAndView.addObject("msg","Hello SpringMVC01");
        /**
         * 设置视图
         */
        modelAndView.setViewName("hello");

        //返回视图模型对象
        return modelAndView;
    }
}
