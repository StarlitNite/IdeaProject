package com.xxxx.example.controller;

import com.xxxx.example.Model.ComModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DelComController", value = "/DelComController")
public class DelComController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String CommentID = request.getParameter("CommentID");

        ComModel cm = new ComModel();
        Boolean result = cm.delCom(CommentID);
        if (result){
            request.getRequestDispatcher("NewsController").forward(request, response);
        }else {
            request.setAttribute("msg", "删除评论失败");
            request.setAttribute("path", "返回新闻页面");
            request.setAttribute("href", "javasrcipt:history.back()");
            request.getRequestDispatcher("result.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
