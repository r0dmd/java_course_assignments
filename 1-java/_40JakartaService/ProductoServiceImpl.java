package org.r0dmd.apiservlet.webapp.headers.services;

import org.r0dmd.apiservlet.webapp.headers.models.Producto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductoServiceImpl implements ProductoService{
    @Override
    public List<Producto> listar() {
        return Arrays.asList(
			new Producto(1L, "mesa", "oficina", 10),
            new Producto(2L, "tostadora", "hogar", 15),
            new Producto(3L, "carpeta", "oficina", 5)
		);
    }

    @Override
    public Optional<Producto> buscarProducto(String nombre) {
        return listar().stream().filter(p -> {
            if (nombre == null || nombre.isBlank()) {
                return false;
            }
            return p.getNombre().contains(nombre);
        }).findFirst();
    }
}
