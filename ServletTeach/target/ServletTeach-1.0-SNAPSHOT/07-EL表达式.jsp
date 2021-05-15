<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/4/15
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式</title>
</head>
<body>
<%--
    作用：
        简化JSP代码
    格式：
        ${域对象的名称}
    操作对象：
        EL表达式一般操作的是域对象，不能操作局部变量
    操作范围：
        page范围
            在当前页面
        request范围
            在一次请求
        session范围
            在一次会话
        application范围
            在整个应用程序
    注：
        1.如果EL表达式获取域对象的值为空，默认显示空字符串
        2.EL表达式默认从小到大范围去找，找到即可，如果四个范围都未找到，则显示空字符串。
    查找数据时可以使用四个域对象对应的控件对象，分别是：
        pageScope,requestScope,sessionScope,applicationScope
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

        // 定义局部变量
        String str = "Hello";
    %>
    <%--获取数据--%>
    获取局部变量：${str} <br>
    获取域对象： ${name1}
    获取指定范围的域对象：<br>
    &nbsp;&nbsp;page范围:${pageScope.name1}<br>
    &nbsp;&nbsp;request范围:${requestScope.name2}<br>
    &nbsp;&nbsp;session范围:${sessionScope.name3}<br>
    &nbsp;&nbsp;application范围:${applicationScope.name4}<br>

</body>
</html>
