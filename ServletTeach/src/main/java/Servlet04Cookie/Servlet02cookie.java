package Servlet04Cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/*
* Cookie 的获取
*   返回的是Cookie的数组
* */
@WebServlet(value = "/s02cookie")
public class Servlet02cookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Cookie数组
        Cookie[] cookies = req.getCookies();
        //判断Cookie是否为空
        if(cookies != null&&cookies.length>0){
            //遍历cookie数组
            for (Cookie cookie: cookies){
                //获取Cookie的名称和值
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println("Cookie的名称："+name+" Cookie的值："+value);
            }
        }

    }
}
