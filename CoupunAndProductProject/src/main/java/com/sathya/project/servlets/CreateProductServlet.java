package com.sathya.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathya.project.dao.CoupunDao;
import com.sathya.project.dao.ProductDao;
import com.sathya.project.models.Coupun;
import com.sathya.project.models.Product;

/**
 * Servlet implementation class CreateProduct
 */
@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String code = request.getParameter("coupuncode");
		int price = Integer.parseInt(request.getParameter("price"));
		
		Product product = new Product();
		CoupunDao coupunDao = new CoupunDao();
		product.setName(name);
		product.setCoupunCode(code);
		Coupun coupun = coupunDao.get(code);
		int cprice = coupun.getPrice();
		product.setPrice((price-cprice));
		ProductDao productDao = new ProductDao();
		productDao.save(product);	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("product added successfully");
		out.print("<a href='HomePage.html' >Home page</a>");
	}

}
