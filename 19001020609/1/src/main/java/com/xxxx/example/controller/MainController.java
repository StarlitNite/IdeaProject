package com.xxxx.example.controller;

import com.xxxx.example.Model.NewsGroupModel;
import com.xxxx.example.Model.NewsModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "MainController", value = "/MainController")
public class MainController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        NewsModel nm = new NewsModel();
        NewsGroupModel ngm = new NewsGroupModel();

        String NewsTitle = request.getParameter("NewsTitle");
        String NewsGroup = request.getParameter("NewsGroup");

        List<Map<String, String>> News = nm.getNewsList(NewsTitle);//从NewsModel获取
        request.setAttribute("NewsList",News);//News 新闻列表
        List<Map<String, String>> NG = ngm.NewsGroupList(NewsGroup);//从NewsGroupModel获取
        request.setAttribute("NewsGroupList", NG);//NG 新闻分类列表
        request.getRequestDispatcher("Main.jsp").forward(request, response);//传值给Main.jsp ,管理员管理
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
