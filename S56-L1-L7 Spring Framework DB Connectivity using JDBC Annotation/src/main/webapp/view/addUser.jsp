<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/files/css/style.css">
<title>Insert title here</title>
</head>
<body>

	<table>
		<form:form modelAttribute="users" action="addUser">
			<tr>
				<td>Name: <form:input path="name" />
				</td>
			</tr>
			<tr>
				<td>Email <form:input path="email" /> 
				<form:errors path="email" cssStyle="Color:red"></form:errors>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</form:form>
	</table>

</body>
</html>