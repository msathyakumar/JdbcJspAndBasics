<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="product" class="com.sathya.products.dao.product">
<jsp:setProperty name="product" property="id"/>
<jsp:setProperty name="product" property="name"/>
<jsp:setProperty name="product" property="description"/>
<jsp:setProperty name="product" property="price"/>
</jsp:useBean>
id:<jsp:getProperty property="id" name="product"/>
name:<jsp:getProperty property="name" name="product"/>
</body>
</html>