package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.List;
import java.util.Map;

public class NewSModel {
    DBUtil db = new DBUtil();

    public List<Map<String, String>>  getNewsList(){
        String sql = "select * from news";

        List<Map<String, String>> news = db.getList(sql);
        return news;
    }
}
