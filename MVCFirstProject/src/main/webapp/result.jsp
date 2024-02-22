<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result page</title>
</head>
<body>
	<%
	int result = (Integer) request.getAttribute("res");
	out.print(result);
	out.print("sathya");
	%>
</body>
</html>