package Servlet04Cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/s01cookie")
public class Servlet01cookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Cookie的创建
        Cookie cookie = new Cookie("name", "admin");
        //发送Cookie对象
        resp.addCookie(cookie);

    }
}
