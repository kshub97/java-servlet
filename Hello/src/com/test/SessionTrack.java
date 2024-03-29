package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTrack extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SessionTrack() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("unused")
		HttpSession session = request.getSession(true);
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		
		Integer visitCount = new Integer(0);
		String visitCountKey = new String("visitCount");
		  String userIDKey = new String("userID");
	      String userID = new String("ABCD");
	      
	      if (session.isNew()) {
	        
	          session.setAttribute(userIDKey, userID);
	       } else {
	          visitCount = (Integer)session.getAttribute(visitCountKey);
	          visitCount = visitCount + 1;
	          userID = (String)session.getAttribute(userIDKey);
	       }
	       session.setAttribute(visitCountKey,  visitCount);
	       response.setContentType("text/html");
	       PrintWriter out = response.getWriter();

	       String docType =
	          "<!doctype html public \"-//w3c//dtd html 4.0 " +
	          "transitional//en\">\n";

		
	       
	       out.println(docType +
	    	         "<html>\n" +
	    	           
	    	            
	    	            "<body bgcolor = \"#f0f0f0\">\n" +
	    	              
	    	            
	    	               "<table border = \"1\" align = \"center\">\n" +
	    	                  
	    	                  "<tr bgcolor = \"#949494\">\n" +
	    	                     "  <th>Session info</th><th>value</th>" +
	    	                  "</tr>\n" +
	    	                     
	    	                  "<tr>\n" +
	    	                   
	    	                    
	    	                  "</tr>\n" +
	    	                  
	    	                  "<tr>\n" +
	    	                     "  <td>Creation Time</td>\n" +
	    	                     "  <td>" + createTime + "  </td> "+
	    	                  "</tr>\n" +
	    	                  
	    	                  "<tr>\n" +
	    	                     "  <td>Time of Last Access</td>\n" +
	    	                     "  <td>" + lastAccessTime + "  </td>"+
	    	                  "</tr>\n" +
	    	                  
	    	                  "<tr>\n" +
	    	                    
	    	                    
	    	                  "</tr>\n" +
	    	                  
	    	                  "<tr>\n" +
	    	                     "  <td>Number of visits</td>\n" +
	    	                     "  <td>" + visitCount + "</td>"+
	    	                  "</tr>\n" +
	    	               "</table>\n" +
	    	            "</body>"+
	    	        "</html>"
	    	      );
	    	   }
		
	}


	


