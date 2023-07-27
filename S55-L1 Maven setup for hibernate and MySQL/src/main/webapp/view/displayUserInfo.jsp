<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Info</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
Name: ${user.name}<p>
Gender: ${user.gender}<br>
Country: ${user.country}<br>
Introduction : ${user.introduction}<br>
Visited Countries: 
<ul>
<c:forEach items="${user.visitedCountries}" var="item">
<li>${item}</li>
</c:forEach>
</ul>
</body>
</html>