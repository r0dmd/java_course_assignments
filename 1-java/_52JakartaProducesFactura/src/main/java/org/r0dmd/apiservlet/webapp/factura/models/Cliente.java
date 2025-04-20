package org.r0dmd.apiservlet.webapp.factura.models;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class Cliente {

    private String nombre;

    private String apellido;

    @PostConstruct
    public void inicializar(){
        nombre = "Pepe";
        apellido = "Pérez";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
