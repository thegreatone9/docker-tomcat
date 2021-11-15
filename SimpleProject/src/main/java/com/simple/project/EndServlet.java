package com.simple.project;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/end")
public class EndServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("***\n\nEnd Servlet hit!\n\n***");

        getServletContext()
                .getRequestDispatcher("/WEB-INF/end.jsp")
                .forward(req, resp);
    }
}