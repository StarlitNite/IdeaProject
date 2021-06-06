package org.example.Controll;

import org.example.Service.foodTypeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "AddFood", value = "/AddFood")
public class AddFood extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("addFood.jsp").forward(request, response);//请求转发
        foodTypeService fts = new foodTypeService();
        List<Map<String, String>> typeList = fts.getFoodTypeList();
        request.setAttribute("tpyeList", typeList);
        request.getRequestDispatcher("addFood.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
