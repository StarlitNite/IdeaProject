<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/5/31
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table border="1px">
    <tr>
      <th>序号</th>
      <th>菜品名称</th>
      <th>菜品特色</th>
      <th>原材料</th>
      <th>价格</th>
      <th>分类</th>
      <th>图片</th>
      <th>热度</th>

    </tr>
    <c:set var="num" value="1"/>
    <c:forEach items="${foodList}" var="fl"></c:forEach>   <%--${foodList}是FoodList.java 中  request.setAttribute("foodList", foods)的foodLsit;--%>
    <tr>
      <td></td>
      <td>${num }</td>
      <td>${fl.foodname}</td>
      <td>${fl.feature}</td>
      <td>${fl.material}</td>
      <td>${fl.price}</td>
      <td>
        <c:forEach items="${typelist}" var="tl">
          <c:if test="${fl.type == tl.id}">
            ${tl.typename}
          </c:if>
        </c:forEach>
      </td>
      <%--<td>${fl.type}</td>--%>
      <td><img src="${fl.picture}"></td>
      <td>${fl.hits}</td>
      <td>
        <c:if test="${fl.comment >0 }">特价菜</c:if>
        <c:if test="${fl.comment =0 }">厨师推荐</c:if>
        <c:if test="${fl.comment =-1 }">正常菜品</c:if>
      </td>
      <td></td>
    </tr>
    <c:set var="num" value="${num+1}"/>
  </table>
  </body>
</html>
