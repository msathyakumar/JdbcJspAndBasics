package com.sathya.servlets.preinit;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PreinitServlet
 */
//@WebServlet(urlPatterns ="/PreinitServlet",loadOnStartup=0)
public class PreinitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method");
	}

	public void destroy() {
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("inside service method");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
