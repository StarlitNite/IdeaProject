/*
package com.example.Project609;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "DataBaseServlet", value = "/DataBaseServlet")
public class DataBaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //连接数据库
        try {
            //第一步
            Class.forName("com.mysql.cj.jdbc.Driver");
            //
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false","root","root");
            //
            Statement statement =conn.createStatement();
            //
            String sql = "select * from user";
            String sql1 = "insert into user(username,password,tel,address)values(";
            //

        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
*/
