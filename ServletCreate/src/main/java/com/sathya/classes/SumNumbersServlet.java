package com.sathya.classes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SumNumbersServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		if(request.getParameter("num1")!= null && request.getParameter("num2")!=null) {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		PrintWriter writer = response.getWriter();
		writer.print("the result is "+(a+b));
		
		}
	}

}
