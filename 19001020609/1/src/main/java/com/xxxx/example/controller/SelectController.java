package com.xxxx.example.controller;

import com.xxxx.example.Model.ComModel;
import com.xxxx.example.Model.NewsGroupModel;
import com.xxxx.example.Model.NewsModel;
import com.xxxx.example.Model.UserModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "SelectController", value = "/SelectController")
public class SelectController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        NewsModel nm = new NewsModel();
        NewsGroupModel ngm = new NewsGroupModel();
        UserModel um = new UserModel();
        ComModel cm = new ComModel();

        String NewsTitle = request.getParameter("NewsTitle");
        String UserID = request.getParameter("UserID");
        String NewsID = request.getParameter("NewsID");
        /*String NewsGroup = request.getParameter("NewsGroup");

        System.out.println(NewsGroup);*/
        System.out.println(NewsTitle);
        Map<String, String> News = nm.getOneNews(NewsTitle);//从NewsModel获取
        request.setAttribute("NewsList",News);//News 新闻列表
        Map<String, String> NG = ngm.getOneNewsGroupList();//从NewsGroupModel获取
        request.setAttribute("NewsGroup", NG);//NG 新闻分类列表
        List<Map<String, String>> User = um.getUserList(UserID);
        request.setAttribute("UserList", User);//User 用户
        List<Map<String, String>> Com = cm.getComList(NewsID);//ComModel获取 评论
        request.setAttribute("Coms", Com);//评论
        Map<String, String> New = nm.getANews(NewsID);//
        request.setAttribute("News", New);//
        Map<String, String> CM = um.getMap(UserID);
        request.setAttribute("User", CM);
        request.getRequestDispatcher("Select.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
