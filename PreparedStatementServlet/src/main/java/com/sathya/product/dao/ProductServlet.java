package com.sathya.product.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/productsuccess")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement ps=null;
	Connection connection = null;
	public void init() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","root");
			ps = connection.prepareStatement("insert into product values(?,?,?,?);");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
       
    
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String description = request.getParameter("description");
		int price=Integer.parseInt(request.getParameter("price"));
		
		try {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, description);
			ps.setInt(4, price);
			int rs = ps.executeUpdate();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print(rs+" rows got added");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void destroy() {
		try {
			ps.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
