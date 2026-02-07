package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class generateValidHTML extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head> <title> HTML Generator </title> </head>");
        out.println("<body>");
        out.println("\t<h1>Generting HTML Using Java Serverlets.</h1>");
        out.println("<a href=\"http://validator.w3.org/#validate-by-input%20%20\">Validate Here!</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
