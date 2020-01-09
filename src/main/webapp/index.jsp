<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring REST DEMO</title>
</head>
<body>

<h1>
Spring REST Demo</h3>
<hr>

<p>
<a href="${pageContext.request.contextPath}/test/hello"> Hello page</a>
<br><br><br>
<hr>
<a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
</p>


</body>
</html>