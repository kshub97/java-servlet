package com.test;
import java.io.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DrawTable
 */


@SuppressWarnings("serial")
@WebServlet("/table")

public class DrawTable extends HttpServlet {
	 public void doGet(HttpServletRequest request,
	            HttpServletResponse response)
	            throws ServletException, IOException
	    {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        out.println("<html>");
	        out.println("<head><title>Table Example</title></head>");
	        out.println("<body>");
	        out.println("<table border = '1'>");
	        out.println("<tr>");

	        for (int i = 1; i <= 25; i++)
	        {
	            for (int j = 1; j <= 3; j++)
	            {
	                out.println("<td>[" +"Row"+ i + "," + "Col"+j + "]</td>");
	            }
	            out.println("</tr>");
	        }

	        out.println("</table>");
	        out.println("</body></html>");
	    }

}








