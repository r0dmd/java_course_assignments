package org.r0dmd.apiservlet.webapp.listener.tarea7;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AplicacionListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        sre.getServletRequest().setAttribute("nombre", "Juan Pérez");
    }

}
