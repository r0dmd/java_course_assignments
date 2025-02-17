public class Leon extends Felino {

  private Integer numManada;
  private Float potenciaRugidoDecibeles;

  public Leon(
    String habitat,
    Float altura,
    Float largo,
    Float peso,
    String nombreCientifico,
    Float tamanoGarras,
    Integer velocidad,
    Integer numManada,
    Float potenciaRugidoDecibeles
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
    this.numManada = numManada;
    this.potenciaRugidoDecibeles = potenciaRugidoDecibeles;
  }

  public Integer getNumManada() {
    return numManada;
  }

  public Float getPotenciaRugidoDecibeles() {
    return potenciaRugidoDecibeles;
  }

  @Override
  public String comer() {
    return (
      "El león caza junto a su grupo de " +
      numManada +
      " individuos en las llanuras africanas."
    );
  }

  @Override
  public String dormir() {
    return "El león duerme bajo la sombra en el hábitat de " + habitat;
  }

  @Override
  public String correr() {
    return (
      "El león corre a una velocidad de " + velocidad + " km/h para cazar."
    );
  }

  @Override
  public String comunicarse() {
    return (
      "El león ruge con una potencia de " +
      potenciaRugidoDecibeles +
      " dB para marcar su territorio."
    );
  }
}
