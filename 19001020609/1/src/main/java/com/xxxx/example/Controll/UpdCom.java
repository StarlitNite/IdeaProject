package com.xxxx.example.Controll;

import Util.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdCom", value = "/UpdCom")
public class UpdCom extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
//或许不需要修改评论

        String CommentContent = request.getParameter("CommentContent");
        String CommentID = request.getParameter("CommentID");

        DBUtil db = new DBUtil();
        String[] params ={CommentContent,CommentID};

        int result = db.update("update user set  CommentTime=? where CommentID=?",params);
        if (result == 0){
            response.getWriter().println("修改失败");
        }else {
            response.getWriter().println("修改成功！");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
