package com.xxxx.example.Model;

import Util.DBUtil;


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


}
