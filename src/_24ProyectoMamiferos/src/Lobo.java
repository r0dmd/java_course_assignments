public class Lobo extends Canino {

  private Integer numCamada;
  private String especieLobo;

  public Lobo(
    String habitat,
    Float altura,
    Float largo,
    Float peso,
    String nombreCientifico,
    String color,
    Float tamanoColmillos,
    Integer numCamada,
    String especieLobo
  ) {
    super(
      habitat,
      altura,
      largo,
      peso,
      nombreCientifico,
      color,
      tamanoColmillos
    );
    this.numCamada = numCamada;
    this.especieLobo = especieLobo;
  }

  public Integer getNumCamada() {
    return numCamada;
  }

  public String getEspecieLobo() {
    return especieLobo;
  }

  @Override
  public String comer() {
    return (
      "El lobo " +
      especieLobo +
      " caza en manadas y comparte la comida con su camada de " +
      numCamada +
      " crías."
    );
  }

  @Override
  public String dormir() {
    return "El lobo " + color + " duerme en las cavernas de " + habitat + ".";
  }

  @Override
  public String correr() {
    return "El lobo puede recorrer largas distancias en busca de alimento.";
  }

  @Override
  public String comunicarse() {
    return "El lobo " + especieLobo + " aúlla para comunicarse con su manada.";
  }
}
