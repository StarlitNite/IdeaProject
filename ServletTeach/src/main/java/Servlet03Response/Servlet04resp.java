package Servlet03Response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
* 重定向
*       服务端知道，客户端行为
*       存在两次请求
*       地址栏会发生改变
*       request对象不共享
* */
@WebServlet(value = "/s04resp")
public class Servlet04resp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet04...");

        //接收参数
        String username = req.getParameter("username");
        System.out.println("Servlet04 "+username);

        //重定向到s05resp
        resp.sendRedirect("s05resp");
    }
}
