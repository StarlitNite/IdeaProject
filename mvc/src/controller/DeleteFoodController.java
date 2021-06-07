package controller;

import servise.Foodservise;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "delFood", value = "/delFood")
public class DeleteFoodController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String foodId = request.getParameter("foodId");

        //调用删除功能
        Foodservise fs = new Foodservise();
        Boolean result = fs.delFood(foodId);
        if (result){
            request.getRequestDispatcher("getFoodList").forward(request, response);
        }else {
            request.setAttribute("msg", "删除菜品失败");
            request.setAttribute("path", "返回菜品列表页");
            request.setAttribute("href", "javasrcipt:history.back()");
            request.getRequestDispatcher("result.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
