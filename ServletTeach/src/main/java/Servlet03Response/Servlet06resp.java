package Servlet03Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 重定向 与 请求转发 的区别
*      1.请求转发地址栏不会改变，重定向地址栏会发生改变
*      2.请求转发只有一次请求   重定向有两次请求
*      3.请求转发时request对象可共享，重定向request对象不共享
*      4.请求转发是服务端行为，重定向是客户端行为
*      5.请求转发时的地址只能是站点下（当前项目）的资源，重定向时的地址可以是任意地址
* */
@WebServlet(value = "/s06resp")
public class Servlet06resp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet06...");

        //接收参数
        String username = req.getParameter("username");
        System.out.println("Servlet06 "+username);

       //设置request域对象
        req.setAttribute("password", "123456");

        //请求转发
        //req.getRequestDispatcher("index03resp.jsp").forward(req, resp);

        //重定向
        //resp.sendRedirect("index03resp.jsp");

        //重定向至百度
        //resp.sendRedirect("http://www.baidu.com");

        //请求转发至百度
        req.getRequestDispatcher("http://www.baidu.com").forward(req, resp);
    }
}
