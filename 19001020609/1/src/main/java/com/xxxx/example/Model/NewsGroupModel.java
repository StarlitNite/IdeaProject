package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.List;
import java.util.Map;

public class NewsGroupModel {
    DBUtil db=new DBUtil();
    public List<Map<String,String>> NewsGroupList(String NewsGroup){

        String sql="";
        if (NewsGroup==null){
            sql="select * from newsgroup";
        }else {
            sql="select * from newsgroup where NewsGrouplike'%"+NewsGroup+"'";//模糊查询
        }
        List<Map<String,String>>  NG=db.getList(sql);
        return NG;
    }
    //插入功能
    //删除功能

}
