package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HttpServletUse extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name=req.getParameter("user");
		String pass=req.getParameter("pass");
		res.getWriter().println("<div class='alert alert-info' style='color:white'>UserName "+name+"   password "+pass+"</div>");
		out.println("<html><head>");
		out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">\r\n"
				+ "");
		out.println("</head><body class='container'><div class='card shadow col-sm-6' style='padding:20px'>");
		out.println("<form action='First' method='get'>");
		out.println("<input type='number' placeholder='Enter First Number' name='fnumber' class='form-control'/><br><br>");
		out.println("<input type='number' placeholder='Enter Secon Number' name='snumber' class='form-control'/><br><br>'");
		out.println("<input type='submit' value='Addition' class='btn btn-info'");
		out.println("</form></div></body></html>");
		
		
	}
}
