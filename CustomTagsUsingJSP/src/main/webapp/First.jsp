<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1> good morning all</h1>
<%
request.setAttribute("name", "sathya kumar");
System.out.println("sathya"+" "+request.getAttribute("name"));
%>


</body>
</html>