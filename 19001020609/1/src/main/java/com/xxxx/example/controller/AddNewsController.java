package com.xxxx.example.controller;

import com.xxxx.example.Model.NewsModel;
import com.xxxx.example.Model.UserModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddNewsController", value = "/AddNewsController")
public class AddNewsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String NewsTitle = request.getParameter("NewsTitle");
        String NewsContent = request.getParameter("NewsContent");
        String NewsTime = request.getParameter("NewsTime");
        String NewsGroupID = request.getParameter("NewsGroupID");

        NewsModel nm = new NewsModel();
        Boolean result = nm.addNews( NewsTitle, NewsContent, NewsTime, NewsGroupID);
        if (result){
            request.getRequestDispatcher("NewsController").forward(request, response);
        }else {
            request.setAttribute("msg", "添加新闻失败");
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
