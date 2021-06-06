<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/1
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div>
    <img src="./image/Log.png">
    <h1 style="text-align: center ;color: red">欢迎登录学习强国平台</h1>
    <hr size="1" color="black">
</div>
<div align="center">
    <form action="LogController" method="post">
        <table style="margin: 0px auto">
            <tr>
                <th>用户名:</th>
                <td><input align="center" type="text" name="UserName" placeholder="请输入用户名"></td>
            </tr>
            <tr>
                <th>密码:</th>
                <td><input align="center" type="password" name="Password" placeholder="请输入密码"></td>
            </tr>
            <tr>
        <%--用户名:<input type="text" name="UserName"/><br/>
        密码:<input type="password" name="Password"/><br/>
        <input type="submit" value="登录">
        <input type="reset" value="重置">--%>
            </table>
        <div align="center">
            <input type="submit" value="提交">
            <input type="reset" value="重置">
        </div>
    </form>
</div>
</body>
</html>
