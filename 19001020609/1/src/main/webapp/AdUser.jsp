<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/6
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="Script/jquery-1.7.2.js"></script>
</head>
<body>
    <h1 align="center">新闻主页</h1>
    <div>
        <table align="center" border="1">
            <tr bgcolor="#7fffd4" align="center">
                <th>新闻条目</th>
                <th>新闻标题</th>
                <th>新闻分类</th>
                <th>发布日期</th>
                <th>操作</th>
            </tr>
            <c:set var="num" value="1"/>
            <c:forEach items="${NewsList}" var="nl">
                <tr>
                    <td>${num}</td>
                    <td>${nl.NewsTitle}</td>
                    <td>
                        <c:forEach items="${NewsGroupList}" var="ngl">
                            <c:if test="${nl.NewsGroupID==ngl.NewsGroupID}">${ngl.NewsGroup}</c:if>
                        </c:forEach>
                    </td>
                    <td>${nl.NewsTime}</td>
                    <%--操作--%>
                    <td>
                        <a href="UpdNews?NewsID=${nl.NewsID}">修改</a>
                        <a href="delNews?NewsID=${nl.NewsID}">删除</a>
                    </td>
                </tr>
                <c:set var="num" value="${num+1}"/>
            </c:forEach>
        </table>
        <p align="center"><a href="AddNewsController">添加</a></p>
        <p align="center"><input type="button" value="返回" onclick="javascript:window.location.href='Main.jsp' "></p>
    </div>
</body>
</html>
