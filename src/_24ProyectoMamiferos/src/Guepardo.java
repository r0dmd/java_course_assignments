public class Guepardo extends Felino {

  public Guepardo(
    String habitat,
    Float altura,
    Float largo,
    Float peso,
    String nombreCientifico,
    Float tamanoGarras,
    Integer velocidad
  ) {
    super(
      habitat,
      altura,
      largo,
      peso,
      nombreCientifico,
      tamanoGarras,
      velocidad
    );
  }

  @Override
  public String comer() {
    return "El guepardo caza en solitario usando su increíble velocidad.";
  }

  @Override
  public String dormir() {
    return (
      "El guepardo duerme en zonas elevadas para vigilar su territorio en " +
      habitat +
      "."
    );
  }

  @Override
  public String correr() {
    return (
      "El guepardo es el mamífero terrestre más rápido y puede alcanzar hasta " +
      velocidad +
      " km/h."
    );
  }

  @Override
  public String comunicarse() {
    return "El guepardo emite sonidos agudos y silbidos para comunicarse con su cría.";
  }
}
