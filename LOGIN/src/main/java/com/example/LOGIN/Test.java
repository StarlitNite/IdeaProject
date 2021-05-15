package com.example.LOGIN;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database database = new Database("root","root");
        database.showConnect();

//        ArrayList<UserData> userlist1 = database.getAllUser();
//        System.out.println("Before:"+userlist1.size());
//       // database.insert("4","admin4","1234567","2625421530@qq.com");
//       database.insert("8","admin8","8",null);
//        database.insert("5","admin5","admin5",null);
//        UserData Userdata1 = database.getUser("4");
//        database.Delete("4");
//        UserData Userdata2 = database.getUser("4");
//        System.out.println(Userdata1);
//        System.out.println(Userdata2);
//        ArrayList<UserData> userlist2 = database.getAllUser();
//        System.out.println("Before:"+userlist2.size());
//        for(UserData each:userlist2){
//            System.out.println(each.getID()+" "+each.getUsername());
//        }
//        System.out.println();
//        UserData userData = database.check("1","1");
//        if(userData == null){
//            System.out.println("用户名不存在或密码错误");
//        }else{
//            System.out.println("欢迎你"+userData.getUsername());
//        }
    }
}
