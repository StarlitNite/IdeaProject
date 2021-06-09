package com.xxxx.example.controller;

import com.xxxx.example.Model.UserModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "UserController", value = "/UserController")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //从UserModel中获取数据
        UserModel User = new UserModel();
        String UserName =(String) request.getSession().getAttribute("UserName");
        System.out.println("un=="+UserName);
        Map<String,String> user = User.getUserMap(UserName);
        request.setAttribute("user", user);
        System.out.println("user=="+user.get("UserName"));
        //请求转发到User.jsp中
        /*request.getRequestDispatcher("Main.jsp").forward(request,response);*/
        request.getRequestDispatcher("User.jsp").forward(request,response);

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
    }
}
