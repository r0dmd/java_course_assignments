package org.r0dmd.UML_Almacen;

class Perecedero extends Producto {

  private String fechaCaducidad;

  public Perecedero(String nombre, double precio, String fechaCaducidad) {
    super(nombre, precio);
    this.fechaCaducidad = fechaCaducidad;
  }

  public String getFechaCaducidad() {
    return fechaCaducidad;
  }

  @Override
  public String toString() {
    return super.toString() + ", Fecha de caducidad: " + fechaCaducidad;
  }
}
