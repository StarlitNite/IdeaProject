package com.example.WuXinghao609;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieServlet", value = "/CookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");


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
            response.getWriter().println("欢迎"+un);
        }
        if(un == null||un.contentEquals("")) {
            response.sendRedirect("cookie.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
