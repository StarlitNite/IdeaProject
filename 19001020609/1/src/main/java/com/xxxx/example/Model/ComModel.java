package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class ComModel {
    DBUtil db = new DBUtil();
    //增加评论功能
    public Boolean addCom(String CommentContent , Date CommentTime, String UserID, String NewsID){
        String sql = "insert into comment (CommentContent, CommentTime, UserID, NewsID) values(?,?,?,?)";
        String[] params ={CommentContent, String.valueOf(CommentTime),UserID,NewsID};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }
    //删除评论功能
    public Boolean delCom(String CommentID){
        String sql = "delete from comment where CommentID=?";
        String[] params = {CommentID};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }
    //查询评论功能   点开新闻页面，显示该新闻下的所有评论  所以需要新闻ID
    public List<Map<String, String>> getComList(String NewsID){
        String sql = "select * form comment where NewsID=?";
        String[] params = {NewsID};
        List<Map<String, String>> Com = db.getList(sql, params);
        return Com;
    }

}
