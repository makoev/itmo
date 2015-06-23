package com.myproject;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FB3_4Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		int [][] Mas = new int[5][8];
        for(int i =0;i<Mas.length;i++){
            for(int h=0;h<Mas[i].length;h++){
                Mas[i][h]=(int)((Math.random()*199)-99);
                resp.getWriter().print(Mas[i][h]+" ");
            }
            resp.getWriter().println();
        }
        int min=Mas[0][0];
        for(int i =0;i<Mas.length;i++){
            for(int h=0;h<Mas[i].length;h++){
                if(Mas[i][h]>min)min=Mas[i][h];
            }
        }
        resp.getWriter().println(" ");
        resp.getWriter().println("max = "+min);
    }
}