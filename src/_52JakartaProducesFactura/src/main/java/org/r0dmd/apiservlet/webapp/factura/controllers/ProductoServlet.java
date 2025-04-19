package org.r0dmd.apiservlet.webapp.factura.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.r0dmd.apiservlet.webapp.factura.models.Factura;
import java.io.IOException;

@WebServlet({"/factura", "/"})
public class ProductoServlet extends HttpServlet {

    @Inject
    private Factura factura;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("factura", factura);
        req.setAttribute("title", "Ejemplo Factura con inyección de dependencia");

        getServletContext().getRequestDispatcher("/factura.jsp").forward(req, resp);
    }
}
