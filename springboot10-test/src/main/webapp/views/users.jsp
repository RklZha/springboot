<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 查建军
  Date: 2019/4/16
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户</title>
</head>
<body>
<p>111111111</p>
<c:forEach items="${users}" var="user">
    <p>用户：${user.username}&nbsp密码：${user.password}</p>
</c:forEach>
</body>
</html>
