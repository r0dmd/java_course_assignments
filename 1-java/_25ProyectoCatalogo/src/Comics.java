import java.util.Date;

public class Comics extends Libro {

  private String personaje;

  public Comics(
    int precio,
    Date fechaPublicacion,
    String autor,
    String titulo,
    String editorial,
    String personaje
  ) {
    super(precio, fechaPublicacion, autor, titulo, editorial);
    this.personaje = personaje;
  }

  @Override
  public double getPrecioVenta() {
    return getPrecio() * 1.10; // Margen del 10%
  }

  public String getPersonaje() {
    return personaje;
  }
}
