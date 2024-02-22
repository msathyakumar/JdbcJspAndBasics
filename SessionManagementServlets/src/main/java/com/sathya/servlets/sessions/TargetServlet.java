package com.sathya.servlets.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TargetServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		HttpSession session = request.getSession();
		Cookie[] cookies = request.getCookies();
		for(int i=0;i<cookies.length;i++) {
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
		}
		String user = (String)session.getAttribute("username");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("Welcome back "+user);
		
		
	}

}
