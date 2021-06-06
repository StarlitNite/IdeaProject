package org.example.Controll;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String un = request.getParameter("Username");
        String pw = request.getParameter("Password");

        LoginService ls = new LoginService();
        Boolean result = ls.login(un,pw);
        if (result){
            if (un.equals("admin")){
                request.getRequestDispatcher("getFoodList");
            }
            else {
                request.getRequestDispatcher("index");
            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
