package com.xxxx.example.controller;

import com.xxxx.example.Model.ComModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "DealAddComController", value = "/DealAddComController")
public class DealAddComController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String CommentContent = request.getParameter("CommentContent");
        Date CommentTime = new Date();
        String UserID = request.getParameter("UserID");
        String NewsID = request.getParameter("NewsID");

        ComModel cm = new ComModel();
        Boolean result = cm.addCom(CommentContent, CommentTime, UserID, NewsID);
        if (result){//判断得出结果
            request.getRequestDispatcher("ComController").forward(request, response);
        }else {
            request.setAttribute("msg", "添加评论失败");
            request.setAttribute("path", "返回新闻列表页");
            request.setAttribute("href", "javasrcipt:history.back()");
            request.getRequestDispatcher("result.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
