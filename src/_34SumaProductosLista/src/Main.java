import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Producto> productos = Arrays.asList(
      new Producto(10.5, 3),
      new Producto(15.0, 2),
      new Producto(11.25, 7),
      new Producto(25.0, 1)
    );

    double granTotal = productos
      .stream()
      .mapToDouble(p -> p.getPrecio() * p.getCantidad())
      .sum();

    System.out.println("El gran total es: " + granTotal);
  }
}
