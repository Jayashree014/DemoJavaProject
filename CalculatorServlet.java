package com.jspiders.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
	 @Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	    {
		    resp.setContentType("text/html");
		    int n1 = Integer.parseInt(req.getParameter("num1"));
		    int n2 = Integer.parseInt(req.getParameter("num2"));
		    String option = req.getParameter("option");
		    PrintWriter out = resp.getWriter();
		    int res = 0;
		    switch(option) {
		    case "add" : res = n1+n2;
		        break;
		    case "sub" : res = n1-n2;
	            break;
		    case "mul" : res = n1*n2;
	            break;
		    case "div" : res = n1/n2;
	            break;
		    case "mod" : res = n1%n2;
	            break;
		    default : out.print("<h1> Invalid option!! </h1>");
		        break;
		    }
		    out.print("<h1 Style = 'color:blue;' align = 'center'> Result : "+res+"</h1>");
	    }

}
