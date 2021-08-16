package com.example.sovo0.service.Impl;

import com.example.sovo0.dao.userMapper;
import com.example.sovo0.entity.user;
import com.example.sovo0.service.userService;
import com.example.sovo0.util.AssertUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userMapper userMapper;

    @Override
    public user login(user user) {
        user userDB = userMapper.FindUserNameByName(user.getUsername());
        if (!ObjectUtils.isEmpty(userDB)){
            //2.比较密码
            if (userDB.getPassword().equals(user.getPassword())){
                //3.比较身份
                if (userDB.getIdent().equals(user.getIdent())){
                    return userDB;
                }else {
                    throw new RuntimeException("身份错误");
                }
            }else {
                throw new RuntimeException("密码错误");
            }
        }else {
            throw new RuntimeException("用户名输入错误");
        }
    }

    @Override
    public int register(user user) {
        user userDB = userMapper.FindUserNameByName(user.getUsername());
        if (userDB == null){
            return userMapper.register(user);
        }else {
            throw new RuntimeException("用户名已被注册");
        }
    }

    @Override
    public void updateUser(user user) {


        //修改用户名时可用
        /*AssertUtil.isTrue(StringUtils.hasText(user.getUsername()),"用户名不能为空！");*/

        //修改密码
        AssertUtil.isTrue(StringUtils.hasText(user.getPassword()),"密码不能为空！");

        //非空校验
        AssertUtil.isTrue(user.getId()==null, "用户ID异常");

        //验证用户名唯一性(通过用户名查询记录),修改用户名时可用
        /*user temp = userMapper.FindUserNameByName(user.getUsername());*/
        //判断指定用户名查询的用户对象是否存在
        /*AssertUtil.isTrue(null!=temp,"用户名已存在，请重试！");*/

        //用户名存在，判断存在的记录是否是当前要修改的记录（通过id）
        /*user temp = userMapper.FindUserNameByName(user.getUsername());
        AssertUtil.isTrue(temp != null && !(user.getId()).equals(temp.getId()),"");*/
        AssertUtil.isTrue(userMapper.updateUser(user) < 1, "修改失败！");
    }


}
