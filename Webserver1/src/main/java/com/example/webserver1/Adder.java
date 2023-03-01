package com.example.webserver1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/adder")
public class Adder extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        int i1 = Integer.parseInt(request.getParameter("number1"));
        int i2 = Integer.parseInt(request.getParameter("number2"));
        response.getWriter().println("<html><body> Summan är: "+ (i1+i2) +"</body></html>");
    }
}