package com.myproject;
import java.io.IOException;
import javax.servlet.http.*;


@SuppressWarnings("serial")

public class FBServlet extends HttpServlet
{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		
		
		
		String n=req.getParameter("n");
		  String m=req.getParameter("m");
		  double g1=Math.abs(10 - Double.parseDouble(n));
		  double g2=Math.abs(10 - Double.parseDouble(m));
		  if (g1<g2) {
		   resp.getWriter().println(n);
		  }
		  if (g1>=g2) {
		   resp.getWriter().println(m);
		  }
		
		
	
	}
}