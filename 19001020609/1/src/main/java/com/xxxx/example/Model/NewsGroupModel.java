package com.xxxx.example.Model;

import Util.DBUtil;

import java.util.List;
import java.util.Map;

public class NewsGroupModel {
    DBUtil db=new DBUtil();
    public List<Map<String,String>> NewsGroupList(String NewsGroup){//这点改掉，然后NewsController那块儿也得改掉

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
    public Boolean addNewsGroup(String NewsGroup){
        String sql = "insert into newsgroup(NewsGroup) values(?)";
        String[] params = {NewsGroup};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }
    //删除功能
    public Boolean delNewsGroup(String NewsGroupID){
        String sql = "delete from news where NewsGroupID=?";
        String[] params = {NewsGroupID};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }

    public List<Map<String,String>> getNewsGroupList(){//这点改掉，然后NewsController那块儿也得改掉
        String sql="select * from NewsGroup";
        List<Map<String,String>>  NG0=db.getList(sql);
        return NG0;
    }
}
