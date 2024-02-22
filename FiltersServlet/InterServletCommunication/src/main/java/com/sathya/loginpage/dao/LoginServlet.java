package com.sathya.loginpage.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = null;
       
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","root");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Statement statement = connection.createStatement();
			String user=request.getParameter("user");
			String password=request.getParameter("password");
			ResultSet rs = statement.executeQuery("select * from user where email='"+user+"' and password='"+password+"'");
			System.out.println(user);
			RequestDispatcher requestdisp = request.getRequestDispatcher("Homeservlet");
			if(rs.next()) {
				request.setAttribute("message", "welcome to home "+user);
				requestdisp.forward(request,response);
			}
			else {
				requestdisp=request.getRequestDispatcher("login.html");
				requestdisp.include(request,response);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
