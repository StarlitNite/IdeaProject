package org.example.Controll;

import org.example.Service.FoodListService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "FoodList", value = "/getFoodList")
public class FoodList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FoodListService fs = new FoodListService();
        FoodListService fts = new FoodListService();


        List<Map<String,String>> foods = fs.getFoodList();
        request.setAttribute("foodList", foods);

        List<Map<String,String>> typelist = fts.getFoodList();
        request.setAttribute("typelist", typelist);

        request.getRequestDispatcher("foodList.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
