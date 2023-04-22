<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
<h4>Submit Your Information</h4>
<hr>
<form:form action="displayUserInfo" modelAttribute="user">
Name: <form:input path="name"/>
		<p/>
Gender :<form:radiobuttons path="gender" items="${genderMap}"/>
		<p/>
Country: <form:select path="country" items="${countryMap}"/>
		<p/>
Introduction: <form:textarea path="introduction"/>
		<p/>
Visited Countries:
	India	<form:checkbox path="visitedCountries" value="IND"/>
	United State	<form:checkbox path="visitedCountries" value="USA"/>
	United kingdom	<form:checkbox path="visitedCountries" value="UK"/>
	<p/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>