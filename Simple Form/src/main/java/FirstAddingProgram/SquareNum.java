package FirstAddingProgram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareNum extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		HttpSession session = req.getSession();
//		int result = (int) session.getAttribute("add");
		int result=0;
		Cookie[] cookie=req.getCookies();
		for(Cookie c:cookie) {
			if(c.getName().equals("add")) {
			 result= Integer.parseInt(c.getValue());
			}
		}
		
		  int result1= result*result;
		  PrintWriter print = res.getWriter();
		  print.println("Square is: "+result1);
		 	}
}
