package servlet;

import util.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdUser
 */
@WebServlet("/updUser")
public class UpdUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String id=request.getParameter("userId");
        DBUtil db=new DBUtil();
        String[] params={id};
        Map<String,String> m=db.getMap("select * from user where id=? ",params);
        response.getWriter().print("<form action='dealUpdUser' method='post'>");
        response.getWriter().print("用户名：<input type='text' name='username' value='"+m.get("username")+"'/><br/>");
        response.getWriter().print("密码：<input type='password' name='password' value='"+m.get("password")+"'/><br/>");
        response.getWriter().print("地址：<textarea name='address'>"+m.get("address")+"</textarea><br/>");
        response.getWriter().print("电话：<input type='text' name='tel' value='"+m.get("telephone")+"'/><br/>");
        response.getWriter().print("<input type='submit' value='修改'/><a  type='button 'href='GetUsers'/>取消</a>");
        response.getWriter().print("<input type='hidden' name='id' value='"+m.get("id")+"'/>");
        response.getWriter().print("</form>");
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&serverTimezone=UTC&useSSL=false","root","root");
            //第三部：创建用于执行sql语句的语句对象
            Statement stmt=conn.createStatement();
            String sql="select *from user where id="+id;
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()) {
                response.getWriter().print("<form action='dealUpdUser' method='post'>");
                response.getWriter().print("用户名：<input type='text' name='username' value='"+rs.getString("username")+"'/><br/>");
                response.getWriter().print("密码：<input type='password' name='password' value='"+rs.getString("password")+"'/><br/>");
                response.getWriter().print("地址：<textarea name='address'>"+rs.getString("address")+"</textarea><br/>");
                response.getWriter().print("电话：<input type='text' name='tel' value='"+rs.getString("telephone")+"'/><br/>");
                response.getWriter().print("<input type='submit' value='修改'/><a  type='button 'href='GetUsers'/>取消</a>");
                response.getWriter().print("<input type='hidden' name='id' value='"+rs.getInt("id")+"'/>");
                response.getWriter().print("</form>");
            }
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
