<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/9/14
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>--%>
    <script src="js/vue.js"></script>
</head>
<body>
<body>
<div id="app">
    {{message}}
</div>
</body>
<script>
    var app = new Vue({
        el:'#app',
        data:{
            messag:'Hello world'
        }
    })
</script>
</body>
</html>
