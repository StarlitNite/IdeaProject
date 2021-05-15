<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/4/14
  Time: 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP页面</title>


</head>
<body>
    <h2>Hello</h2>
<pre>
    JSP中有两种类型的注释：
        一、显式注释
            能够在客户端查看的注释
            1.继承HTML风格的注释   &lt;!--HTML注释--&gt;
                <!--HTML注释-->
        二、隐式注释
            不能在客户端查看的注释
            1.JSP自己的注释 &lt;%--JSP自己的注释--%&gt;
                <%--JSP自己的风格--%>
            2.继承Java风格的注释
                //单行注释
                /*多行注释*/
</pre>
<%-- Java脚本段 --%>
<%
    //这是单行注释
    /*这是多行注释*/
%>
</body>
</html>
