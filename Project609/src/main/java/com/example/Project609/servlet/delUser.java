package servlet;

import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet( "/delUser")
public class delUser extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String userId =request.getParameter("useId");
        DBUtil db=new DBUtil();
        String[] params ={userId};
        int result= db.update("delete from user where id=?",params);
        if(result==0){
            response.getWriter().print("fall");
        }else {
            response.getWriter().print("success");
        }
       /* try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&serverTimezone=UTC&useSSL=false";
            Connection conn= DriverManager.getConnection(url,"root","root");
            Statement stme=conn.createStatement();
            String sql="delete from user where id="+userId;
            int result= stme.executeUpdate(sql);
            if(result==0) {
                response.getWriter().print("删除失败");
            }else {
                response.getWriter().print("删除成功");
            }
            response.getWriter().print("<a href='GetUsers'>返回用户列表</a>");
            stme.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
