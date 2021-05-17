package com.example.Project609;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(value = "/updUser")
public class updUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");


        String id = request.getParameter("userId");
        //
        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库链接
            String url = "jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false";
            Connection conn = DriverManager.getConnection(url,"root","root");
            //创建用于执行sql语句的语句对象
            Statement stmt = conn.createStatement();
            String sql = "select * from user where id="+id;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                response.getWriter().print("<form action='dealUpdUser' method='post'>");
                response.getWriter().print("用户名：<input type='text' name='username' value='"+rs.getString("username")+"'/><br>");
                response.getWriter().print("密码：<input type='password' name='password' value='"+rs.getString("password")+"'/><br>");
                response.getWriter().print("地址：<input type='text' name='address' value='"+rs.getString("address")+"'/><br>");
                response.getWriter().print("联系方式：<input type='tel' name='tel' value='"+rs.getString("tel")+"'/><br>");
                response.getWriter().print("<input type='submit' value='修改'/><a  type='button' href='GetUsers'/>取消</a>");
                response.getWriter().print("<input type='hidden' name='id' value='"+rs.getInt("id")+"'/>");
                response.getWriter().print("</form>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
