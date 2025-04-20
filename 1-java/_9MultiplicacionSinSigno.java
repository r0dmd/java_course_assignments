/* Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo. */

import java.util.Scanner;

public class _9MultiplicacionSinSigno {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir dos números enteros
    System.out.println("Introduzca dos números enteros para multiplicar:");
    int numA = scanner.nextInt();
    int numB = scanner.nextInt();
    int result = 0;

    if (numA == 0 || numB == 0) {
      System.out.println("El resultado de la multiplicación es: 0");
      scanner.close();
      return;
    }

    // Valores absolutos para el bucle
    int absA = Math.abs(numA);
    int absB = Math.abs(numB);
    for (int i = 0; i < absB; i++) {
      result += absA;
    }

    // Ajustar el signo del resutlado
    if ((numA < 0 && numB > 0) || (numA > 0 && numB < 0)) {
      result = -result;
    }

    System.out.println("El resultado de la multiplicación es: " + result);
    scanner.close();
  }
}
