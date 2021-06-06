package org.example.Service;

import Util.DBUtil;

import java.util.List;
import java.util.Map;

public class foodTypeService {

    DBUtil db = new DBUtil();

    public List<Map<String, String>> getFoodTypeList(){
        String sql = "select * from foodtype";
        List<Map<String, String>>  typeList = db.getList(sql);

        return typeList;
    }
}
