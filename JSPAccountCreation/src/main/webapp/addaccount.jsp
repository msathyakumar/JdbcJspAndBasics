<%@ page import="java.sql.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>account details</title>
</head>
<body>
	<%!Connection con;
	PreparedStatement ps;

	public void jspInit() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
			ps = con.prepareStatement("insert into account values(?,?,?,?)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void jspDestroy() {
		try {
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>

	<%
	int accno = Integer.parseInt(request.getParameter("accno"));
	String firstname = request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	int bal = Integer.parseInt(request.getParameter("bal"));

	try {
		ps.setInt(1, accno);
		ps.setString(2, firstname);
		ps.setString(3, lastname);
		ps.setInt(4, bal);
		ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>
<h1>successfully entered</h1>
</body>
</html>