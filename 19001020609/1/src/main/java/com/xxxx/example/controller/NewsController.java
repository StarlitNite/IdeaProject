package com.xxxx.example.controller;

import com.xxxx.example.Model.NewsModel;
import com.xxxx.example.Model.NewsGroupModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "NewsController", value = "/NewsController")
public class NewsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //管理员  管理界面是新闻 和 新闻分类
        //获取新闻列表
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        NewsModel nm = new NewsModel();
        NewsGroupModel ngm = new NewsGroupModel();

        String NewsTitle = request.getParameter("NewsTitle");
        String NewsGroup = request.getParameter("NewsGroup");

        List<Map<String, String>> News = nm.getNewsList(NewsTitle);//从NewsModel获取
        request.setAttribute("NewsList",News);//News 新闻列表
        List<Map<String, String>> NG = ngm.NewsGroupList(NewsGroup);//从NewsGroupModel获取
        request.setAttribute("NewsGroupList", NG);//NG 新闻分类列表
        request.getRequestDispatcher("AdUser.jsp").forward(request, response);//传值给AdUser ,管理员管理
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
