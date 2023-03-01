package com.example.webserver1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/visit")
public class VisitCounter extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        // create session if not there, or use the existing one

        Integer counter = (Integer) session.getAttribute("count");
        if (counter == null) { // are we here for the first time?
            counter = Integer.valueOf(0);
        }
        counter = counter.intValue() + 1;
        session.setAttribute("count", counter);
        response.setContentType("text/html");
        response.getWriter().println("<html><body> Visit number "+ counter + "</body></html>");
    }
}
