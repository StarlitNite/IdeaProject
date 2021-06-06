package com.xxxx.example.Controll;

import Util.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DelUser", value = "/DelUser")
public class DelUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //获取用户ID
        String UserId = request.getParameter("UserId");
        //删除用户
        DBUtil db = new DBUtil();
        int result = db.update("delete * from user where id="+UserId);
        if (result == 0){
            response.getWriter().println("删除失败！");
        }else {
            response.getWriter().println("删除成功！");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response );
    }
}
