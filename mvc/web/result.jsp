<%--
  Created by IntelliJ IDEA.
  User: 86155
  Date: 2021/5/31
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<
<html>
<head>
    <title>result.jsp</title>
</head>
<body>
<%--<c:if  test="${result==true}" > 登陆成功</c:if>
<c:if test="${result==false}">登陆失败</c:if>--%>
<h5>${msg }</h5>
<a href="${href}">${path}</a>

</body>
</html>
