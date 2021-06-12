package com.xxxx.example.controller;

import com.xxxx.example.Model.NewsGroupModel;
import com.xxxx.example.Model.NewsModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "UpdNews", value = "/UpdNews")
public class UpdNewsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        //前台获取ID
        String NewsID = request.getParameter("NewsID");

//Model获取数据，传给jsp，jsp提交，处理，给结果
        //从model获取数据
        NewsModel nm = new NewsModel();
        NewsGroupModel ngm = new NewsGroupModel();

        Map<String, String> News = nm.getNews(NewsID);//model查询数据
        request.setAttribute("NewsList", News);//News->NewsList

        List<Map<String, String>> NGL= ngm.getNewsGroupList();
        request.setAttribute("NewsGroupList", NGL);
        request.getRequestDispatcher("UpdNews.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
