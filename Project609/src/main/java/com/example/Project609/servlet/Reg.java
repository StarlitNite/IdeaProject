package servlet;

import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/reg")
public class Reg extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String tel = request.getParameter("tel");
        String address = request.getParameter("address");
        DBUtil db=new DBUtil();
        String [] params={username,password,tel,address,"0"};
        int result=  db.update("insert into user(username,password,telephone,address,ident)values(?,?,?,?,?)",params);
        if(result==0) {
            response.sendRedirect("reg.jsp");
        }else {
            response.sendRedirect("GetUsers");
        }
       /* try {
            //第一部：加载数据库驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            //第二部：获取数据库连接
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&serverTimezone=UTC&useSSL=false","root","root");
            //第三部：创建用于执行sql语句的语句对象
          //  Statement stmt=conn.createStatement();
            //第四部：创建sql语句
           // String sql="insert into user(username ,password,telephone,address,ident)values('"+username+"','"+password+"','"+tel+"','"+address+"','0')";
            //第五部：执行SQL语句；
            String sql="insert into user(username,password,telephone,address,ident)values(?,?,?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            pstmt.setString(3,tel);
            pstmt.setString(4,address);
            pstmt.setString(5,"0");
            int result= pstmt.executeUpdate();
           // int result=stmt.executeUpdate(sql);
            //第六部:对执行结果进行处理
            //getString java里对应varchar ""对应列名
            //java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver 报错把包粘贴到WEB-INF的lib里
            if(result==0) {
                response.sendRedirect("reg.jsp");
            }else {
                response.sendRedirect("GetUsers");
            }

            //第七部：关闭所有使用的资源

        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }
}
