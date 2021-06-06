package com.example.Project609.User;

import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Map;

@WebServlet(name = "DataBaseSer", value = "/DataBaseSer")
public class DataBaseSer extends HttpServlet {
    //数据库查询
    private Connection connection;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        DBUtil db = new DBUtil();
        List<Map<String, String>>users = db.getList("select * form user");
        for (Map<String, String> m:users){
            response.getWriter().print("用户名："+m.get("username")+"<br/>");
        }
       /* try {
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
            response.getWriter().print("<table border='1px'>");
            response.getWriter().print("<tr><th>序号</th><th>用户名</th><th>密码</th><th>地址</th><th>电话</th><th>操作</th></tr>");
            int i = 1;
            while (rs.next()){
                response.getWriter().print("<tr>");
                response.getWriter().print("<td>"+i+"</td>");
                response.getWriter().println("<td>"+rs.getString("username")+"</td>");
                response.getWriter().println("<td>"+rs.getString("password")+"</td>");
                response.getWriter().println("<td>"+rs.getString("address")+"</td>");
                response.getWriter().println("<td>"+rs.getString("tel")+"</td>");
                response.getWriter().print("<td><a href='updUser?userId="+rs.getInt("id")+"'>修改</a>&nbsp;<a href='delUser?userId="+rs.getInt("id")+"'>删除</a></td>");

                response.getWriter().print("</tr>");
                i++;
            }
            response.getWriter().print("</table>");
            //第七步：关闭JDBC对象
            rs.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }*/

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
