<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
	.error{
		color:red;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<form:form action="/new" modelAttribute="addDepartment">
		<label for="addDepartmentInput">Add New Department: </label>
		<form:input path="departmentName" id="addDepartmentInput"/>
		<form:errors path="departmentName" cssClass="error"></form:errors>
		<input type="submit" value="Enter">
	</form:form>
	<br>
	<a href="/list">Show Departments</a>
</body>
</html>