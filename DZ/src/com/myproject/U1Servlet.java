package com.myproject;

import java.io.IOException;
import javax.servlet.http.*;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.*;

import java.io.*;  
import java.sql.*;  

import javax.servlet.ServletException;

@SuppressWarnings("serial")
public class U1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=utf-8");
		String n=req.getParameter("n");
		String m=req.getParameter("m");
		double k1=Double.parseDouble(n);
		double k2=Double.parseDouble(m);
		
		
		
		  PrintWriter out = resp.getWriter();
		  String table1="";
		  String title = "Zadanie 1";
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//ru\">\n";
	      

		if ((k1>=0)&&(k1<k2)&&(k2<65535)) {
		
		  int row=0;
	      for(int i=(int)k1;i<k2;i++)
	      {
	    	  if(row==10)
	    	  {
	    		table1+="</tr><tr>";
	    		row=0;  
	    	  }
	    	  row++;
	    	  table1+="<td>"+(char)i+"</td>";
	      }
	      
	      out.println(docType +
	                "<html>\n" +
	                "<head>"+
	                "<meta charset='utf-8'>"+
	                "<title>" + title + "</title>"+
	                "</head>\n" +
	                "<body bgcolor=\"EB6E2A\">\n" +
	                "<h1 align=\"center\">" + title + "</h1>\n" +
	                "<ul>\n" +
	                "  <li><b>От:</b>: "
	                + req.getParameter("n") + "\n" +
	                "  <li><b>До:</b>: "
	                + req.getParameter("m") + "\n" +
	                "</ul>\n" +
	                "<table border='3'>"+
	                "<tr>"+
	                table1+
	                "</tr>"+
	                "</table>"+
	                "</body></html>");  
        
		}else{
	      out.println(docType +
	                "<html>\n" +
	                "<head>"+
	                "<meta charset='utf-8'>"+
	                "<title>" + title + "</title>"+
	                "</head>\n" +
	                "<body bgcolor=\"EB6E2A\">\n" +
	                "<h1 align=\"center\">" + title + "</h1>\n" +
	                "<ul>\n" +
	                "  <li><b>От</b>: "
	                + req.getParameter("n") + "\n" +
	                "  <li><b>До</b>: "
	                + req.getParameter("m") + "\n" +
	                "</ul>\n" +
	                "<b>Некорректный ввод</b> "+
	                "</body></html>");  
	      }
		
		
		
	}
	
	  public void doPost(HttpServletRequest request,
	                     HttpServletResponse response)
	      throws ServletException, IOException {
	     doGet(request, response);
	  }
}
