package com.example.Servlet02Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*
* request作用域
*       通过该对象可以在一个请求中传递数据,作用范围:在一次请求中有效,即服务器跳转有效.(请求转发跳转时有效)
*       //设置域对象内容
*       req.setAttribute(String name,Object value);
*       //获取域对象内容
*        req.getAttribute(String name);
*       //删除域对象内容
*        req.removeAttribute(String name);
*
* */

@WebServlet(value = "/s05")
public class Servlet05 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet05...");

        //设置域对象内容
        request.setAttribute("username", "admin");
        request.setAttribute("Age", 18);
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        request.setAttribute("list", list);

        //请求转发跳转到Servlet06
        //req.getRequestDispatcher("s06").forward(req, resp);
        //请求转发跳转到jsp,并通过域对象传递数据
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
