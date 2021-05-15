package com.example.LOGIN;

import java.sql.*;

public class jdbcTest {
    public static void main(String[] args)throws ClassNotFoundException,SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_rigester","root","root");
//            System.out.println(conn);


        PreparedStatement prep = connection.prepareStatement("SELECT *FROM login ");
        prep.executeQuery();
        ResultSet resultSet = prep.getResultSet();
        while (resultSet.next()){
            String username = resultSet.getString("username");
            System.out.println(username);
        }
    }
//    public void testFindById(){
//        try {
//            Connection conn = MySqlDbUtil. getConnection();
//            String sql = "DELETE FROM band WHERE id=?";
//            PreparedStatement pstmt = conn.prepareStatement(sql);//sql语句预处理
//            pstmt.setInt(1,5);
//            int result = pstmt.executeUpdate();
//            if(result>0){
//                System.out.println("删除成功");
//            }else{
//                System.out.println("删除失败");
//            }
//            pstmt.close();
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}
