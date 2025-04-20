package org.r0dmd.personasempresa;

public class Empleado extends Persona {

  private double remuneracion;
  private int empleadoId;

  public Empleado(
    String nombre,
    String apellido,
    String numeroFiscal,
    String direccion,
    double remuneracion,
    int empleadoId
  ) {
    super(nombre, apellido, numeroFiscal, direccion);
    this.remuneracion = remuneracion;
    this.empleadoId = empleadoId;
  }

  public double getRemuneracion() {
    return remuneracion;
  }

  public int getEmpleadoId() {
    return empleadoId;
  }

  public double aumentarRemuneracion(int porcentaje) {
    remuneracion += remuneracion * (porcentaje / 100.0); // 100.0 porque uno de los dos tiene que ser double para operar, si no daría 0 porque sería un entero (es decir, si fuera 15/100, el 0.15 se redondearía a 0)
    return remuneracion;
  }

  @Override
  public String toString() {
    return (
      super.toString() +
      '\n' +
      "ID de empleado: " +
      empleadoId +
      '\n' +
      "Remuneración: " +
      remuneracion
    );
  }
}
