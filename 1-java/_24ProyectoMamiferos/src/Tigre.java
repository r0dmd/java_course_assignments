public class Tigre extends Felino {

  private String especieTigre;

  public Tigre(
    String habitat,
    Float altura,
    Float largo,
    Float peso,
    String nombreCientifico,
    Float tamanoGarras,
    Integer velocidad,
    String especieTigre
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
    this.especieTigre = especieTigre;
  }

  public String getEspecieTigre() {
    return especieTigre;
  }

  @Override
  public String comer() {
    return (
      "El tigre de la especie " +
      especieTigre +
      " acecha sigilosamente a su presa antes de atacar."
    );
  }

  @Override
  public String dormir() {
    return (
      "El tigre de la especie " +
      especieTigre +
      " duerme entre la densa vegetación de " +
      habitat +
      "."
    );
  }

  @Override
  public String correr() {
    return (
      "El tigre puede alcanzar velocidades de hasta " +
      velocidad +
      " km/h en cortas distancias."
    );
  }

  @Override
  public String comunicarse() {
    return (
      "El tigre de la especie " +
      especieTigre +
      " ruge para marcar su territorio en la selva."
    );
  }
}
