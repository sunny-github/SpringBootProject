<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveStu" method="POST">
<pre>
Id: <input type="number" name="id"/>
Name: <input type="text" name="name"/>
Roll: <input type="number" name="roll"/>
Address: <input type="text" name="address"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg}

<a href="displayStudent">viewAll</a>
</body>
</html>