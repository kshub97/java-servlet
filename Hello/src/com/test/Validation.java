package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//stored username and password in array which need to be matched while login else show error
		
		String[] Username = {"admin","Shubham","username"}; 
	   String[] Password = {"admin1","1234","password"};  
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("username");
	    
	    
	    String p=request.getParameter("userpass");
	   
	    if(n.equals(Username[0]) && p.equals(Password[0])){
	    	 response.sendRedirect("Home.jsp?name="+n);
	    	
	        
	   }else if(n.equals(Username [1]) && p.equals(Password[1])){
		 	 response.sendRedirect("Home.jsp?name="+n);
	   }
	   else if(n.equals(Username [2]) && p.equals(Password[2])){
		 	 response.sendRedirect("Home.jsp?name="+n);
	   }
	   else{
		   response.sendRedirect("Error.jsp");  

	}

	}
}
