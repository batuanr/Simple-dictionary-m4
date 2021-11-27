<%--
  Created by IntelliJ IDEA.
  User: kasawoa
  Date: 2021/11/27
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="text" name="string" placeholder="Nhập từ tiếng Anh">
    <input type="submit" value="Tìm">
</form>
<c:if test="${result != null}">
    <h1> <c:out value="${result}"></c:out></h1>
</c:if>
</body>
</html>
