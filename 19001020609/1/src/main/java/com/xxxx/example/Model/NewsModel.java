package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.List;
import java.util.Map;
//新闻表数据操作层   写出增删改查功能
public class NewsModel {
    DBUtil db = new DBUtil();
    //查询(包含模糊查询)功能
    public List<Map<String, String>>  getNewsList(String NewsTitle){

        String sql = "";
        if (NewsTitle==null){
            sql = "select * from news";
        }else {
            sql="select * from news where NewsTitle like'%"+NewsTitle+"'";//模糊查询
        }

        List<Map<String, String>> News = db.getList(sql);
        return News;
    }
    //插入功能
    public Boolean addNews(String NewsTitle,String NewsContent,String NewsTime,String NewsGroupID){
        String sql = "insert into news ( NewsTitle, NewsContent, NewsTime, NewsGroupID) values(?,?,?,?)";
        String[] params = { NewsTitle, NewsContent, NewsTime, NewsGroupID};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }
    //删除功能
    public Boolean delNews(String NewsID){
        String sql = "delete from news where NewsID=?";
        String[] params = {NewsID};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }
    //修改功能
    public Boolean updNews(String NewsTitle,String NewsContent,String NewsTime,String NewsGroupID){
        String sql = "update news set NewsTitle=?,NewsContent=?,NewsTime=?,NewsGroupID=? where NewsID=?";
        String[] params = {NewsTitle,NewsContent,NewsTime,NewsGroupID};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }
}
