package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.Map;

public class LogModel {
    DBUtil db = new DBUtil();
    public Boolean login(String UserName,String Password){
        String sql = "select * from user where UserName=? and Password=?";
        String[] params ={UserName,Password};
        Map<String, String> m = db.getMap(sql, params);
        if (m!=null){
            return true;
        }else {
            return false;
        }
    }
    public Map<String, String> getUserMap(String UserName){
        String sql = "select * from user where UserName=?";
        String[] params ={UserName};
        Map<String, String> user= db.getMap(sql,params);
        return user;
    }
}
