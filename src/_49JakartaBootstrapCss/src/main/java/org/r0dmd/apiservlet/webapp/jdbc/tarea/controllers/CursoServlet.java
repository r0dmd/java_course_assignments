package org.r0dmd.apiservlet.webapp.jdbc.tarea.controllers;

import org.r0dmd.apiservlet.webapp.jdbc.tarea.services.CursoService;
import org.r0dmd.apiservlet.webapp.jdbc.tarea.services.CursoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import org.r0dmd.apiservlet.webapp.jdbc.tarea.models.Curso;

@WebServlet({"/index.html", "/cursos"})
public class CursoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection conn = (Connection) req.getAttribute("conn");
        CursoService service = new CursoServiceImpl(conn);
        List<Curso> cursos = service.listar();

        req.setAttribute("titulo", "Tarea: Listado de cursos");
        req.setAttribute("cursos", cursos);
        getServletContext().getRequestDispatcher("/listar.jsp").forward(req, resp);
    }
}
