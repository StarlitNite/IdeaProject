<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/6/12
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="DealUpdNewsController" method="post">
    <div align="center">
        新闻标题:<input type="text" value="${}" name="NewsTitle"/><br/>
        新闻内容:<textarea style="width: 300px;length:500;" name="NewsContent"></textarea><br/>
        发布时间:<input type="datetime-local" name="NewsTime"/><br/>
        分类:<select name="NewsGroupID">
        <c:forEach items="${NewsGroupList}" var="ngl">
            <option value="${ngl.NewsGroupID}">${ngl.NewsGroup}</option>
        </c:forEach>
    </select>
        <input type="submit" value="修改"/>
    </div>
</form>
</body>
</html>
