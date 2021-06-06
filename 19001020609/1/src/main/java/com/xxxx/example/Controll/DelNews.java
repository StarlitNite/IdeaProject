package com.xxxx.example.Controll;

import Util.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DelNews", value = "/DelNews")
public class DelNews extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //获取新闻ID
        String NewsID = request.getParameter("NewsID");
        //进行删除操作
        DBUtil db = new DBUtil();
        int result = db.update("delete * from news where id="+NewsID);
        if (result == 0){
            response.getWriter().println("删除失败！");
        }else {
            response.getWriter().println("删除成功！");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
    }
}
