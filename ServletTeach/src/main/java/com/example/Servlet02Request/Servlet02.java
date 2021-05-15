package com.example.Servlet02Request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(value = "/s02")
public class Servlet02 extends HttpServlet {
    /*
        乱码原因:
    *       由于在解析过程中默认使用的编码方式为ISO-8859-1(此编码不支持中文),所以解析时一定会出现乱码.

     请求乱码问题:
                    Tomcat8及以上版本                                Tomcat7及以下版本
      GET请求         不会乱码                                         new String(req.getParameter("username").getBytes(StandardCharsets.UTF_8))

      POST请求        会乱码,通过设置服务器解析解码的格式                   会乱码,通过设置服务器解析解码的格式
                        req.setCharacterEncoding("UTF-8")           req.setCharacterEncoding("UTF-8")

     乱码情况:
            POST请求: 无论什么版本的服务器,post请求中文都会乱码,(req.setCharacterEncoding("UTF-8"))

     PS:
        1.req.setCharacterEncoding("UTF-8")  只针对POST请求乱码有效
        2.new String(req.getParameter("username").getBytes(StandardCharsets.UTF_8));针对任何请求方式
            但是如果数据本身不乱码,还依然使用 new String()方法转换,则会乱码
    */

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("UTF-8");

        //获取客户端传递的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("姓名："+username);
        System.out.println("密码："+password);

        //解决Tomcat7及以下版本的GET请求乱码
        String name = new String(req.getParameter("username").getBytes(StandardCharsets.UTF_8));
        System.out.println("name:"+username);


    }
}
