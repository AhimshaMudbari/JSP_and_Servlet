package addnum;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addition")
public class Addnum extends HttpServlet{
 public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	 int a= Integer.parseInt(req.getParameter("num1"));
	 int b = Integer.parseInt(req.getParameter("num2"));
	 
	 int k= a+b;
//	 PrintWriter print = res.getWriter();
//	 print.println(result);

	 Cookie cookie= new Cookie("k",k+"");
	 res.addCookie(cookie);
	 res.sendRedirect("squ");
 }
}
