package Servlet03Response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
/*字符流响应数据*/
@WebServlet(name = "Servlet02resp", value = "/s02resp")
public class Servlet02resp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        //设置服务端编码格式
//        resp.setCharacterEncoding("UTF-8");
//
//        //设置客户端的编码格式
//        resp.setHeader("content-type", "text/html:charset=UTF-8");
//        //总结：设置客户端和服务器端的编码都支持中文，且保持一致；

        //同时设置客户端和服务器端的编码格式
        resp.setContentType("text/html;charset=UTF-8");

//        getWriter()     字符输出流(只输出字符串)
        //获取字符输出流
        PrintWriter printWriter = resp.getWriter();
        //输出数据
        printWriter.write("<h2>你好</h2>");

    }
}
