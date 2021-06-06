<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/5/31
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>添加菜品</title>
  </head>
  <body>
  <form action="dealAddFood" method="post">
    菜品名称：<input type="text" name="foodname">
    菜品特色:<textarea name="feature"></textarea>
    原材料:<textarea name="material"></textarea>
    价格:<input type="text" name="price"/>
    分类:<select name="type">
              <c:forEach>
                <option value=""
              </c:forEach>
        </select>
    <input type="submit" value="添加"/>
    <input type="reset" value="重置"/>
  </form>
  </body>
</html>
