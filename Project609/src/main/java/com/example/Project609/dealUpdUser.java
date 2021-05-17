package com.example.Project609;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(value = "/dealUpdUser")
public class dealUpdUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String un = request.getParameter("username");
        String pw = request.getParameter("password");
        String address = request.getParameter("address");
        String tel = request.getParameter("tel");
        String id = request.getParameter("id");


        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库链接
            String url = "jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false";
            Connection conn = DriverManager.getConnection(url,"root","root");
            //创建用于执行sql语句的语句对象

            String sql = "update user set username=?,password=?,address=?,tel=? where id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,un);
            statement.setString(2, pw);
            statement.setString(3, address);
            statement.setString(4, tel);
            statement.setString(5, id);

            int result = statement.executeUpdate();
            if (result == 0){
                response.getWriter().println("修改失败");
            }else {
                response.getWriter().println("修改成功！");
            }

            response.getWriter().print("<a href='DataBaseSer'>返回用户列表页面</a>");

            conn.close();
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
