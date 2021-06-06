package com.example.Project609.FoodType;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "FoodTypeList", value = "/FoodTypeList")
public class FoodTypeList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库链接
            String url = "jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&useSSL=false";
            Connection conn = DriverManager.getConnection(url,"root","root");
            Statement statement =conn.createStatement();
            String sql = "select * from foodtype";
            ResultSet rs = statement.executeQuery(sql);
            response.getWriter().print("<table border='1px'>");
            response.getWriter().print("<tr><th>序号</th><th>菜品分类</th><th>操作</th></tr>");
            int i=1;
            while (rs.next()){
                response.getWriter().print("<tr>");
                response.getWriter().print("<td>"+i+"</td>");
                response.getWriter().println("<td>"+rs.getString("typename")+"</td>");
                response.getWriter().print("<td><a href='FoodType?id="+rs.getInt("id")+"'>修改</a>&nbsp;<a href='delUser?userId="+rs.getInt("id")+"'>删除</a></td>");

                response.getWriter().print("</tr>");
                i++;
            }
            response.getWriter().print("</table>");
           /* response.getWriter().print("<input type='button' value='添加菜品分类' onclick='location.href='AddFoodType''>");*/
            response.getWriter().print("<a href=‘AddFoodType.html‘>添加菜品分类</a>");//跳转到AddFoodType.html未实现
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
