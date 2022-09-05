package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First  extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		int firstnum=Integer.parseInt(req.getParameter("fnumber"));
		int secondnum=Integer.parseInt(req.getParameter("snumber"));
		out.println("Addition of two number is "+(firstnum+secondnum));
		
	}

   
	

}
