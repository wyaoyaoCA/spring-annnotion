<%--
  Created by IntelliJ IDEA.
  User: wyaoyao
  Date: 2021/2/13
  Time: 11:50 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springMVc注解开发</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/hello">访问helloWorld</a>
<br>
<a href="requestMappingTest.jsp">requestMapping注解测试</a>
<br>
<a href="requestParamTest.jsp">requestParam注解测试</a>

<br>
<a href="initBinderTest.jsp">initBinder注解测试</a>
<br>
<a href="modelAttributeTest.jsp">modelAttribute注解测试</a>

<br>
<a href="sessionAttributeTest.jsp">sessionAttribute注解测试</a>

<br>
<a href="xexceptionHandlerTest.jsp">exceptionHandler注解测试</a>
</body>
</html>
