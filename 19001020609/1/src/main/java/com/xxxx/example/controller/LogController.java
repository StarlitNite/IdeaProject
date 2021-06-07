package com.xxxx.example.controller;

import com.xxxx.example.Model.LogModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogController", value = "/LogController")
public class LogController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //获取用户名和密码
        String UserName = request.getParameter("UserName");
        String Password = request.getParameter("Password");

        //与数据库中数据比较
        LogModel lm = new LogModel();
        Boolean result = lm.login(UserName, Password);
        if(result){
            if(UserName.equals("admin")){//如果用户名为admin则为管理员
                request.getRequestDispatcher("").forward(request, response);//跳转到管理界面
            }else {//否则就是普通用户
                request.getRequestDispatcher("Main.jsp").forward(request, response);//跳转到主页面
            }
            /*request.setAttribute("result",result);*/
        }else {
            response.getWriter().println("登录失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
