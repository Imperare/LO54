package Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class IndexHttpServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "Hello World";
        request.setAttribute("message", message); // This will be available as ${message}
        request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
    }
}
