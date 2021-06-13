package com.xxxx.example.controller;

import com.xxxx.example.Model.NewsGroupModel;
import com.xxxx.example.Model.NewsModel;
import com.xxxx.example.Model.UserModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 添加新闻功能
 */
@WebServlet(name = "AddNewsController", value = "/AddNewsController")
public class AddNewsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        NewsGroupModel ngm = new NewsGroupModel();
        List<Map<String, String>> NGL= ngm.getNewsGroupList();
        request.setAttribute("NewsGroupList", NGL);
        request.getRequestDispatcher("addNews.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
