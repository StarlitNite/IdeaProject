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
    <title>首页</title>
</head>
<body>
<form action=""></form>

<%--首页 --%>

<div>
    <%--<div align="right">
        <a href="#"></a>
        <a href="#">修改个人资料</a>
        <a href="#">退出点餐系统</a>
    </div>--%>
        <%--<%String UserName = request.getSession().getAttribute("UserName").toString();%>
        您好，<%=UserName %>--%>


        <c:choose>
            <c:when test="${UserName == null }">
                <!-- 顶部未登录 -->
                请 <a href="Log.jsp">登录</a>
                <a href="Reg.jsp">注册</a>
            </c:when>
            <c:otherwise>
                <!-- 顶部已登录 -->
                欢迎你！，<a href="User.jsp" target="_blank"><strong>${user.UserName }</strong></a>
                <c:if test="${admin }">
                    | <a href="NODAY.html" target="_blank">管理</a>
                </c:if>
                | <a href="logout">退出</a>
            </c:otherwise>
        </c:choose>
    <hr size="1">
<h2>成功！</h2>


</div>
</body>
</html>
