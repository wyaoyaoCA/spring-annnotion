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

    <span>没有携带任何参数</span><a href="${pageContext.request.contextPath}/requestParam/test01">url:requestParam/test01</a>
    <br>
    <span>携带了username和age参数</span><a href="${pageContext.request.contextPath}/requestParam/test01?username=韦德&age=18">url: requestParam/test01?username=韦德&age=18</a>
    <br>
    <span>携带了name和age参数</span><a href="${pageContext.request.contextPath}/requestParam/test01?name=韦德&age=18">url: requestParam/test01?name=韦德&age=18</a>

</body>
</html>
