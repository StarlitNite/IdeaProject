package com.example.LoginRegister;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;

@WebServlet( value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //登陆
        response.setHeader("content-type","text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        //String ID = request.getParameter("ID");
        String username = request.getParameter("username");
        System.out.println(username);
        String password = request.getParameter("password");
        try {
            Database database = new Database("root","root");
            UserData userData = database.check(username,password);
            database.close();
            if (userData == null){
                printWriter.write("账号密码不正确！");
            }else{
                printWriter.write("欢迎"+userData.getUsername());
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
