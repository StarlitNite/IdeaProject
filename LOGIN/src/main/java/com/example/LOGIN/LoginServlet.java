package com.example.LOGIN;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    response.setHeader("cotent-type","text/html;charset=utf-8");
    PrintWriter printWriter = response.getWriter();
    String id = request.getParameter("ID");
    String password = request.getParameter("password");
        try {
            Database database = new Database("root","root");
            UserData userData =database.check(id,password);
            database.close();
            if (userData == null){
                printWriter.write("账户不存在！");
            }else{
                printWriter.write("欢迎！"+userData.getUsername());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

