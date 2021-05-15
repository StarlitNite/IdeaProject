<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/4/14
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>底部</title>
</head>
<body>

<h2>底部内容</h2>
<%
    //获取动态包含传递的参数
    String username = request.getParameter("username");
    String msg = request.getParameter("msg");
    out.println(username+","+msg);
%>
</body>
</html>
