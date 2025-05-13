<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Thời gian thực</title>
</head>
<body>
    <h2>Chọn định dạng thời gian:</h2>
    <form method="post" action="time">
        <input type="text" name="format" value="${param.format}" placeholder="VD: HH:mm:ss hoặc dd/MM/yyyy"/>
        <input type="submit" value="Hiển thị"/>
    </form>

    <c:if test="${not empty time}">
        <h3>Thời gian hiện tại: <c:out value="${time}"/></h3>
    </c:if>

    <c:if test="${not empty requestScope.error}">
        <p style="color:red;"><c:out value="${requestScope.error}"/></p>
    </c:if>
</body>
</html>
