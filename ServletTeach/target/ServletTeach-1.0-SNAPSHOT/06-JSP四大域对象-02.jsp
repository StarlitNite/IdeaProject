<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/4/15
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP四大域对象</title>
</head>
<body>
<%--
    JSP四大域对象
--%>
    <%
        /*//  设置page范围的域对象
        pageContext.setAttribute("name1", "zhangsan");
        //  设置request范围的域对象
        request.setAttribute("name2", "lisi");
        //  设置session范围的域对象
        session.setAttribute("name3", "wangwu");
        //  设置application范围的域对象
        application.setAttribute("name4", "zhaoliu");*/

        //获取域对象中的值
        out.print("page范围"+pageContext.getAttribute("name1")+"<br>");
        out.print("request范围"+request.getAttribute("name2")+"<br>");
        out.print("session范围"+session.getAttribute("name3")+"<br>");
        out.print("Application范围"+application.getAttribute("name4")+"<br>");
    %>
</body>
</html>
