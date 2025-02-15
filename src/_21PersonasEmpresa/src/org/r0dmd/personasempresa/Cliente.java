package org.r0dmd.personasempresa;

public class Cliente extends Persona {

  private int clienteId;

  private static int contadorClientes = 1;

  public Cliente(
    String nombre,
    String apellido,
    String numeroFiscal,
    String direccion
  ) {
    super(nombre, apellido, numeroFiscal, direccion);
    this.clienteId = contadorClientes++;
  }

  public int getClienteId() {
    return clienteId;
  }

  @Override
  public String toString() {
    return super.toString() + '\n' + "ID de cliente: " + clienteId;
  }
}
