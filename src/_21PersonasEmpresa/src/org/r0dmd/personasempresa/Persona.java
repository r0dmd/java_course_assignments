package org.r0dmd.personasempresa;

public class Persona {

  private String nombre;
  private String apellido;
  private String numeroFiscal;
  private String direccion;

  // Constructor
  public Persona(
    String nombre,
    String apellido,
    String numeroFiscal,
    String direccion
  ) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroFiscal = numeroFiscal;
    this.direccion = direccion;
  }

  // Getters
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getNumeroFiscal() {
    return numeroFiscal;
  }

  public String getDireccion() {
    return direccion;
  }

  // Sobreescribir toString
  @Override
  public String toString() {
    return (
      "Nombre: " +
      nombre +
      '\n' +
      "Apellido: " +
      apellido +
      '\n' +
      "NIF: " +
      numeroFiscal +
      '\n' +
      "Dirección: " +
      direccion
    );
  }
}
