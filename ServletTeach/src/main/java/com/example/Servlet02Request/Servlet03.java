package com.example.Servlet02Request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/s03")
public class Servlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*
     * 请求转发跳转
     *   req.getRequestDispatcher(url).forward(req, resp);
     *   可以让请求从服务器端跳转到客户端(或跳转到指定的Servlet)
     *
     *  特点:
     *      1.服务端行为
     *      2.地址栏不会变化
     *      3.从始至终,只有一个请求发出
     * */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        System.out.println("Servlet03 username:"+username);

        //请求转发跳转到Servlet04
        //req.getRequestDispatcher("s04").forward(req, resp); 只能转发一个
        //请求转发跳转到jsp页面
        //req.getRequestDispatcher("Login.jsp").forward(req, resp);
        //请求转发跳转到Http页面
        //req.getRequestDispatcher("Login.html").forward(req, resp);

    }
}
