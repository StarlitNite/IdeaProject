package Servlet05Session02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/*
* Session对象的销毁
*       1.默认到期时间
*           Tomcat中session默认存活时间为30min，即不操作页面的时间，一旦有操作，session会重新计算时间。
*           可以在Tomcat中的conf目录下的web.xml 文件中进行修改。
*           <!-- session默认的最大不活动时间。 单位：分钟-->
            <session-config>
            *       <session-timeout>30</session-timeout>
            <session-config>
        2.手动设置到期时间
        *   可以在程序中自己设定session的生命周期，
        *   通过session.setMaxInactiveInterval(int) 来设定session的最大不活动时间，单位为秒。
        *   可以通过getMaxInactiveInterval（）方法来查看当前Session对象的最大不活动时间。
        3.立即销毁
        *   session.invalidate()方法让session立刻失效
        4.关闭浏览器失效
        *   session底层依赖cookie对象，cookie对象只在浏览器内核中存活，关闭浏览器立即失效
        5.关闭服务器失效
        *   关闭服务器，session销毁。
* */
@WebServlet(value = "/s05Session03")
public class Servlet05Session03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*Session域对象*/
        //获取session对象
        HttpSession httpSession = req.getSession();
        //设置session域对象
        httpSession.setAttribute("username", "admin");

       /* //Session对象的最大不活动时间//手动设置
        System.out.println("Session对象的最大不活动时间"+httpSession.getMaxInactiveInterval());
        //修改最大不活动时间
        httpSession.setMaxInactiveInterval(15);//15*/

        //立即销毁
        httpSession.invalidate();

        //
    }
}
