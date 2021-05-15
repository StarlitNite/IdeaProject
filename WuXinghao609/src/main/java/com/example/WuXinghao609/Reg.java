package com.example.WuXinghao609;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/Reg")
public class Reg extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取session
        HttpSession session = request.getSession();
        //获取SessionID
        String sid = session.getId();
        System.out.println(sid);

        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //获取前台数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String edu = request.getParameter("edu");
        String introduce = request.getParameter("introduce");
        String tel = request.getParameter("tel");
        String address = request.getParameter("address");
        response.getWriter().println("用户名是"+username);
        System.out.println("用户名："+username+"密码"+password+"性别"+sex+edu+"自我介绍"+introduce+"电话"+tel+"地址"+address);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
