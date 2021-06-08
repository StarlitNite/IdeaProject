package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.List;
import java.util.Map;

public class UserModel {
    DBUtil db = new DBUtil();
    //从数据库中查询出User表数据
    public List<Map<String, String>> getUserList(String UserName){
        String sql = "select * from user";
        List<Map<String, String>> User=db.getList(sql);
        return User;
    }
}
