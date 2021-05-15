package Servlet04Cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/*
* Cookie的注意点
*   1.Cookie只在当前浏览器中有效（不跨浏览器和电脑）
*   2.Cookie不能存中文
*       一定要存中文时，需要通过 URLEncoder.encode()方法进行编码，获取时通过URLDecoder.decode进行解码
*   3.如果出现同名的Cookie对象，则会覆盖。
*   4.Cookie的存储数量是有上限的，不同浏览器的上限不同，Cookie存储的大小是有限的，在4KB左右
* */
@WebServlet(value = "/s04cookie")
public class Servlet04cookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Cookie存中文
        String name = "姓名";
        String value = "张三";

        //将中文通过URLEncoder进行编码
        name = URLEncoder.encode(name);
        value = URLEncoder.encode(value);

        //创建Cookie对象
        Cookie cookie = new Cookie(name, value);
        //响应Cookie
        resp.addCookie(cookie);

        //获取Cookie时，通过URLDncoder进行解码
        Cookie[] cookies = req.getCookies();
        //判断非空
        if(cookies != null && cookies.length>0){
            //遍历
            for (Cookie cook:cookies){
                //解码
                System.out.println(URLDecoder.decode(cook.getName()));
                System.out.println(URLDecoder.decode(cook.getValue()));
            }
        }

        //将原来已有的Cookie对象重新设置
        Cookie cookie2 = new Cookie("name", "zhangsan");
        resp.addCookie(cookie2);

    }
}
