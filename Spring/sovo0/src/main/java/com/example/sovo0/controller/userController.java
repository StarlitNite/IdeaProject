package com.example.sovo0.controller;

import com.example.sovo0.exception.ParamsException;
import com.example.sovo0.util.ApiResponse;
import com.example.sovo0.entity.user;
import com.example.sovo0.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    //登陆
    @PostMapping("/login")
    public ApiResponse login(@RequestBody user user){

        try {
            user userDB = userService.login(user);
            return new ApiResponse(200, "登录成功");

        }catch (Exception e){
            e.printStackTrace();
           throw new RuntimeException("登录失败");
        }

    }
    //注册
    @PostMapping("/register")
    public ApiResponse register(@RequestBody user user, HttpServletRequest request) {
        user user1 = new user();
        user1.setUsername(request.getParameter("username"));
        user1.setPassword(request.getParameter("password"));
        user1.setIdent(request.getParameter("ident"));

        int userDB = userService.register(user);
        if (userDB == 1) {
            return new ApiResponse(200, "注册成功");
        }else {
            throw new RuntimeException("注册失败");
        }
    }

    //修改密码
    @PutMapping("/cpwd")
    public ApiResponse updateUser(@RequestBody user user){
        ApiResponse apiResponse = new ApiResponse();

        try {
            userService.updateUser(user);
        }catch (ParamsException p){
            p.printStackTrace();
            apiResponse.setCode(p.getCode());
            apiResponse.setMessage(p.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            apiResponse.setCode(500);
            apiResponse.setMessage("用户更新失败");
        }

        return new  ApiResponse(200,"成功");
    }
}
