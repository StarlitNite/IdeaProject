<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/13
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
    <title>新闻详情</title>
    <style type="text/css">
        .b{
            height:100px;
            width:100px;
            background-color:black;


            position:absolute;
            bottom:0;
            margin-left:-50px;/*div宽度的一半*/
            left:50%;
        }
    </style>
</head>
<body>
    <div>
        <h1 align="center">${NewsList.NewsTitle}</h1>
        <div align="center">
            发布时间:${NewsList.NewsTime}
            | 分类:<c:if test="${NewsList.NewsGroupID==NewsGroup.NewsGroupID}">${NewsGroup.NewsGroup}</c:if>
        </div>
        <hr size="1">
        <table>
            <td>${NewsList.NewsContent}</td>
        </table>
    </div>
    <div class="b">
        <c:forEach items="${UserList}" var="ul">
            <p>${ul.UserName}</p><br>
            ${Coms.CommentContent}|${Coms.CommentTime}
        </c:forEach>

        <%--评论内容:--%>          <%--评论时间：--%>
    </div>
    <%--<a href="ComController?UserID=${User.UserID}&NewsID=${NewsList.NewsID}">评论</a>--%>
    <div  style="position:absolute; bottom:0; position:fixed;" align="center">
        <%--用户ID--%>
        <form action="DealAddComController" method="post">
            <input type="text" name="CommentContent" value="${Coms.CommentContent}">
            <input type="hidden" name="NewsID" value="${News.NewsID}">
            <input type="hidden" name="UserID" value="${User.UserID}">
            <%--<fmt:formatDate value="${today}" pattern="yyyy/MM/dd  HH:mm:ss" var="d" />--%>
            <%--<input type="hidden" name="CommentTime" value="">--%>
            <input type="submit" value="发表">
            <%--内容
            hidden  时间，数据库的 新闻id，用户id--%>
        </form>
    </div>
</body>
</html>
