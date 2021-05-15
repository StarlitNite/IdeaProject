package Servlet03Response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
/*
* 字节流响应数据
*
* */
@WebServlet(value = "/s03resp")
public class Servlet03resp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //同时设置客户端和服务器端的编码格式
        resp.setContentType("text/html;charset=UTF-8");
//        getOutputStream()  字节输出流(输出一切数据)
        ServletOutputStream outputStream = resp.getOutputStream();

        outputStream.write("你好".getBytes(StandardCharsets.UTF_8));
    }
}
