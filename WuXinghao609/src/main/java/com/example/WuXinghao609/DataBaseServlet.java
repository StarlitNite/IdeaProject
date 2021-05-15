package com.example.WuXinghao609;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "DataBaseServlet", value = "/DataBaseServlet")
public class DataBaseServlet extends HttpServlet {
    private Connection connection;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try {
            //第一步：加载数据库驱动
                Class.forName("com.mysql.cj.jdbc.Driver");
            //第二步：获取数据库连接
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false","root","root");
            //第三步：创建用于执行sql语句的语句对象
            Statement statement = connection.createStatement();
            //第四步：创建sql语句
            String sql = "select * from user";
            //第五步：执行sql语句
            ResultSet rs = statement.executeQuery(sql);
            //第六步：处理结果
            while (rs.next()){
                response.getWriter().println("用户名："+rs.getString("username")+"&nbsp;");
                response.getWriter().println("密码"+rs.getString("password")+"&nbsp");
                response.getWriter().println("地址"+rs.getString("address")+"<br/>");
            }
            //第七步：关闭JDBC对象
            rs.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
