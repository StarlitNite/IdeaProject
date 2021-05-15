package Servlet03Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 重定向
*
* */
@WebServlet(value = "/s05resp")
public class Servlet05resp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet05...");

        //接收参数
        String username = req.getParameter("username");
        System.out.println("Servlet05 "+username);
    }
}
