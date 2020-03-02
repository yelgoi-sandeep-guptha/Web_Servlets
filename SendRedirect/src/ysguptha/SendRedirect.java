package ysguptha;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.http.*;

public class SendRedirect extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException {
		res.setContentType("text/html");
		String s=req.getParameter("fn");
		//int a=Integer.parseInt(req.getParameter("ph"));
		res.sendRedirect("info?s="+s);
//		PrintWriter out=res.getWriter();
//		out.print("My Name is : "+s);
//		out.print("my phone numeber id : "+a );
		
	}

}
