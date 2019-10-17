package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Number
 */
public class Number extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		int number = Integer.parseInt(req.getParameter("number"));

		
		req.setAttribute("number", number);

		if (number < 10)
			req.getRequestDispatcher("Page1.jsp").forward(req, resp);
		else if (number >= 10 && number < 99)
			req.getRequestDispatcher("Page2.jsp").forward(req, resp);
		else
			req.getRequestDispatcher("Error.jsp").forward(req, resp);

		out.close();
	}
}
