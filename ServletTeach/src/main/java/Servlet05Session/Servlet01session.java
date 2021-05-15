package Servlet05Session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/*
* Session对象
*   Session对象的获取
*       req.getSession();
*       当获取Session对象时，会先判断Session对象是否存在，如果存在，则获取Session对象，如果不存在，会创建Session对象
* 常用方法
*   获取Session的会话标识符     getId()
*   获取Session的创建时间       getCreationTime()
*   获取最后一次访问时间         getLastAccessedTime()
*   判断是否是新的Session对象   isNew()
* */
@WebServlet(value = "/s01sess")
public class Servlet01session extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session
        HttpSession session = req.getSession();

        //获取Session的会话标识符
        String id =session.getId();
        System.out.println(id);
        //获取Session的创建时间
        System.out.println(session.getCreationTime());
        //获取最后一次访问时间
        System.out.println(session.getLastAccessedTime());
        //判断是否是新的Session对象
        System.out.println(session.isNew());
    }
}
