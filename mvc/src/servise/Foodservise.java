package servise;

import util.DBUtil;

import java.util.List;
import java.util.Map;

public class Foodservise {//数据库一张表 对应一个service
    DBUtil db=new DBUtil();

    public List<Map<String,String>> getFoodList(String foodname){

        String sql = "";
        if (foodname == null){
            sql="select *from food";
        }else {
            sql="select * from food where foodname like'%"+foodname+"'";//模糊查询
        }

        List<Map<String,String>> foods=db.getList(sql);
        return foods;
    }

    //插入功能
    public Boolean addFood(String foodname,String feature,String material,String type,String price,String hits,String comment,String picture){
        String sql = "insert into food (foodname,feature,material,type,price,hits,comment) values(?,?,?,?,?,?,?,?)";
        String[] params = {foodname,feature,material,type,price,hits,comment,picture};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }
    //删除功能
    public Boolean delFood(String foodId){
        String sql = "delete from food where id=?";
        String[] params = {foodId};
        int result = db.update(sql, params);
        if (result==0){
            return false;
        }else {
            return true;
        }
    }
}
