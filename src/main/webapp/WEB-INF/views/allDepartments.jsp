<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>List of Departments</h2>
	<table>

		<c:forEach items="${list}" var="dep">
			<tr>
				<td>${dep.id}</td>
				<td>${dep.departmentName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>