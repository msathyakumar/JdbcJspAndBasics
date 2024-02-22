package com.sathya.servlets.users;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsersDispServlets
 */
@WebServlet("/userDisplay")
public class UsersDispServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection connection;
    public void init() {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","root");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select *from user;");
			PrintWriter out = response.getWriter();
			
			out.print("<h1>hello good morning </h1>");
			out.print("<table>");	
			out.print("<tr>");
			out.print("<th>");
			out.print("firstname");
			out.print("</th>");
			out.print("<th>");
			out.print("email");
			out.print("</th>");
			out.print("<tr>");
			
			while(resultset.next()) {
			out.print("<tr>");
			out.print("<td>");
			out.print(resultset.getString(1));
			out.print("</td>");
			out.print("<td>");
			out.print(resultset.getString(3));
			out.print("</td>");
			out.print("</tr>");
			}
			out.print("</table>");
			out.print("<br/>");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
