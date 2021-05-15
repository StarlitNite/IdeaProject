<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.xxxx.po.User" %><%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/4/15
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式的使用</title>
</head>
<body>
    <%--
        EL表达式的使用
            获取List
                获取List的size：${list.size()}<br>
                获取List的指定下标的值：${list[1]}<br>
                注：list代表的是限域变量名
            获取map
                获取map指定key的value值：${map.aaa} -- ${map["bbb"]} <br>
            获取JavaBean对象
                获取JavaBean中的属性
                    ${javaBean.属性名} 或 ${JavaBean对象.get属性名()}
    --%>

    <%
        //list
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        request.setAttribute("list", list);

        //map
        Map map = new HashMap();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        request.setAttribute("ap", map);

        //JavaBean

        User user = new User();
        user.setUserId(1);
        user.setUsername("zhangsan");
        user.setPassword("123456");
        request.setAttribute("user", user);
    %>
    <h4>获取list</h4>
    获取List的size：${list.size()}<br>
    获取List的指定下标的值：${list[1]}<br>
    <h4>获取map</h4>
    获取map指定key的value值：${map.aaa} -- ${map["bbb"]} <br>
    <h4>获取JavaBean对象</h4>
    ${user}<br>
    获取JavaBean中的属性：${user.Username} -- ${user.getPassword()}

</body>
</html>
