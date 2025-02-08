/* Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.

Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma. Por ejemplo, para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
1: ***
2: 
3: *
4: *****
5: *
6: **
 */

import java.util.Arrays;

public class _17HistogramaArreglo {

  public static void main(String[] args) {
    int arrLgth = 12;
    int[] numArr = new int[arrLgth];

    for (int i = 0; i < arrLgth; i++) {
      numArr[i] = (int) ((Math.random() * 6) + 1);
    }
    System.out.println("El arreglo de números es " + Arrays.toString(numArr));

    int[] counterArr = new int[6]; // Para contar del 1 al 6
    for (int i = 0; i < arrLgth; i++) {
      int num = numArr[i];
      counterArr[num - 1]++;
    }

    for (int i = 0; i < 6; i++) {
      System.out.print((i + 1) + ": "); // Muestra el número (1-6)

      // Imprimir asteriscos
      for (int j = 0; j < counterArr[i]; j++) {
        System.out.print("*");
      }

      System.out.println(); // Salto de línea
    }
  }
}
