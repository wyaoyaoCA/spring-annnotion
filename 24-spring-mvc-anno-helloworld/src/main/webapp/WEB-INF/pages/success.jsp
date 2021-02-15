<%--
  Created by IntelliJ IDEA.
  User: wyaoyao
  Date: 2021/2/14
  Time: 9:09 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Success!</h1>
    <span>请求域: </span> <%=request.getAttribute("name")%>
    <br></br>
    <span>会话域: </span> <%=session.getAttribute("name")%>
</body>
</html>
