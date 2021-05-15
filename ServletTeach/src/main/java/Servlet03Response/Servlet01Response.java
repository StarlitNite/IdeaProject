package Servlet03Response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;


/*
* 响应数据
*       getWriter()     字符输出流(只输出字符串)
*       getOutputStream()  字节输出流(输出一切数据)
*   PS:
*       两者不能同时使用 字符流使用过resp,字节流就不能再使用 反之亦然.
* */
@WebServlet( value = "/s01resp")
public class Servlet01Response extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getWriter()     字符输出流(只输出字符串)
       /* //获取字符输出流
        PrintWriter printWriter = resp.getWriter();
        //输出数据
        printWriter.write("Hello");*/

//        getOutputStream()  字节输出流(输出一切数据)
       /* ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.write("Hi".getBytes(StandardCharsets.UTF_8));*/
    }
}
