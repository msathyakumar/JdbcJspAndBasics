package com.sathya.servlets.result;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathya.servlets.controllers.AverageController;

/**
 * Servlet implementation class resultservletsfinal
 */
@WebServlet("/resultservletsfinal")
public class resultservletsfinal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		AverageController con = new AverageController();
		int res = con.averageFunction(num1, num2);
		System.out.println(res);
		request.setAttribute("res", res);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");

		dispatcher.forward(request, response);

	}

}
