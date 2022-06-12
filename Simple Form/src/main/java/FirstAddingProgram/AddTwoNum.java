package FirstAddingProgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddTwoNum extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	int a=Integer.parseInt(req.getParameter("num1"));
	int b= Integer.parseInt(req.getParameter("num2"));
	
	int result = a+b;
	
//	req.setAttribute("add", result);
	//Request dispatcher
//	RequestDispatcher dispatch= req.getRequestDispatcher("/square");
//	dispatch.forward(req, res);
	
//	//Using session method for send redirect
//	HttpSession session = req.getSession();
//	session.setAttribute("add", result);
	
	//Using Cookie
	Cookie cookie = new Cookie("add", result+"");
	res.addCookie(cookie);
	//send Redirect
//	res.sendRedirect("square?add="+result); //URL rewriting method
	res.sendRedirect("square"); 
}
}
