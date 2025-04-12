import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    Function<String, String> procesarFrase = frase -> {
      String sinEspaciosPuntosComasYEnMayus = frase
        .replaceAll("[ ,.]", "")
        .toUpperCase();
      return sinEspaciosPuntosComasYEnMayus;
    };

    String frase = "fra,se, ,  de p.ru.e,ba";
    System.out.println(procesarFrase.apply(frase));
  }
}
