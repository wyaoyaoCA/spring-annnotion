<%--
  Created by IntelliJ IDEA.
  User: wyaoyao
  Date: 2021/2/14
  Time: 1:11 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/initBinder/test01" method="post">
        <label>用户名：</label><input type="text" name="username">
        <br>
        <label>年龄：</label><input type="text" name="age">
        <br>
        <label>生日：</label><input type="text" name="birthday">
        <br>
        <input type="submit">
    </form>
</body>
</html>
