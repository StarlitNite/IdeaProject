package com.example.LoginRegister;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    Connection connection;
    public Database(String name,String password)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_rigester","root","root");

    }
    public void showConnect(){
        System.out.println(this.connection);
    }

    //添加用户信息
    public void insert(String ID,String username,String password,String email) throws SQLException {
        PreparedStatement prep = connection.prepareStatement("INSERT INTO Login values (?,?,?,?)");

       prep.setString(1,ID);
        prep.setString(2,username);
        prep.setString(3,password);
        prep.setString(4,email);
        prep.execute();

    }

    //删除用户信息
    public void Delete(String ID) throws SQLException {
        PreparedStatement prep = connection.prepareStatement("DELETE FROM Login where ID=?");
        prep.setString(1,ID);
        prep.execute();
    }

    //得到用户信息
    public UserData getUser(String ID) throws SQLException {
        PreparedStatement prep = connection.prepareStatement("SELECT * FROM where ID=?");
        prep.setString(1,ID);
        prep.execute();
        ResultSet resultSet = prep.getResultSet();
        if (resultSet.next()){
            String id = resultSet.getString("ID");
            String name = resultSet.getString("username");
            String psw = resultSet.getString("password");
            String email = resultSet.getString("email");
            return new UserData(id,name,psw,email);
        }else return null;


    }
    public ArrayList<UserData> getAllUser() throws SQLException {
        ArrayList<UserData> userlist = new ArrayList<UserData>();
        PreparedStatement prep = connection.prepareStatement("SELECT * from Login");
        prep.execute();
        ResultSet resultSet = prep.getResultSet();
        while (resultSet.next()){
            String id = resultSet.getString("ID");
            String name = resultSet.getString("username");
            String psw = resultSet.getString("password");
            String email = resultSet.getString("email");
            userlist.add(new UserData(id,name,psw,email)) ;
        }
        return userlist;
    }
        public void close() throws SQLException {
        connection.close();
    }
    public UserData check(String ID,String password) throws SQLException {
        PreparedStatement prep = connection.prepareStatement("SELECT password from Login where ID=?");
        prep.setString(1,ID);
        System.out.println(prep);
        prep.executeQuery();
        ResultSet resultSet = prep.getResultSet();
        if(resultSet.next()){
            String pwd = resultSet.getString("password");
            if (password.equals(pwd)){
                return getUser(ID);
            }else {
                return null;
            }
        }else return null;
    }
}
