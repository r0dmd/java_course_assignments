package org.r0dmd.UML_Almacen;

class NoPerecedero extends Producto {

  private int contenido;

  public NoPerecedero(String nombre, double precio, int contenido) {
    super(nombre, precio);
    this.contenido = contenido;
  }

  public int getContenido() {
    return contenido;
  }

  @Override
  public String toString() {
    return super.toString() + ", Contenido: " + contenido + " unidades";
  }
}
