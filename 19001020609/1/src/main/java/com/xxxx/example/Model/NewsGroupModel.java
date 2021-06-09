package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.List;
import java.util.Map;

public class NewsGroupModel {
    DBUtil db=new DBUtil();
    public List<Map<String,String>> NewsGroupList(){
        String sql="select * from newsgroup";
        List<Map<String,String>>  typelist=db.getList(sql);
        return typelist;
    }
}
