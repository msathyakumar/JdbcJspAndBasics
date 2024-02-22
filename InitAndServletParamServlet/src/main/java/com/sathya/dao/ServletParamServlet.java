package com.sathya.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetriveDataServlet
 */
//@WebServlet(urlPatterns = "/servletparam",initParams = {@WebInitParam(name="classname",value="com.mysql.cj.jdbc.Driver"),@WebInitParam(name="url",value="jdbc:mysql://localhost:3306/bankdb"),@WebInitParam(name="pwd",value="root"),@WebInitParam(name="user",value="root")})
public class ServletParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = null;
	Statement statement = null;
	public void init(ServletConfig config) {
		ServletContext servletContext = config.getServletContext();
		String url = servletContext.getInitParameter("url");
		String user = servletContext.getInitParameter("user");
		String pwd = servletContext.getInitParameter("pwd");
		String classname = servletContext.getInitParameter("classname");
		try {
			Class.forName(classname);
			connection = DriverManager.getConnection(url,user,pwd);
			System.out.println(url);
			System.out.println(user);
			System.out.println(pwd);
			System.out.println(classname);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from user;");
			while(rs.next()) {
				out.print(rs.getString(1));
				out.print("<br/>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
