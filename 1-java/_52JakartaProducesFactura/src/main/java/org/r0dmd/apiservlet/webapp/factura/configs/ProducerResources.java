package org.r0dmd.apiservlet.webapp.factura.configs;

import org.r0dmd.apiservlet.webapp.factura.models.Producto;
import org.r0dmd.apiservlet.webapp.factura.models.LineaFactura;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class ProducerResources {

    @Produces
    private List<LineaFactura> beanLineas() {
        Producto producto1 = new Producto("Silla", 40);
        Producto producto2 = new Producto("PC", 1000);
        Producto producto3 = new Producto("Tostadora", 24);
        Producto producto4 = new Producto("Teclado", 15);

        LineaFactura linea1 = new LineaFactura(producto1, 2);
        LineaFactura linea2 = new LineaFactura(producto2, 1);
        LineaFactura linea3 = new LineaFactura(producto3, 3);
        LineaFactura linea4 = new LineaFactura(producto4, 1);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }

}
