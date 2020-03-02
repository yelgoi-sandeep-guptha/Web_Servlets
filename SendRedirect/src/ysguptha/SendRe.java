package ysguptha;

import java.io.*;
import javax.servlet.http.*;

public class SendRe extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException{
		String sa=req.getParameter("s");
		PrintWriter out=res.getWriter();
		out.print("My Full Name is : "+sa);
	}
}
