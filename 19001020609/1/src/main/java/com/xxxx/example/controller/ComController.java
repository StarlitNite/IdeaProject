package com.xxxx.example.controller;

import com.xxxx.example.Model.ComModel;
import com.xxxx.example.Model.NewsModel;
import com.xxxx.example.Model.UserModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ComController", value = "/ComController")
public class ComController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        UserModel um = new UserModel();
        NewsModel nm = new NewsModel();
        ComModel cm = new ComModel();

        String NewsID = request.getParameter("NewsID");
        String UserID = request.getParameter("UserID");
        System.out.println(NewsID);

        /*一个新闻，所有用户，所有评论*/
        Map<String, String> News = nm.getANews(NewsID);
        request.setAttribute("News", News);
        List<Map<String, String>> Com = cm.getComList(NewsID);
        request.setAttribute("Coms", Com);
        List<Map<String, String>> User = um.getUserList(UserID);
        request.setAttribute("User", User);
        request.getRequestDispatcher("Select.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
