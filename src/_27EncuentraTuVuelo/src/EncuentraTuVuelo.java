import java.time.LocalDate;

public class EncuentraTuVuelo {

  public static void main(String[] args) {
    GestionVuelos gestion = new GestionVuelos();

    // Agregamos vuelos
    gestion.agregarVuelo(
      new Vuelo("Lima", "Buenos Aires", LocalDate.of(2024, 3, 10), 150)
    );
    gestion.agregarVuelo(
      new Vuelo("Madrid", "París", LocalDate.of(2024, 3, 15), 120)
    );
    gestion.agregarVuelo(
      new Vuelo("New York", "Los Ángeles", LocalDate.of(2024, 3, 12), 50)
    );

    // MOstramos vuelos
    System.out.println("Lista de vuelos:");
    gestion.mostrarVuelos();

    // Último vuelo en llegar
    System.out.println("\nÚltimo vuelo en llegar:");
    System.out.println(gestion.obtenerUltimoVuelo());

    // Vuelo con menos pasajeros
    System.out.println("\nVuelo con menos pasajeros:");
    System.out.println(gestion.obtenerVueloMenosPasajeros());
  }
}
