package com.sathya.packs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	public void init() {
		System.out.println("inside init method servlet");
		
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>hello world</h1>");
		
		
	}
	public void destroy() {
		System.out.println("inside destroy method");
	}
}
