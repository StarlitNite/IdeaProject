package com.xxxx.example.controller;

import com.xxxx.example.Model.NewsGroupModel;
import com.xxxx.example.Model.NewsModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 处理新增新闻的操作
 */
@WebServlet(name = "DealAddNewsController", value = "/DealAddNewsController")
public class DealAddNewsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        //获取提交数据
        String NewsTitle = request.getParameter("NewsTitle");
        String NewsContent = request.getParameter("NewsContent");
        String NewsTime = request.getParameter("NewsTime");
        String NewsGroupID = request.getParameter("NewsGroupID");

        /*System.out.println(NewsContent,NewsTime,NewsGroupID,NewsTitle);*/
        //和数据库进行对比
        NewsModel nm = new NewsModel();
        Boolean result = nm.addNews(NewsTitle, NewsContent, NewsTime, NewsGroupID);
        if (result){//判断得出结果
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
