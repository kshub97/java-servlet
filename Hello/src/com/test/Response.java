package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Response extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Response() {
        super();
       
    }

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Using GET Method to Read Form Data";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      DateFormat df = new SimpleDateFormat("HH");
			
			
			int s = Integer.parseInt(df.format(new Date()));
			
			if(s>12&&s<=16) {
				
				
				   out.println(docType +
				 	         "<html>\n" +
				 	            "<head><title>" + title + "</title></head>\n" +
				 	            "<body bgcolor = \"#f0f0f0\">\n" +
				 	               
				 	               "<ul>\n" +"Good Afternoon"+  "\n" +
				 	                  
				 	                   request.getParameter("first_name") + "\n" +
				 	                  
				 	                   request.getParameter("last_name") + "\n" +
				 	                  
				 	                  
				 	               "</ul>\n" +
				 	            "</body>" +
				 	         "</html>"
				 	      );
				
			}
			
			else if(s>=17&&s<=20) {
				
				out.println(docType +
			 	         "<html>\n" +
			 	            "<head><title>" + title + "</title></head>\n" +
			 	            "<body bgcolor = \"#f0f0f0\">\n" +
			 	             
			 	               "<ul>\n" +"Good Evening"+  "\n" +
			 	                  
			 	                   request.getParameter("first_name") + "\n" +
			 	                  
			 	                   request.getParameter("last_name") + "\n" +
			 	                  
			 	                  
			 	               "</ul>\n" +
			 	            "</body>" +
			 	         "</html>"
			 	      );
			} 
			
			else {
				
				out.println(docType +
			 	         "<html>\n" +
			 	            "<head><title>" + title + "</title></head>\n" +
			 	            "<body bgcolor = \"#f0f0f0\">\n" +
			 	            
			 	               "<ul>\n" +"Good Morning"+   "\n"  +
			 	                  
			 	                   request.getParameter("first_name") + "\n" +
			 	                  
			 	                   request.getParameter("last_name") + "\n" +
			 	                  
			 	                  
			 	               "</ul>\n" +
			 	            "</body>" +
			 	         "</html>"
			 	      );
				
			}
	      
	   
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
