public class Perro extends Canino {

  private Integer fuerzaMordida;

  public Perro(
    String habitat,
    Float altura,
    Float largo,
    Float peso,
    String nombreCientifico,
    String color,
    Float tamanoColmillos,
    Integer fuerzaMordida
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
    this.fuerzaMordida = fuerzaMordida;
  }

  public Integer getFuerzaMordida() {
    return fuerzaMordida;
  }

  @Override
  public String comer() {
    return (
      "El perro salvaje africano caza en grupos y utiliza su mordida de " +
      fuerzaMordida +
      " PSI para desgarrar la presa."
    );
  }

  @Override
  public String dormir() {
    return (
      "El perro salvaje africano descansa en su madriguera en " + habitat + "."
    );
  }

  @Override
  public String correr() {
    return "El perro salvaje africano puede correr largas distancias en busca de comida.";
  }

  @Override
  public String comunicarse() {
    return "El perro salvaje africano usa ladridos y chillidos para comunicarse con su manada.";
  }
}
