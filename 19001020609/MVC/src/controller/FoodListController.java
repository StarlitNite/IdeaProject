package controller;

import servise.FoodTypeservise;
import servise.Foodservise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/getFoodList")
public class FoodListController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Foodservise fs=new Foodservise();
    FoodTypeservise fts=new FoodTypeservise();
    public FoodListController() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        List<Map<String,String>> foods=fs.getFoodList();
        request.setAttribute("foodlist",foods);
        List<Map<String,String>> typelist=fts.getFoodTypeList();
        request.setAttribute("typelist",typelist);
        request.getRequestDispatcher("foodlist.jsp").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
