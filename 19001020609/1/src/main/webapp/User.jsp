<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/1
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <td><c:out value="${user.UserName}"></c:out></td>   <%--  UserController 拉取数据过来才能用 --%>
            <td><c:out value="${user.Tel}" default="默认值">

            </c:out></td>
                <c:forEach items="${user}" var="user">
                    <td>${user.UserName} </td>
                    <td>${user.Tel}</td>
                </c:forEach>
            </tr>
        </table>
    </div>
</body>
</html>
