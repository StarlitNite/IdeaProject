package servise;

import util.DBUtil;

import java.util.Map;

public class Loginservise {
    DBUtil db=new DBUtil();
    public Boolean login(String un,String pw){
        String sql="select *from user where username=? and password =?";
        String[] params ={un,pw};
        Map<String,String> m=db.getMap(sql,params);
        if(m!=null){
            return true;
        }else {
            return false;
        }
    }

}
