/*
package com.example.WuXinghao609;

import java.sql.*;

public class DataBase {
    Connection connection;
    public DataBase(String username,String password) throws ClassNotFoundException, SQLException {
        //第一步：加载数据库驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //第二步：获取数据库连接
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false","root","root");
        */
/*//*
/第三步：创建用于执行sql语句的语句对象
        Statement statement = connection.createStatement();
        //第四步：创建sql语句
        String sql = "select * from user";
        //第五步：执行sql语句
        ResultSet rs = statement.executeQuery(sql);
        //第六步：处理结果
        while (rs.next()){

        }
        //第七步：关闭JDBC对象*//*





        */
/*try {//加载MySql驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("找不到驱动程序类，加载驱动失败！");
            e.printStackTrace();
        }

        //连接MySql数据库
        String url ="jdbc:mysql://localhost:3306/meal";
        String DUsername = "root";
        String DPassword = "root";

        try {
            this.connection = DriverManager.getConnection(url,DUsername,DPassword);
        }catch (SQLException e){
            System.out.println("数据库连接失败！");
            e.printStackTrace();
        }*//*


    }
}
*/
