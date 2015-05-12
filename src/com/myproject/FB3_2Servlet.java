package com.myproject;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FB3_2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		
		  
		     String a=req.getParameter("a");
		     String b=req.getParameter("b");
		     String c=req.getParameter("c");
		     if (Double.parseDouble(b)*Double.parseDouble(b)-4*Double.parseDouble(a)*Double.parseDouble(c)<0) 
		     {
		     resp.getWriter().println("No roots of a square equation");

		     }
		     if (Double.parseDouble(b)*Double.parseDouble(b)-4*Double.parseDouble(a)*Double.parseDouble(c)==0) 
		     {
		     double x=-Double.parseDouble(b)/(2*Double.parseDouble(a));
		     resp.getWriter().println("x="+x);
		     }
		     if (Double.parseDouble(b)*Double.parseDouble(b)-4*Double.parseDouble(a)*Double.parseDouble(c)>0) 
		     {
		     double x1=(-Double.parseDouble(b)+Math.sqrt((Double.parseDouble(b)*Double.parseDouble(b)-4*Double.parseDouble(a)*Double.parseDouble(c))))/(2*Double.parseDouble(a));
		     double x2=(-Double.parseDouble(b)-Math.sqrt((Double.parseDouble(b)*Double.parseDouble(b)-4*Double.parseDouble(a)*Double.parseDouble(c))))/(2*Double.parseDouble(a));
		     resp.getWriter().println("x1="+x1);
		     resp.getWriter().println("x2="+x2);
		     }
		
		
	
	}
}
