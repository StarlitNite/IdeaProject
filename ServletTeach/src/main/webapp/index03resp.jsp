<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/4/5
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--  Java脚本段--%>
    <%
        //获取参数
        String username = request.getParameter("username");
        //获取request作用域
        String password = (String) request.getAttribute("password");


        //输出内容
        out.println(username);
        out.println("---------------");
        out.print(password);
    %>
</body>
</html>
