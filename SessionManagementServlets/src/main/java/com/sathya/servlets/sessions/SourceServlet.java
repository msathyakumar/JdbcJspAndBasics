package com.sathya.servlets.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SourceServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String user = request.getParameter("username");
		System.out.println(user);
		Cookie[] cookie = request.getCookies();
		for(int i=0;i<cookie.length;i++) {
			System.out.println(cookie[i].getName());
			System.out.println(cookie[i].getValue());
		}
		Cookie cookies = new Cookie("sessionid","12345");
		response.addCookie(cookies);
		HttpSession session = request.getSession();
		session.setAttribute("username", user);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<a href='TargetServlet'>chick here to enter target servlet</a>");
	}

}
