package com.test;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloForm
 */
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		Cookie[] cookies = req.getCookies();

		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("testCookie")) {
					out.println("Welcome back");
					break;
				}		
			}
			//out.println("Welcome back");
		} else {
			Cookie testCookie = new Cookie("testCookie", "cookieValue");
			resp.addCookie(testCookie);
			out.println("Welcome to new user");
		}

		out.close();
	}
	

}



