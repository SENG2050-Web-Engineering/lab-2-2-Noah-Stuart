package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Greetings</title>");
        out.println("</head>");
        out.println("<body>");

        if (firstName == null | lastName == null) {
            out.println("<h1>Welcome</h1>");
            out.println("<p>Please provide both firstName and lastName parameters.</p>");
        } else {
            out.println("<h1>Welcome</h1>");
            out.println("<p>Hello " + firstName + " " + lastName + "</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
