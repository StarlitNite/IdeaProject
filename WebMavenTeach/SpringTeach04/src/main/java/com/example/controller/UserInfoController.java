package com.example.controller;

import com.example.model.ResultInfo;
import com.example.service.UserInfoService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;
//在Controller层调用Service层 自动注入
    /**
     * Controller层：（控制层：接收请求、响应结果）
     *         1.接收参数 （用户名、密码）
     *         2.调用业务逻辑层对应的方法，得到登录结果（ResultInfo对象）
     *         3.响应结果
     * @param userName
     * @param userPwd
     * @return
     */
    public ResultInfo userLogin(String userName,String userPwd){
        ResultInfo resultInfo = userInfoService.userLogin(userName, userPwd);//接收参数，得到登录结果
        return resultInfo;//响应结果
    }
}
