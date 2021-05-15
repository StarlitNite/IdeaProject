package com.example.LoginRegister;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //��ȡsession
        HttpSession session = request.getSession();
        //��ȡSessionID
        String sid = session.getId();
        System.out.println(sid);
        //ע��
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-type","text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();
        String name = request.getParameter("username");
        //System.out.println(name);
        String id = request.getParameter("ID");
        String password1 = request.getParameter("password");
        String password2 = request.getParameter("repassword");
        String email = request.getParameter("email");

        if (password1.equals(password2)){
            try {
             Database database = new Database("root","root");
             database.insert(id,name,password1,email);
             database.close();
             printWriter.write("ע��ɹ���");
            } catch (ClassNotFoundException|SQLException e) {
                e.printStackTrace();
                printWriter.write("ע��ʧ�ܣ�");
            }
        }else {
            printWriter.write("�������벻һ�£�");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
