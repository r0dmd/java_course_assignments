package org.r0dmd.apiservlet.webapp.factura.models;

public class LineaFactura {

    private Producto producto;
    private Integer cantidad;

    public LineaFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer calcularImporte() {
        return cantidad * producto.getPrecio();
    }
}
