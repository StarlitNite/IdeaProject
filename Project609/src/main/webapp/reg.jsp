<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
</head>
<body>
<form action="regServlet" method="post">
<table border="1px" width="50%">
<tr>
<th>用户名：</th>
<td><input type="text" name="username"/></td>
</tr>
<tr>
<th>密码：</th>
<td><input type="password" name="password"/></td>
</tr>
<tr>
    <th>联系方式</th>
    <td><input type="tel" name="tel"></td>
</tr>
<tr>
    <th>地址</th>
    <td><input type="text" name="address"></td>
</tr>
<tr style="text-align:center">
<td colspan="2">
<input type="submit" value="注册"/>
<input type="reset" value="重置"/>
</td>
</tr>
</table>
</form>
</body>
</html>
