package org.r0dmd.UML_Almacen;

class Limpieza extends Producto {

  private String componentes;

  public Limpieza(String nombre, double precio, String componentes) {
    super(nombre, precio);
    this.componentes = componentes;
  }

  public String getComponentes() {
    return componentes;
  }

  @Override
  public String toString() {
    return super.toString() + ", Componentes: " + componentes;
  }
}
