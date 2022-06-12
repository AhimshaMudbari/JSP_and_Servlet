package server1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myserver extends HttpServlet{
public void service(HttpServletRequest req, HttpServletResponse res)throws IOException {
	PrintWriter print = res.getWriter();
	//servlet context
//	ServletContext ctx= getServletContext();
//	String str=ctx.getInitParameter("Name");
	
	//servlet config
	ServletConfig config= getServletConfig();
	String str= config.getInitParameter("Name");
	print.println("Name: "+ str);
	String str1= config.getInitParameter("Course");
	print.println("Course: "+str1);
}
}
