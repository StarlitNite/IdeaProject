/*package com.xxxx.example.Controll;

import Util.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdNews", value = "/UpdNews")
public class UpdNews extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String NewsContent = request.getParameter("NewsContent");
        String NewsTime = request.getParameter("NewsTime");
        String NewsTitle = request.getParameter("NewsTitle");

        DBUtil db = new DBUtil();
        String[] params ={NewsContent,NewsTime,NewsTitle};

        int result = db.update("update Comment setNewsContent=?,NewsTime=?,NewsTitle=?",params);
        if (result == 0){
            response.getWriter().println("修改失败");
        }else {
            response.getWriter().println("修改成功！");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}*/
