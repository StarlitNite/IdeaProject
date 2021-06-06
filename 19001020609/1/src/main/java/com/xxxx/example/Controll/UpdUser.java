package com.xxxx.example.Controll;

import Util.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdUser", value = "/UpdUser")
public class UpdUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String UserName = request.getParameter("UserName");
        String UserPassword = request.getParameter("UserPassword");
        String UserTel = request.getParameter("UserTel");

        DBUtil db = new DBUtil();
        String[] params ={UserName,UserPassword,UserTel};

        int result = db.update("update user set UserName=?,UserPassword=?,UserTel=?",params);
        if (result == 0){
            response.getWriter().println("修改失败");
        }else {
            response.getWriter().println("修改成功！");
        }
        response.getWriter().print("<a href='User'>返回用户列表页面</a>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
