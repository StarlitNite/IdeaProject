package servise;

import util.DBUtil;

import java.util.List;
import java.util.Map;

public class FoodTypeservise {
    DBUtil db=new DBUtil();
    public List<Map<String,String>> getFoodTypeList(){
        String sql="select * from foodtype";
        List<Map<String,String>>  typelist=db.getList(sql);
        return typelist;
    }
}
