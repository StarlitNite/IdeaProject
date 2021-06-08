<%--
  Created by IntelliJ IDEA.
  User: 86155
  Date: 2021/6/2
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>添加菜品</title>
</head>
<body>
<form action="dealAddfood" method="post">
    菜品名称：<input type="text" name="foodname"/><br/>
    菜品特色：<textarea name="feature"></textarea><br/>
    原材料：<textarea name="material"></textarea><br/>
    价格：<input type="text" name="price"/><br/>
    分类<select name="type">
    <c:forEach items="${typelist}" var="tl"> 是typelist这个集合   var是给集合给了个名字
        <option value="${tl.id}">${tl.typename}</option>  tl.id 是序号，tl.typename是分类名字
    </c:forEach>
</select><br/>
    <input type="submit" value="注册"/>
    <input type="reset" value="重置"/>
</form>
</body>
</html>
