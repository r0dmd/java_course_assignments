public class EjemploMamiferos {

  public static void main(String[] args) {
    Mamifero[] mamiferos = new Mamifero[5];

    mamiferos[0] = new Leon(
      "Sabana",
      1.2f,
      2.5f,
      190f,
      "Panthera leo",
      5.0f,
      80,
      10,
      114.0f
    );
    mamiferos[1] = new Tigre(
      "Selva",
      1.1f,
      2.8f,
      220f,
      "Panthera tigris",
      6.0f,
      65,
      "Bengala"
    );
    mamiferos[2] = new Guepardo(
      "Sabanas africanas",
      0.9f,
      2.2f,
      72f,
      "Acinonyx jubatus",
      3.5f,
      120
    );
    mamiferos[3] = new Lobo(
      "Bosques",
      0.8f,
      1.5f,
      45f,
      "Canis lupus",
      "Gris",
      4.5f,
      5,
      "Lobo ibérico"
    );
    mamiferos[4] = new Perro(
      "África",
      0.75f,
      1.4f,
      30f,
      "Lycaon pictus",
      "Manchado",
      3.8f,
      317
    );

    for (Mamifero mamifero : mamiferos) {
      System.out.println(
        "----- " + mamifero.getClass().getSimpleName() + " -----"
      );
      System.out.println("Hábitat: " + mamifero.getHabitat());
      System.out.println("Altura: " + mamifero.getAltura() + " m");
      System.out.println("Largo: " + mamifero.getLargo() + " m");
      System.out.println("Peso: " + mamifero.getPeso() + " kg");
      System.out.println(
        "Nombre Científico: " + mamifero.getNombreCientifico()
      );
      System.out.println(mamifero.comer());
      System.out.println(mamifero.dormir());
      System.out.println(mamifero.correr());
      System.out.println(mamifero.comunicarse());
      System.out.println();
    }
  }
}
