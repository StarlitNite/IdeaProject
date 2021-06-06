package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

    /**
     * 控制器中的方法
     *      访问路径：hello.do
     * @return
     */
    @RequestMapping("/hello")
    public ModelAndView hello(){
        // 得到ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        /**
         * 设置数据模型
         */
        modelAndView.addObject("msg", "Hello Servlet"); // 集合、数组、数据库查来的对象、集合 都可以放进去


        /**
         * 设置视图
         */
        modelAndView.setViewName("hello");

        //返回视图模型对象
        return modelAndView;
    }
}
