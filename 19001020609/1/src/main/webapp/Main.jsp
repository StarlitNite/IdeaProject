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
    <title>首页</title>
</head>
<body>
<form action="getNewsList" method="post">
    <input type="text" name="NewsName" placeholder="搜索新闻">
    <input type="submit" value="搜索">
</form>

<%--首页 --%>


    <%--<div align="right">
        <a href="#"></a>
        <a href="#">修改个人资料</a>
        <a href="#">退出点餐系统</a>
    </div>--%>
        <%--<%String UserName = request.getSession().getAttribute("UserName").toString();%>
        您好，<%=UserName %>--%>

<div align="right">
        <c:choose>
            <c:when test="${user.UserName == null }">
                <!-- 顶部未登录 -->
                <div align="right">
                    请 <a href="Log.jsp">登录</a>
                    <a href="Reg.jsp">注册</a>
                </div>

            </c:when>
            <c:otherwise>
                <!-- 顶部已登录 -->
                欢迎你！<a href="UserController" target="_blank"><strong>${user.UserName }</strong></a>
                <c:if test="${user.UserName == 'admin'}">
                    | <a href="AdUser.jsp" target="_blank">管理</a><%--管理员管理界面--%>
                </c:if>
                | <a href="LogOut">退出</a>
            </c:otherwise>
        </c:choose>
</div>
    <hr size="1">
<h2>成功！</h2>



</body>
</html>
