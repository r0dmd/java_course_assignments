package org.r0dmd.apiservlet.webapp.bbdd.tarea9.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.r0dmd.apiservlet.webapp.bbdd.tarea9.services.CursoServiceImpl;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import org.r0dmd.apiservlet.webapp.bbdd.tarea9.models.Curso;
import org.r0dmd.apiservlet.webapp.bbdd.tarea9.services.CursoService;

@WebServlet("/cursos/buscar")
public class BuscarCursoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Connection conn = (Connection) req.getAttribute("conn");
        CursoService service = new CursoServiceImpl(conn);
        String nombre = req.getParameter("nombre");
        
        List<Curso> cursos = service.porNombre(nombre);

        req.setAttribute("titulo", "Jakarta tarea 9: Filtrando cursos");
        req.setAttribute("cursos", cursos);
        getServletContext().getRequestDispatcher("/listar.jsp").forward(req, resp);
    }
}
