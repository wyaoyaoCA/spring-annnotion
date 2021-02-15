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
    <h1>1 get请求：</h1>
    <a href="${pageContext.request.contextPath}/requestMapping/test01">url:requestMapping/test01</a>
    <br>
    <a href="${pageContext.request.contextPath}/requestMapping/test01?name">url:requestMapping/test01?name</a>

    <h1>2 post请求：</h1>
    <form action="${pageContext.request.contextPath}/requestMapping/test01" method="post">
        <input type="submit" value="post请求">
    </form>

</body>
</html>
