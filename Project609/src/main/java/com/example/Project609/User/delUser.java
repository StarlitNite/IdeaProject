package com.example.Project609.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "delUser", value = "/delUser")
public class delUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码方式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //获取数据库数据
        String userId = request.getParameter("userId");//DataBaseSer 42行 保持一致
        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库连接
            String url = "jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false";
            Connection conn = DriverManager.getConnection(url,"root","root");
            Statement statement = conn.createStatement();
            String sql = "delete from user where id="+userId;
            int result = statement.executeUpdate(sql);

           /* PreparedStatement preparedStatement = conn.prepareStatement(sql);*/
            if (result == 0){
                response.getWriter().println("删除失败！");
            }else {
                response.getWriter().println("删除成功！");
            }
            response.getWriter().print("<a href='DataBaseSer'>返回用户列表页面</a>");

            //关闭,用了什么关什么
            statement.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
