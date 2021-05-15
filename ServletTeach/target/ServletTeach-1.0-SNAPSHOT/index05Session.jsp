<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/4/5
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //获取session域对象
    String username = (String) request.getSession().getAttribute("username");
    String password = (String) request.getSession().getAttribute("password");


    //获取request对象
    String name = (String) request.getAttribute("name");

    out.println("username:"+username+" password:"+password+"name:"+name);

%>
</body>
</html>
