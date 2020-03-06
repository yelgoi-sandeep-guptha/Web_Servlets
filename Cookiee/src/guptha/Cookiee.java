package guptha;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Cookiee extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		String a=request.getParameter("n1");
		String b=request.getParameter("n2");
		Cookie cookie=new Cookie("c",a+b);
		response.addCookie(cookie);
		response.sendRedirect("servlet2"); 
	}

}
