
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_http extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        System.out.println("This is GET method");
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        out.print("<h1>This is GET method of MyServlet</h1>");
    }
}
