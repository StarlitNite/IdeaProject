package servlet;

import util.DBUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetUsers
 */
@WebServlet("/GetUsers")
public class GetUsers extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        DBUtil db=new DBUtil();
        List<Map<String,String> > users=db.getList("select *from user");
        for(Map<String,String> m:users){
            response.getWriter().print("用户名是"+m.get("username")+"密码是"+m.get("password")+"电话是"+m.get("telephone")+"地址是"+m.get("address")+"<br/>");
        }
        /*try {
            //第一部：加载数据库驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            //第二部：获取数据库连接
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/meal?characterEncoding=utf8&serverTimezone=UTC&useSSL=false","root","root");
            //第三部：创建用于执行sql语句的语句对象
            Statement stmt=conn.createStatement();
            //第四部：创建sql语句
            String sql="select* from user";
            //第五部：执行SQL语句；
            ResultSet rs =stmt.executeQuery(sql);
            //第六部:对执行结果进行处理
            //getString java里对应varchar ""对应列名
            //java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver 报错把包粘贴到WEB-INF的lib里
            response.getWriter().print("<a href='reg.jsp'> 添加用户</a>");
            response.getWriter().print("<table border='1px'>");
            response.getWriter().print("<tr><th>序号</th><th>用户名</th><th>密码</th><th>地址</th><th>电话</th><th>操作</th></tr>");
            int i=1;
            while(rs.next()) {
                response.getWriter().print("<tr>");
                response.getWriter().print("<td>"+i+"</td>");
                response.getWriter().print("<td>"+rs.getString("username")+" </td>");
                response.getWriter().print("<td>"+rs.getString("password")+" </td>;");
                response.getWriter().print("<td>"+rs.getString("address")+"</td>");
                response.getWriter().print("<td>"+rs.getString("telephone")+"</td>");
                response.getWriter().print("<td><a href='updUser?userId="+rs.getInt("id")+"'>修改</a> &nbsp;<a href='delUser?useId="+rs.getInt("id")+"'>删除</a>"+"</td>");
                response.getWriter().print("</tr>");
                i++;
            }
            response.getWriter().print("<table>");
            //第七部：关闭所有使用的资源
            rs.close();
            stmt.close();
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
