<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add coupun</title>
</head>
<body>
	<h1>Add coupun</h1>
	<form action="CreateCoupunServlet" method="POST">
		name:<input type="text" name="name"> </br>code:<input type="text"
			name="code"> </br>price:<input type="number" name="price"></br>
			<input type="hidden" name="action" value="add"> </br>
		<input type="submit" name="submit">

	</form>
</body>
</html>
