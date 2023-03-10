package com.example.webserver1.games;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/guessmysecretnumber")
public class GuessGame extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        int min = 1;
        int max = 10;
        int secretNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int number1 = Integer.parseInt(request.getParameter("number1"));

        if (number1 < secretNumber)
            response.getWriter().println("<html><body> Too small!</body></html>");
        if (number1 == secretNumber)
            response.getWriter().println("<html><body> Correct!</body></html>");
        else if (number1 > secretNumber) {
            response.getWriter().println("<html><body> Too high!</body></html>");
        }

        response.getWriter().println("<html><body>Your guess was " + number1 + " and the secret number was " + secretNumber);
    }
}
