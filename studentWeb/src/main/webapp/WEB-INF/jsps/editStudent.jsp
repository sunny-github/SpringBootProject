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
<form action="updateStudent" method="POST">
<pre>
Id: <input type="number" name="id" value="${student.id}" readonly/>
Name: <input type="text" name="name" value="${student.name}"/>
Roll: <input type="number" name="roll" value="${student.roll}"/>
Address: <input type="text" name="address" value="${student.address}"/>
<input type="submit" value="update"/>
</pre>
</form>
</body>
</html>