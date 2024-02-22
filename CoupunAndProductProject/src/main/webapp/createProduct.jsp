<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add coupon</title>
</head>
<body>
	<h1>Add product</h1>
	<form action="CreateProductServlet" method="POST">
		name:<input type="text" name="name"> </br>coupuncode:<input type="text"
			name="coupuncode"> </br>price:<input type="number" name="price"></br>
		<input type="submit" name="submit">

	</form>
</body>
</html>