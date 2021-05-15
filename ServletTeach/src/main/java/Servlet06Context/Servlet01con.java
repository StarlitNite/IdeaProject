package Servlet06Context;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/*
* 获取方法
*   1.通过request获取
*   2.通过session对象获取
*   3.通过ServletConfig对象获取
*   4.在Servlet中直接获取
*
* 常用方法
*   1.获取当前服务器的版本信息
*   2.获取项目的真实路径
*
* */
@WebServlet(value = "/s01con")
public class Servlet01con extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过request获取
        ServletContext servletContext1 = req.getServletContext();
        //通过session对象获取
        ServletContext servletContext2 = req.getSession().getServletContext();
        //通过ServletConfig对象获取
        ServletContext servletContext3 = getServletConfig().getServletContext();
        //直接获取
        ServletContext servletContext4 = getServletContext();
        //常用方法
        //1.获取当前服务器的版本信息
        String serverInfo = req.getServletContext().getServerInfo();
        System.out.println("获取当前服务器的版本信息"+serverInfo);
        //2.获取项目的真实路径
        String realPath = req.getServletContext().getRealPath("/");
        System.out.println("获取项目的真实路径"+realPath);
    }
}
