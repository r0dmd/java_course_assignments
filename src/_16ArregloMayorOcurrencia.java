/* Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo. Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:
La mayor ocurrencia es: 3 
El elemento que mas se repite es: 5
En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces. */

import java.util.Scanner;

public class _16ArregloMayorOcurrencia {

  public static void main(String[] args) {
    int arrayLength = 10;
    int[] numArray = new int[arrayLength];

    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Introduzca " + arrayLength + " números enteros de 1 a 9:"
    );

    for (int i = 0; i < arrayLength; i++) {
      while (true) {
        try {
          System.out.print("[" + i + "] -> ");
          int input = Integer.parseInt(scanner.nextLine());

          if (input >= 1 && input <= 9) {
            numArray[i] = input;
            break;
          } else {
            System.out.println("Error: El número debe estar entre 1 y 9.");
          }
        } catch (NumberFormatException e) {
          System.out.println("Error: Debe ingresar un número entero válido.");
          scanner.nextLine(); // Limpiar la entrada incorrecta
        }
      }
    }
    scanner.close();

    int[] contador = new int[arrayLength];
    for (int num : numArray) {
      contador[num]++;
    }

    // Encontrar el número con más ocurrencias
    int mostRepNum = 0, mostReps = 0;
    for (int i = 1; i <= arrayLength - 1; i++) {
      if (contador[i] > mostReps) {
        mostReps = contador[i];
        mostRepNum = i;
      }
    }

    System.out.println(
      "El elemento que más se repite en el arreglo es el número " +
      mostRepNum +
      " con una ocurrencia de " +
      mostReps +
      " veces."
    );
  }
}
