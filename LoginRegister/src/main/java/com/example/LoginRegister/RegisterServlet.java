package com.example.LoginRegister;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取session
        HttpSession session = request.getSession();
        //获取SessionID
        String sid = session.getId();
        System.out.println(sid);
        //注册
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-type","text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        String name = request.getParameter("username");
        //System.out.println(name);
        String id = request.getParameter("ID");
        String password1 = request.getParameter("password");
        String password2 = request.getParameter("repassword");
        String email = request.getParameter("email");

        if (password1.equals(password2)){
            try {
             Database database = new Database("root","root");
             database.insert(id,name,password1,email);
             database.close();
             printWriter.write("注册成功！");
            } catch (ClassNotFoundException|SQLException e) {
                e.printStackTrace();
                printWriter.write("注册失败！");
            }
        }else {
            printWriter.write("两次密码不一致！");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
