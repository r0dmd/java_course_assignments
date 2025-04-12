import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    ContarPalabras contarPalabras = frase -> {
      String[] palabras = frase.split("\\s+");

      Map<String, Integer> conteoPalabras = new HashMap<>();

      for (String palabra : palabras) {
        conteoPalabras.put(
          palabra,
          conteoPalabras.getOrDefault(palabra, 0) + 1
        );
      }

      String palabraMasRepetida = null;
      int maxRepeticiones = 0;
      for (Map.Entry<String, Integer> entry : conteoPalabras.entrySet()) {
        if (entry.getValue() > maxRepeticiones) {
          maxRepeticiones = entry.getValue();
          palabraMasRepetida = entry.getKey();
        }
      }

      return palabraMasRepetida;
    };

    String resultado = contarPalabras.contarYDevolverMasRepetida(
      "frase de de prueba prueba, mundo hola mundo mundo"
    );
    System.out.println("La palabra más repetida es: " + resultado);
  }
}
