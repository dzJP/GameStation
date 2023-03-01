package com.example.webserver1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Random;

@WebServlet("/secretnumber")
public class SecretNumberSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        // create session if not there, or use the existing one

        int min = 1;
        int max = 10;
        int generatedSecretNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

        Integer secretNumber = (Integer) session.getAttribute("secretNumber");
        if (secretNumber == null) { // are we here for the first time?
            response.getWriter().print("<html><body> Secret number generated : " + generatedSecretNumber);
        }
        session.setAttribute("secret_number", secretNumber);
        response.setContentType("text/html");
    }
}
