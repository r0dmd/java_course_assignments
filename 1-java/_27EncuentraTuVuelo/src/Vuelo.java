import java.time.LocalDate;

public class Vuelo {

  private String origen;
  private String destino;
  private LocalDate fechaLlegada;
  private int pasajeros;

  public Vuelo(
    String origen,
    String destino,
    LocalDate fechaLlegada,
    int pasajeros
  ) {
    this.origen = origen;
    this.destino = destino;
    this.fechaLlegada = fechaLlegada;
    this.pasajeros = pasajeros;
  }

  public String getOrigen() {
    return origen;
  }

  public String getDestino() {
    return destino;
  }

  public LocalDate getFechaLlegada() {
    return fechaLlegada;
  }

  public int getPasajeros() {
    return pasajeros;
  }

  @Override
  public String toString() {
    return (
      "Vuelo{" +
      "origen='" +
      origen +
      '\'' +
      ", destino='" +
      destino +
      '\'' +
      ", fechaLlegada=" +
      fechaLlegada +
      ", pasajeros=" +
      pasajeros +
      '}'
    );
  }
}
