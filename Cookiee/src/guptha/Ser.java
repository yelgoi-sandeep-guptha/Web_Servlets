package guptha;

import java.io.*;

import javax.servlet.http.*;

public class Ser extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("html/type");
		Cookie c[]=request.getCookies();
		PrintWriter out=response.getWriter();
		out.print(c[0].getValue());
		//for(int i=0;i<c.length;i++){  
			// out.print("<br>"+c[i].getName()+" "+c[i].getValue());//printing name and value of cookie  
		//}  
	}
}
