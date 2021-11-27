package com.example.stufood.controller;

import com.example.stufood.entity.User;
import com.example.stufood.model.dto.LoginInfo;
import com.example.stufood.model.vo.Result;
import com.example.stufood.service.UserService;
import com.example.stufood.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService UserService;

    /**
     * 登录成功，签发token
     * @param loginInfo
     * @return
     */
    @PostMapping(value = "/login")
    public Result login(@RequestBody LoginInfo loginInfo){
        User user = UserService.findUserByNameAndPwd(loginInfo.getUsername(),loginInfo.getPassword());
        if(user == null){
            return Result.error("登录失败");
        }
        String jwt = JwtUtils.generateToken("user"+user.getUserName());
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        map.put("token",jwt);
        return Result.ok("登录成功",map);
    }
}
