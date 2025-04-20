package org.r0dmd.apiservlet.webapp.listener.tarea7.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/index.html", ""})
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombre = (String) req.getAttribute("nombre");
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title>Jakarta tarea 7 - Listener</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>Jakarta tarea 7 - Listener</h1>");
            out.println("        <p>Mi nombre es " + nombre + "!</p>");
            out.println("    </body>");
            out.println("</html>");
        }
    }
}
