package com.example.WuXinghao609;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取前台数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        if (username.equals("zhangsan")&&password.equals("123")){
            response.getWriter().println("登录成功！欢迎 "+username);
            response.sendRedirect("User_index609.html");
        }else{
            response.getWriter().println("登陆失败！");
        }

//        PrintWriter writer= response.getWriter();
//        writer.println("username"+username);
//        writer.println("password"+password);

        //coookie
        String un = request.getParameter("username");
        if(un == null || un.equals("")) {
            Cookie[] cookies = request.getCookies();
            if(cookies !=null) {
                for(Cookie c:cookies) {
                    if(c.getName().equals("autoLogin")) {
                        un=c.getValue()	;
                        response.getWriter().println("欢迎回来"+un);
                    }
                }
            }
        }
        else {
            Cookie c=new Cookie("autoLogin",un);
            c.setMaxAge(60);
            response.addCookie(c);
            /*response.getWriter().println("欢迎"+un);*/
        }
        if(un == null||un.contentEquals("")) {
            response.sendRedirect("cookie.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
        }
}
