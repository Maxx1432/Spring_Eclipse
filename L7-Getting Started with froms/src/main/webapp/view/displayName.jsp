<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name View</title>
</head>
<body>
Hello ${name}<br>
Today is : ${date}<br>
List of Team Members <br>
<c:forEach var="temp" items="${team}">
${temp}<br/>
</c:forEach>

</body>
</html>