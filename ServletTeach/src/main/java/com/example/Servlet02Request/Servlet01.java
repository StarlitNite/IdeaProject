package com.example.Servlet02Request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet01", value = "/s01")
public class Servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*常用方法*/
//        获取请求时的完整路径（从HTTP开始，到？前结束
            String url = req.getRequestURL()+"";
        System.out.println("获取请求时的完整路径："+url);
        //获取请求时的部分路径（从项目站点名开始，到？前结束）
            String uri = req.getRequestURI()+"";
        System.out.println("获取请求时的部分路径"+uri);
        //获取请求时的参数字符串（从"？"后面开始，到最后的字符串）
            String queryString = req.getQueryString();
        System.out.println("获取请求时的参数字符串："+queryString);
        //获取请求方式（GET和POST）
            String method = req.getMethod();
        System.out.println("获取请求方式；"+method);
        //获取当前协议版本（HTTP/1.1）
            String protocol = req.getProtocol();
        System.out.println("获取当前协议版本；"+protocol);
        //获取项目站点名（项目对外的访问路径）
            String webapp = req.getContextPath();
        System.out.println("获取项目的站点名；"+webapp);


        /*获取请求的参数*/

        //获取指定名称的参数值，返回字符串（重点！！！）
        String username = req.getParameter("username");//括号内的值，必须和传入参数的名字相同  最重要的方法！！！！
        String password = req.getParameter("password");//无论前台传递的是什么类型，后台接收到的全部是字符串
        System.out.println("username:"+username+" password:"+password);

        //获取指定名称的参数的所有参数值，返回字符串数组（用于复选框传值）
        String[] hobbys = req.getParameterValues("hobby");
        //判断数组是否为空（建议养成习惯）
        if (hobbys != null && hobbys.length > 0){
            for (String hobby:hobbys){
                System.out.println("爱好："+hobby);
            }
        }
    }
}
