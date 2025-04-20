/* Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos, el promedio de los negativos y contar el número de ceros. */

import java.util.Scanner;

public class _15PromediosNumArray {

  public static void main(String[] args) {
    int arrayLength = 7, totalOfPos = 0, totalOfNeg = 0, totalOfZeros = 0;
    double posAvg = 0, negAvg = 0;
    int[] numArray = new int[arrayLength];

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca " + arrayLength + " números enteros:");

    for (int i = 0; i < arrayLength; i++) {
      while (true) { // Bucle hasta que el usuario ingrese un número válido
        try {
          System.out.print("[" + i + "] -> ");
          numArray[i] = Integer.parseInt(scanner.nextLine());
          break; // Si la entrada es válida, salimos del bucle
        } catch (NumberFormatException e) {
          System.out.println("Error: Debe ingresar un número entero.");
        }
      }
    }

    for (int num : numArray) {
      if (num > 0) {
        posAvg += num;
        totalOfPos++;
      } else if (num < 0) {
        negAvg += num;
        totalOfNeg++;
      } else {
        totalOfZeros++;
      }
    }

    // Evitar división por cero
    posAvg = (totalOfPos > 0) ? (posAvg / totalOfPos) : 0;
    negAvg = (totalOfNeg > 0) ? (negAvg / totalOfNeg) : 0;

    System.out.println(
      "El promedio de los números positivos es " +
      posAvg +
      ", el promedio de los negativos es " +
      negAvg +
      ", y el número de ceros es " +
      totalOfZeros +
      "."
    );

    scanner.close();
  }
}
