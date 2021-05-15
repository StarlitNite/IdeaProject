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
        page作用域
            在当前界面有效，跳转后无效
        request作用域
            在一次请求中有效，服务端跳转有效，客户端跳转无效
        session作用域
            在一次会话中有效，服务端客户端跳转有效
        application作用域
            整个应用中有效


        JSP中跳转方式
            1.服务端跳转
                <jsp:include page="要跳转的页面地址"></jsp:include>
            2.客户端跳转
                超链接
--%>
<%--设置数据--%>
    <%
        //  设置page范围的域对象
        pageContext.setAttribute("name1", "zhangsan");
        //  设置request范围的域对象
        request.setAttribute("name2", "lisi");
        //  设置session范围的域对象
        session.setAttribute("name3", "wangwu");
        //  设置application范围的域对象
        application.setAttribute("name4", "zhaoliu");
    %>

    <%-- JSP中服务器跳转--%>
   <%-- <jsp:include page="06-JSP四大域对象-02.jsp"></jsp:include>--%>
    <%--超链接跳转--%>
    <a href="06-JSP四大域对象-02.jsp">跳转</a>
</body>
</html>
