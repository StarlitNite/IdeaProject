<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/13
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>新闻详情</title>
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
    <div>
        用户ID
        ${User.UserName}
        评论内容:${Coms.CommentContent}           评论时间：${Coms.CommentTime}
    </div>
    <div>
        <form action="DealAddComController" method="post">
            <textarea>${Coms.CommentContent}</textarea>
            <input type="hidden" name="NewsID" value="${News.NewsID}">
            <input type="hidden" name="UserID" value="${User.UserID}">
            <%--<input type="hidden" name="CommentTime" value="">--%>
            <input type="submit" value="发表">
            内容
            hidden  时间，数据库的 新闻id，用户id
        </form>
    </div>
</body>
</html>
