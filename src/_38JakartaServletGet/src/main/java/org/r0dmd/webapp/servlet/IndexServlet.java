package org.r0dmd.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/inicio")
public class IndexServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();

    // Obtención de parámetros de la URL
    String nombre = req.getParameter("nombre");
    String apellido = req.getParameter("apellido");

    // Fecha actual
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM, yyyy");
    String fechaActual = dateFormat.format(new Date());

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("    <head>");
    out.println("        <meta charset=\"UTF-8\">");
    out.println("        <title>Parámetros Nombre y Apellido</title>");
    out.println("    </head>");
    out.println("    <body>");
    out.println("        <h1>Parámetros de la URL</h1>");

    // Mostrar los parámetros o mensaje de error si faltan
    if (nombre != null && apellido != null) {
      out.println("<h2>Hola, " + nombre + " " + apellido + "!</h2>");
    } else {
      out.println(
        "<h2>Los parámetros 'nombre' y 'apellido' son obligatorios.</h2>"
      );
    }

    // Mostrar la fecha actual
    out.println("<h3>Fecha actual: " + fechaActual + "</h3>");

    out.println("    </body>");
    out.println("</html>");
    out.close();
  }
}
