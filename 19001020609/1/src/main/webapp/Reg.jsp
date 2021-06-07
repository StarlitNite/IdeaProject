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
    <title>注册</title>
    <script type="text/javascript" src="Script/jquery-1.7.2.js"></script>
</head>
<body>
<h1 align="center" style="color: red">欢迎注册学习强国平台</h1>
<div>
    <form action="RegController" method="post">
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
                <th>电话:</th>
                <td><input align="center" type="text" name="Tel" placeholder="请输入电话"></td>
            </tr>
            <tr>
                <th>身份:</th>
                <td>
                    管理员<input type="radio" name="Ident" value="0" >
                    用户<input type="radio" name="Ident" value="1" checked>
                </td>
            </tr>
        </table>
        <div align="center">
            &nbsp;
            <input type="button" value="返回登录" onclick="javascript:window.location.href='Login609.html' ">
            &nbsp;
            <input type="reset" value="重置">
            &nbsp;
            <input type="submit" value="注册">
        </div>
    </form>

</div>

</body>
</html>
