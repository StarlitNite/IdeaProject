package com.xxxx.example.controller;

import com.xxxx.example.Model.UserModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "UserController", value = "/UserController")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //从UserModel中获取数据
        UserModel User = new UserModel();
        String UserName = request.getParameter("UserName");

        List<Map<String, String>> user = User.getUserList(UserName);
        request.setAttribute("User", user);

        //请求转发到User.jsp中
        request.getRequestDispatcher("User.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
    }
}
