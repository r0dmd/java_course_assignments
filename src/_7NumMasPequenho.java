/* Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!". */

import java.util.Arrays;
import java.util.Scanner;

public class _7NumMasPequenho {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir la longitud del arreglo al usuario
    System.out.print("Ingrese la cantidad de números (mín. 10): ");
    int numsArrayLength = scanner.nextInt();

    if (numsArrayLength < 10) {
      System.out.println("La cantidad mínima es 10, escoja otro número.");
      main(args);
      System.exit(1);
    }

    int[] numsArray = new int[numsArrayLength];

    // Límite superior para los números aleatorios
    int thresNum = 100;

    // Asignamos números aleatorios entre 0 y 99 al arreglo
    for (int i = 0; i < numsArrayLength; i++) {
      numsArray[i] = (int) (Math.random() * thresNum);
    }

    // Mostrar el arreglo generado
    System.out.println(
      "El arreglo de números a analizar será: " + Arrays.toString(numsArray)
    );

    // Número más pequeño
    int minNum = numsArray[0];
    for (int i = 1; i < numsArrayLength; i++) {
      if (numsArray[i] < minNum) {
        minNum = numsArray[i];
      }
    }
    System.out.println("El número más pequeño es: " + minNum);

    // Comparamos con el número dado, en este caso 10
    int numToCompare = 10;
    String comparisonResult = (minNum < 10)
      ? ("Y es menor que " + numToCompare)
      : (minNum > 10)
        ? ("Y es mayor que " + numToCompare)
        : ("¡Y es igual a " + numToCompare);

    System.out.println(comparisonResult);

    scanner.close();
  }
}
