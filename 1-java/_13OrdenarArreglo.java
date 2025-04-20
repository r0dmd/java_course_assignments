/* Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente. */

import java.util.Arrays;
import java.util.Scanner;

public class _13OrdenarArreglo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int arrLength = 10;
    int[] numArray = new int[arrLength];

    System.out.println("Introduzca " + arrLength + " números enteros:");
    for (int i = 0; i < arrLength; i++) {
      while (true) { // Bucle infinito hasta que ingrese un número válido
        try {
          System.out.print("[" + i + "] -> ");
          numArray[i] = scanner.nextInt();
          break; // Si la entrada es válida, salimos del bucle
        } catch (Exception e) {
          System.out.println("Error: Debe ingresar un número entero.");
          scanner.next(); // Limpiar la entrada incorrecta para evitar un bucle infinito
        }
      }
    }

    System.out.println(
      "El arreglo de números introducidos es:\n" + Arrays.toString(numArray)
    );

    // Mostrarlos en el orden indicado
    System.out.println(
      "Números ordenados (último, primero, penúltimo, segundo, etc.):"
    );
    int left = 0; // Índice del primer elemento
    int right = arrLength - 1; // Índice del último elemento
    while (left <= right) {
      if (left != right) {
        System.out.print(numArray[right] + " "); // Último, penúltimo, etc.
        System.out.print(numArray[left] + " "); // Primero, segundo, etc.
      } else {
        // Para manejar un posible caso en que quede un impar, que imprima el del medio
        System.out.print(numArray[right]);
      }
      left++;
      right--;
    }

    scanner.close();
  }
}
