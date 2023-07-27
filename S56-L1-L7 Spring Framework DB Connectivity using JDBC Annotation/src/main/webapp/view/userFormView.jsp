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
Name: <form:input path="name" required="true" placeholder="Enter Name"/><br/>
		<form:errors path="name" cssStyle="color:red"/>
		<p/>
Gender : Male: <form:radiobutton path="gender" value="Male" required="true"/>
		 Female: <form:radiobutton path="gender" value="Female" required="true"/>
		<p/>
Country: <form:select path="country">
			<form:option value="India"></form:option>
			<form:option value="USA" label ="The United State"></form:option>
			<form:option value="Russia"></form:option>
			<form:option value="UK" label ="United Kingdom"></form:option>
</form:select>
		<p/>
Introduction: <form:textarea path="introduction" required="true" placeholder="Enter Details" />
		<p/>
		<form:errors path="introduction" cssStyle="color:red"/>
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