package org.r0dmd.almacenverduleria;

public class Producto {

  protected String nombre;
  protected Double precio;

  public Producto(String nombre, Double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public Double getPrecio() {
    return precio;
  }

  @Override
  public String toString() {
    return ("nombre='" + nombre + '\'' + ", precio=" + precio);
  }
}
