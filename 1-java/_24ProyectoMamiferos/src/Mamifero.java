public abstract class Mamifero {

  protected String habitat;
  protected Float altura;
  protected Float largo;
  protected Float peso;
  protected String nombreCientifico;

  public Mamifero(
    String habitat,
    Float altura,
    Float largo,
    Float peso,
    String nombreCientifico
  ) {
    this.habitat = habitat;
    this.altura = altura;
    this.largo = largo;
    this.peso = peso;
    this.nombreCientifico = nombreCientifico;
  }

  public String getHabitat() {
    return habitat;
  }

  public double getAltura() {
    return altura;
  }

  public double getLargo() {
    return largo;
  }

  public float getPeso() {
    return peso;
  }

  public String getNombreCientifico() {
    return nombreCientifico;
  }

  public abstract String comer();

  public abstract String dormir();

  public abstract String correr();

  public abstract String comunicarse();
}
