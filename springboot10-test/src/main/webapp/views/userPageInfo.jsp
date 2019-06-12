<%--
  Created by IntelliJ IDEA.
  User: 查建军
  Date: 2019/4/16
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${pageInfo.list}" var="user">
    <p>用户：${user.username}&nbsp密码：${user.password}</p>
</c:forEach>
<br>
第${pageInfo.pageNum}页，共${pageInfo.pageSize}页

</body>
</html>
