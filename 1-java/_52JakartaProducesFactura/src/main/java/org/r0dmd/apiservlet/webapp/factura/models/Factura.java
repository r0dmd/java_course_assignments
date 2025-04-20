package org.r0dmd.apiservlet.webapp.factura.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class Factura {

    @Inject
    private List<LineaFactura> lineas;

    private Cliente cliente;

    private String descripcion;
    
    private Long folio;

    @PostConstruct
    public void inicializar() {
        cliente.setNombre(cliente.getNombre().concat(" ").concat("José"));
        descripcion = "Factura Oficina".concat(" del cliente: ").concat(cliente.getNombre());
        folio = Math.round( Math.random() * 1000000000)+10;
    }

    @PreDestroy
    public void destruir() {
        System.out.println("Factura destruida: ".concat(descripcion));
    }

    public List<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Inject
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getFolio() {
        return folio;
    }

    public void setFolio(Long folio) {
        this.folio = folio;
    }
    
    
}
