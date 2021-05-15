package com.example.LOGIN;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    //doGet()在get请求时使用
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Servlet2 的doGet方法");
        //也可以使用
//        ServletConfig servletConfig = getServletConfig();
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("content-type", "text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        String name = req.getParameter("username");
        String id = req.getParameter("ID");
        String password1 = req.getParameter("password1");
        String password2 = req.getParameter("password2");
        String email = req.getParameter("email");

        if (password1.equals(password2)) {
            try {
                Database database = new Database("root", "root");
                database.insert(id, name, password1, email);
                database.close();
                printWriter.write("注册成功！");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                printWriter.write("注册失败！");
            }

        } else {

            printWriter.write("两次密码不一致！");
        }
    }

    //doPost()在post请求时使用
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
