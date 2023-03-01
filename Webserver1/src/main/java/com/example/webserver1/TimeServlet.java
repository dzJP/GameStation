package com.example.webserver1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.service.invoker.HttpServiceArgumentResolver;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.time.LocalDateTime;
import java.util.Enumeration;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

//        Enumeration<String> e = request.getHeaderNames();
//        while (e.hasMoreElements()){
//            String h = e.nextElement();
//            System.out.println(h + ": " +  request.getHeader(h));
//        }

        response.setContentType("text/html");
        response.getWriter().println("<html><body>Klockan är "+ LocalDateTime.now() +
                                        "</body></html>");
    }
}
