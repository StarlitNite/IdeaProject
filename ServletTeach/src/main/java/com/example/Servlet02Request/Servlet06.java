package com.example.Servlet02Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/*
* request作用域
*       通过该对象可以在一个请求中传递数据,作用范围:在一次请求中有效,即服务器跳转有效.(请求转发跳转时有效)
*       //设置域对象内容
*
*       //获取域对象内容
*
*       //删除域对象内容
*
*request域对象中的数据在一次请求中有效 经过请求转发 域中数据依旧存在,从5>6>7>8 传递 数据一直存在
* */

@WebServlet(value = "/s06")
public class Servlet06 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet06...");

        //获取域对象内容
        String name = (String) req.getAttribute("username");
        System.out.println("name:"+name);
        Integer Age = (Integer) req.getAttribute("Age");
        System.out.println("Age:"+Age);
        List<String> list = (List<String>) req.getAttribute("list");
        System.out.println(list.get(0));
    }
}
