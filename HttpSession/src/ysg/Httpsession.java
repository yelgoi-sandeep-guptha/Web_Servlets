package ysg;

import java.io.IOException;

import javax.servlet.http.*;

public class Httpsession extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	response.setContentType("text/html");
	int a=Integer.parseInt(request.getParameter("num1"));
	int b=Integer.parseInt(request.getParameter("num2"));
	HttpSession session=request.getSession();
	session.setAttribute("a",a);
	session.setAttribute("b",b);
	response.sendRedirect("Httpsession2");
	}
}
