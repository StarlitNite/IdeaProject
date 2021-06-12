<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/12
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>修改页面</title>
    <script type="text/javascript" src="Script/jquery-1.7.2.js"></script>
</head>
<body>
<form action="DealUpdNewsController" method="post">
    <div align="center">
        新闻标题:<input type="text" value="${NewsList.NewsTitle}" name="NewsTitle"/><br/>
        新闻内容:<textarea style="width: 300px;length:500;"  name="NewsContent">${NewsList.NewsContent}</textarea><br/>
        发布时间:<input type="datetime-local" value="${NewsList.NewsTime}" name="NewsTime"/><br/>
        分类:<select name="NewsGroupID">
        <c:forEach items="${NewsGroupList}" var="ngl">
            <option value="${ngl.NewsGroupID}">${ngl.NewsGroup}</option>
        </c:forEach>
    </select>
        <input type="submit" value="修改"/>
        <input type="hidden" name="NewsID" value="${NewsList.NewsID}"/>
        <input type="button" value="返回" onclick="location.href='AdUser.jsp'">
    </div>
</form>
</body>
</html>
