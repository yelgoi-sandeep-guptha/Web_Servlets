package ysg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class Httpsession2 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		int a=(int)(session.getAttribute("a"));
		int b=(int)(session.getAttribute("b"));
		PrintWriter out=response.getWriter();
		out.print("Result is : "+(a+b));
	}
}
