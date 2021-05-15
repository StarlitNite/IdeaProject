package Servlet05Session02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/*
* Session域对象
*   setAttribute（）     设置域对象
*   getAttribute（）     获取域对象
*   removeAttribute（）  移除域对象
*
*   请求转发
*       一次请求
*       request作用域有效
*       session作用域有效
*   重定向
*       两次请求
*       request作用域有效
*       session作用域有效
*
* */
@WebServlet(value = "/s05session02")
public class Servlet05Session02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Session对象

        HttpSession session = req.getSession();

        //设置域对象
        session.setAttribute("username", "admin1");
        session.setAttribute("password", "admin1");

        //移除域对象
        session.removeAttribute("password");

        /*request域对象*/
        req.setAttribute("name", "zhangsan");

        //请求转发跳转到jsp页面
        //req.getRequestDispatcher("index05Session.jsp").forward(req, resp);

        //重定向
        resp.sendRedirect("index05Session.jsp");
    }
}
