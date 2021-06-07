package servlet;

import util.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DealUpdUser
 */
@WebServlet("/dealUpdUser")
public class DealUpdUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DealUpdUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String un=request.getParameter("username");
        String pw=request.getParameter("password");
        String address=request.getParameter("address");
        String tel=request.getParameter("tel");
        String id =request.getParameter("id");
        DBUtil db=new DBUtil();
        String [] params={un,pw,address,tel,id};
        int result=db.update("update user set username=?,password=?,address=?,telephone=? where id=?",params);
        if(result==0){
            response.getWriter().print("修改失败");
        }else {
            response.getWriter().print("修改成功");
        }
       /* try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&serverTimezone=UTC&useSSL=false","root","root");
            //第三部：创建用于执行sql语句的语句对象
            String sql ="update user set username=?,password=?,address=?,telephone=? where id=?";
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1, un);
            stmt.setString(2, pw);
            stmt.setString(3, address);
            stmt.setString(4, tel);
            stmt.setString(5, id);
            int result=stmt.executeUpdate();
            if(result==0) {
                response.getWriter().print("修改失败 ");
            }else {
                response.getWriter().print(" <a href='GetUsers'>修改成功</a>");
            }
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //第二部：获取数据库连接
        catch (SQLException e) {
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