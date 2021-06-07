<%--
  Created by IntelliJ IDEA.
  User: 86155
  Date: 2021/6/2
  Time: 8:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>菜品列表</title>
</head>
<body>
<form action="getFoodList" method="post"><%--搜索--%>
    <input type="text" name="foodname" placeholder="输入菜品名称">
    <input type="submit" value="查询">
</form>
<a href="addFood">添加菜品</a>
<table border="1px">
    <tr>
        <th>序号</th>
        <th>菜品名称</th>
        <th>菜品特色</th>
        <th>源材料</th>
        <th>价格</th>
        <th>分类</th>
        <th>图片</th>
        <th>热度</th>
        <th>备注</th>
        <th>操作</th>

    </tr>
    <c:set var="num" value="1"/>
    <c:forEach items="${foodlist}" var="fl">
    <tr>
        <td>${num}</td>
        <td>${fl.foodname}</td>
        <td>${fl.feature}</td>
        <td>${fl.material}</td>
        <td>${fl.price}</td>
        <td>
            <c:forEach items="${typelist}" var="tl">
                <c:if test="${fl.type==tl.id}">${tl.typename}</c:if>
            </c:forEach>
        </td>
        <td><img src="${fl.picture}" /></td>
        <td>${fl.hits}</td>
        <td><c:if test="${fl.comment>0}">特价菜</c:if>
            <c:if test="${fl.comment==0}">厨师推荐</c:if>
            <c:if test="${fl.comment==-1}">正常菜品</c:if>
        </td>
        <td>
            <a href="updFood?foodId=${fl.id}">修改</a>
            <a href="delFood?foodId=${fl.id}">删除</a>
        </td>
    </tr>
        <c:set var="num" value="${num+1}"/>
    </c:forEach>
</table>
</body>
</html>
