package com.xxxx.example.controller;

import com.xxxx.example.Model.NewsModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "delNews", value = "/delNews")
public class DelNewsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String NewsID = request.getParameter("NewsID");
        NewsModel nm = new NewsModel();
        Boolean result = nm.delNews(NewsID);
        if (result){
            request.getRequestDispatcher("NewsController").forward(request, response);
        }else {
            request.setAttribute("msg", "删除新闻失败");
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
