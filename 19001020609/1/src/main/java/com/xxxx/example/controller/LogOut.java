package com.xxxx.example.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 退出功能
 */
@WebServlet(name = "LogOut", value = "/LogOut")
public class LogOut extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // 干掉cookie和session
            HttpSession session = request.getSession();
            session.removeAttribute("user");

            Cookie[] cookies = request.getCookies();
            if (cookies != null && cookies.length > 0) {
                for (Cookie c : cookies) {
                    if ("autoLogin".equals(c.getName())) {
                        //设置cookie存活时间为0
                        c.setMaxAge(0);
                        //将cookie响应到前台
                        response.addCookie(c);
                        break;
                    }
                }
            }
            // 重定向到首页
            response.sendRedirect(request.getContextPath() + "/Main.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
