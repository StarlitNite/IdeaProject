<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/15
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加评论</title>
</head>
<body>
<div  style="position:absolute; bottom:0; position:fixed;" align="center">
  <form action="DealAddComController" method="post">
    <textarea>${Coms.CommentContent}</textarea>
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
