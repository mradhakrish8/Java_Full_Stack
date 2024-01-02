package com.practise.trainings.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {

	/*Use Either Servlet configurations in web.xml or use below annotation before the class*/
	//@WebServlet(urlPatterns="/hello")
	
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlets World</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
