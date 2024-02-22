package com.sathya.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathya.project.dao.CoupunDao;
import com.sathya.project.models.Coupun;

/**
 * Servlet implementation class CreateCoupunServlet
 */
@WebServlet("/CreateCoupunServlet")
public class CreateCoupunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		CoupunDao coupunDao = new CoupunDao();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		if(action.equals("add")) {
			String name = request.getParameter("name");
			String code = request.getParameter("code");
			int price = Integer.parseInt(request.getParameter("price"));
			
			Coupun coupun = new Coupun();
			coupun.setName(name);
			coupun.setCode(code);
			coupun.setPrice(price);
			coupunDao.save(coupun);
			out.print("coupun added successfully");
			out.print("<a href='HomePage.html' >Home page</a>");
			
		}else if(action.equals("search")) {
			String code = request.getParameter("coupuncode");
			Coupun coupun = coupunDao.get(code);
			System.out.println(coupun.toString());
			out.print("<a href='HomePage.html' >Home page</a>");
			
		}
	}

}
