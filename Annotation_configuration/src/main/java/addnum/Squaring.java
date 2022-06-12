package addnum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/squ")
public class Squaring extends HttpServlet{
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	int k=0;
	Cookie co[]=req.getCookies();
	for(Cookie c:co) {
		if(c.getName().equals("k")) {
			k=Integer.parseInt(c.getValue());
		}
	}
	k= k*k;
	PrintWriter print = res.getWriter();
	print.println(k);
}
}
