<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/1
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <title>个人中心</title>
</head>
<body>
    <div align="right">
        <a href="Main.jsp">主页面</a>
        <a href="Log.jsp">退出</a>
    </div>
    <div>
        <table border="1">
            <tr>
                <td>用户名</td>
                <td>电话</td>
            </tr>
            <tr>
            <td>${user.UserName}</td>   <%--  UserController 拉取数据过来才能用 --%>
                <td>${user.Tel}</td>
            </tr>
        </table>
    </div>
</body>
</html>
