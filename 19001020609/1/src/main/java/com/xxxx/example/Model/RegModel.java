package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.Map;

public class RegModel {
    DBUtil db = new DBUtil();
    public Boolean Reg(String UserName,String Password,String Tel,String Ident){
        String sql = "select * from user where UserName=?";
        String[] params = {UserName};
        Map<String, String> m = db.getMap(sql, params);
        if (m==null){
            String sql1 = "insert into user(UserName,Password,Tel,Ident)values(?,?,?,?)";
            String[] params1 = {UserName,Password,Tel,Ident};
            db.update(sql1,params1);
            return true;
        }else {
            return false;
        }
    }
}
