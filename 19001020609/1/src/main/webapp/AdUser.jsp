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
</head>
<body>
管理员面板
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
                        <a href="UpdNews?NewsID=${fl.id}">修改</a>
                        <a href="delNews?NewsID=${fl.id}">删除</a>
                    </td>
                </tr>
                <c:set var="num" value="${num+1}"/>
            </c:forEach>
        </table>
        <p align="center"><a href="addNews.jsp">添加</a></p>
    </div>
</body>
</html>
