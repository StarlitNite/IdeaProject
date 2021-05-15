package Servlet04Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* Cookie 到期时间
*
* */


@WebServlet(value = "/s03cookie")
public class Servlet03cookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*到期时间：负整数（默认值-1，表示只在浏览器内存中存活，关闭浏览器失效）*/
        Cookie cookie = new Cookie("username0", "zhangsan");
        cookie.setMaxAge(-1);//关闭浏览器失效
        resp.addCookie(cookie);
        /*到期时间：正整数（表示存活指定秒数，将数据存在磁盘中）*/
        Cookie cookie1 = new Cookie("username1", "lisa");
        cookie.setMaxAge(30);//存活30秒
        resp.addCookie(cookie1);
        /*到期时间：零（表示删除Cookie）*/
        Cookie cookie2 = new Cookie("username2", "wuhu");
        cookie.setMaxAge(0);//删除Cookie
        resp.addCookie(cookie2);
    }
}
