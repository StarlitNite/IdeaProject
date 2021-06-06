package com.example.Project609.FoodType;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "AddFoodType", value = "/AddFoodType")
public class AddFoodType extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String TypeName = request.getParameter("TypeName");
        //
        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库链接
            String url = "jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false";
            Connection conn = DriverManager.getConnection(url,"root","root");
            //创建用于执行sql语句的语句对象
            Statement stmt = conn.createStatement();
            String sql = "insert into foodtype(typename) values('"+TypeName+"')";
            int rs = stmt.executeUpdate(sql);
            if (rs == 0){
                response.getWriter().println("添加失败");
                response.getWriter().print("<input type='button' value='取消' onclick='location.href='AddFoodType''>");
            }else {
                response.getWriter().println("添加成功！");
                /*response.getWriter().println("");*/
                response.sendRedirect("FoodTypeList");
            }

            stmt.close();
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
