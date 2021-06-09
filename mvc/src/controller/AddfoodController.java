package controller;

import servise.FoodTypeservise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/addFood")
public class AddfoodController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    FoodTypeservise fts =new FoodTypeservise();
    public AddfoodController() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        List<Map<String,String>> typelist=fts.getFoodTypeList();//
        request.setAttribute("typeList",typelist);//
        request.getRequestDispatcher("addfood.jsp").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
