package com.myproject;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FB3_3Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		int[][] array = new int[8][5];
		int i,j=0;
		for (i = 0; i < 8; i++)
		for (j = 0; j < 5; j++) {
		array[i][j] =(int)( Math.random()*90)+10;

		}
		for (i = 0; i < 8; i++){
		for (j = 0; j < 5; j++) {
		resp.getWriter().print(array[i][j]+" ");
		}
		resp.getWriter().println();
		}
	}
}