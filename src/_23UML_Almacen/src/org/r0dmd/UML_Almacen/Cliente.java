package org.r0dmd.UML_Almacen;

class Cliente extends Persona {

  private static int contadorClientes = 1;
  private int idCliente;

  public Cliente(String nombre, String apellido) {
    super(nombre, apellido);
    this.idCliente = contadorClientes++;
  }

  public int getIdCliente() {
    return idCliente;
  }

  @Override
  public String toString() {
    return super.toString() + ", ID Cliente: " + idCliente;
  }
}
