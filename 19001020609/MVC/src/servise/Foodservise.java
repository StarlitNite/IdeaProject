package servise;

import util.DBUtil;

import java.util.List;
import java.util.Map;

public class Foodservise {
    DBUtil db=new DBUtil();

    public List<Map<String,String>> getFoodList(){
        String sql="select *from food";
        List<Map<String,String>> foods=db.getList(sql);
        return foods;
    }
}
