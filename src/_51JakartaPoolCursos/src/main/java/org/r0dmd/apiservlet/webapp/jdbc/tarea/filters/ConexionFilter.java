package org.r0dmd.apiservlet.webapp.jdbc.tarea.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;
import org.r0dmd.apiservlet.webapp.jdbc.tarea.services.ServiceJdbcException;
import org.r0dmd.apiservlet.webapp.jdbc.tarea.util.ConexionBaseDatos;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.NamingException;

@WebFilter("/*")
public class ConexionFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        try (Connection conn = ConexionBaseDatos.getConnection()) {

            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }

            try {
                request.setAttribute("conn", conn);
                chain.doFilter(request, response);
                conn.commit();
            } catch (SQLException | ServiceJdbcException e) {
                conn.rollback();
                ((HttpServletResponse)response).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
                e.printStackTrace();
            }
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
    }
}
