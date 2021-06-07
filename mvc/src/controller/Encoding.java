package controller;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.UnsupportedEncodingException;

@WebServlet(name = "Encoding", value = "/Encoding")
public class Encoding extends HttpServlet {
    private Encoding chain;

    protected void doFilter(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        chain.doFilter(request,response);
    }
}
