import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestionVuelos {

  private List<Vuelo> vuelos;

  public GestionVuelos() {
    this.vuelos = new ArrayList<>();
  }

  public void agregarVuelo(Vuelo vuelo) {
    vuelos.add(vuelo);
  }

  public Vuelo obtenerUltimoVuelo() {
    return Collections.max(
      vuelos,
      Comparator.comparing(Vuelo::getFechaLlegada)
    );
  }

  public Vuelo obtenerVueloMenosPasajeros() {
    return Collections.min(
      vuelos,
      Comparator.comparingInt(Vuelo::getPasajeros)
    );
  }

  public void mostrarVuelos() {
    for (Vuelo vuelo : vuelos) {
      System.out.println(vuelo);
    }
  }
}
