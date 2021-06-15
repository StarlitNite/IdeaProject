package com.xxxx.example.Model;

import Util.DBUtil;


import java.util.List;
import java.util.Map;

public class UserModel {
    DBUtil db = new DBUtil();
    //从数据库中查询出User表数据
    public Map<String, String> getUserMap(String UserName){
        String sql = "select * from user where UserName=?";
        String[] params ={UserName};
        Map<String, String> user= db.getMap(sql,params);
        return user;
    }

    public List<Map<String, String>> getUserList(String UserID){
        String sql = "select * from user where UserID=?";
        String[] params = {UserID};
        List<Map<String, String>> user = db.getList(sql, params);
        return user;
    }

    //增加评论 需要单个UserID
    public Map<String, String> getMap(String UserID){
        String sql = "select * from user where UserID=?";
        String[] params ={UserID};
        Map<String, String> user= db.getMap(sql,params);
        return user;
    }
}
