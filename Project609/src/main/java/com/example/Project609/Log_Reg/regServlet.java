package com.example.Project609.Log_Reg;

import util.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(value = "/regServlet")
public class regServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //获取用户名和密码
        String UserName = request.getParameter("username");
        String PassWord = request.getParameter("password");
        String Tel = request.getParameter("tel");
        String Address = request.getParameter("address");
        DBUtil db = new DBUtil();
        String[] params = {UserName,PassWord,Tel,Address};
        int result = db.update("insert into user(username,password,tel,address)values(?,?,?,?)",params);

        if (result == 0){
            response.sendRedirect("reg.jsp");
        }else {
            /*response.sendRedirect("DataBaseSer");*/
            System.out.println("成功了！");
        }
       /* //连接数据库
        try {
            //第一步 加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //第二步 获取数据库连接
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false","root","root");
            //第三步 创建用于执行sql语句的语句对象
           *//* Statement statement =conn.createStatement();*//*
            //第四步 创建sql语句
            //String sql = "select * from user";
            *//*String sql1 = "insert into user(username,password,tel,address,ident)values('"+UserName+"','"+PassWord+"','"+Tel+"','"+Address+"','0')"; *//*
            String sql ="insert into user(username,password,tel,address,ident) values(?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement( sql);
            preparedStatement.setString(1, UserName);
            preparedStatement.setString(2, PassWord);
            preparedStatement.setString(3, Tel);
            preparedStatement.setString(4, Address);
            preparedStatement.setString(5, "0");
            //第五步 执行sql语句
            //int result = statement.executeUpdate(sql1);//insert,delete,update 用Update  select用Query
            int result = preparedStatement.executeUpdate();
            //第六步
            if (result == 0){
                response.sendRedirect("reg.jsp");
            }else {
                *//*response.sendRedirect("DataBaseSer");*//*
                System.out.println("成功了！");
            }
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
