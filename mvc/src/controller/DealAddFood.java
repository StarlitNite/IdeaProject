package controller;

import servise.Foodservise;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DealAddFood", value = "/DealAddFood")
public class DealAddFood extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String foodname = request.getParameter("foodname");
        String feature = request.getParameter("feature");
        String material = request.getParameter("material");
        String type = request.getParameter("type");
        String price = request.getParameter("price");
        String picture = "images/yinpin/01.jpg";
        String hits = "0";
        String comment = "-1";

        Foodservise fs = new Foodservise();
        Boolean result = fs.addFood(foodname, feature, material, type, price, hits, comment,picture);
        if (result){
            request.getRequestDispatcher("getFoodList").forward(request, response);
        }else {
            request.setAttribute("msg", "添加菜品失败！");
            request.setAttribute("path", "返回菜品列表页");
            request.setAttribute("href", "javasrcipt:history.back()");
            request.getRequestDispatcher("result.jsp").forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
