package hey;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/send")
public class servlet1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException {
		response.setContentType("text/html");
		String a=request.getParameter("fn");
		String b=request.getParameter("ln");
		PrintWriter out=response.getWriter();
		out.print("Full Name is : "+(a+b));
	}
}
