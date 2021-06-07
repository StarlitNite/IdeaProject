package com.xxxx.example.controller;

import com.xxxx.example.Model.RegModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegController", value = "/RegController")
public class RegController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String UserName = request.getParameter("UserName");
        String Password = request.getParameter("Password");
        String Tel = request.getParameter("Tel");
        String Ident = request.getParameter("Ident");

        //与数据库中数据做比较
        RegModel rm = new RegModel();
        Boolean result = rm.Reg(UserName,Password,Tel, Ident);
        if (result){
            request.getRequestDispatcher("Log.jsp").forward(request, response);
        }else {
            response.getWriter().println("注册失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
