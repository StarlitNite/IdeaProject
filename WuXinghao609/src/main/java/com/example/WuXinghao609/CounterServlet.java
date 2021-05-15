package com.example.WuXinghao609;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CounterServlet", value = "/CounterServlet")
public class CounterServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        Integer counter = (Integer) getServletContext().getAttribute("counter");
        if (counter == null){
            getServletContext().setAttribute("counter", 0);
        }


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        int counter = 0;
        synchronized (this){
            counter= (int) getServletContext().getAttribute("counter");
            getServletContext().setAttribute("counter", ++counter);
            response.getWriter().println("您是本网站第:"+counter+"位访问者！");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
