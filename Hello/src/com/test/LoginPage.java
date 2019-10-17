package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String user=request.getParameter("usertype");
		System.out.println(user);
	
		
		if(user.equalsIgnoreCase("user"))
		 {
			System.out.println("inside if");
			response.sendRedirect("Employee.jsp");
		 }
		else if(user.equalsIgnoreCase("admin"))
		{
			System.out.println("inside else if");
			response.sendRedirect("Admin.jsp");
		}
		else
		{
			System.out.println("inside else");
			response.sendRedirect("Login.html");
		}
		
	}
}
