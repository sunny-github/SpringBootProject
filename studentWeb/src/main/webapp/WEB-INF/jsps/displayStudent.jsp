<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student details</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Roll</th>
			<th>Address</th>
			<th>Action</th>
		</tr>

		<c:forEach items="${students}" var="student">

			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.roll}</td>
				<td>${student.address}</td>
				<td><a href="deleteStudent?id=${student.id}">delete</a></td>
				<td><a href="showUpdate?id=${student.id}">edit</a></td>
			</tr>

		</c:forEach>
	</table>
	<a href=showCreate>Add Student</a>
</body>
</html>