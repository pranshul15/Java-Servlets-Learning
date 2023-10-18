/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
/**
 *
 * @author prans
 */
public class FirstServlet implements Servlet{
    // Lifecycle methods
    
    ServletConfig conf;
    
    @Override
    public void init(ServletConfig conf) {
        this.conf = conf;
        System.out.println("Creating Object .... ");
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Servicing......");
        // set the content type of the response
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>this is my output from servlet method:</h1>");
        out.println("<h1>today's date and time is : " + (new Date().toString()) +"</h1>");
    }
    
    @Override
    public void destroy() {
        System.out.println("Going to destroy servlet object");
    }
    
    // non lifecycle methods
    
    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }
    
    @Override
    public String getServletInfo() {
        return "This servlet is created by Durgesh Tiwari";
    }
}
