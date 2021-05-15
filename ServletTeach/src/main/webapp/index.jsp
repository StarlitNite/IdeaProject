<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%--  如果要在jsp中写Java代码,需要写在脚本段中--%>
    <%
        //获取域对象内容
        String name = (String) request.getAttribute("username");
        System.out.println("name:"+name);
        Integer Age = (Integer) request.getAttribute("Age");
        System.out.println("Age:"+Age);
        List<String> list = (List<String>) request.getAttribute("list");
       // System.out.println(list.get(0)); 要做空值判断 不然会报错
    %>

</body>
</html>
