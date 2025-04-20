/* Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa. */

import java.util.Scanner;

public class _8PromedioDeNotas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int totalGrades = 20;
    double sumAbove5 = 0, sumBelow4 = 0, sumTotal = 0;
    int countAbove5 = 0, countBelow4 = 0, countOnes = 0;

    System.out.println(
      "Ingrese hasta " + totalGrades + " notas finales (1 a 7):"
    );

    for (int i = 0; i < totalGrades; i++) {
      System.out.print("Nota " + (i + 1) + ": ");
      double grade = scanner.nextDouble();

      if (grade == 0 || grade > 7) {
        System.out.println(
          "Error: La nota introducida está fuera del rango permitido. Inténtelo de nuevo."
        );
        scanner.close();
        System.exit(1);
      }

      // Sumar al total
      sumTotal += grade;

      // Contar notas mayores a 5
      if (grade > 5) {
        sumAbove5 += grade;
        countAbove5++;
      }

      // Contar notas menores a 4
      if (grade < 4) {
        sumBelow4 += grade;
        countBelow4++;
      }

      // Contar notas igual a 1
      if (grade == 1) {
        countOnes++;
      }
    }

    scanner.close();

    // Cálculo de promedios
    double avgAbove5 = sumAbove5 / countAbove5;
    double avgBelow4 = sumBelow4 / countBelow4;
    double avgTotal = sumTotal / totalGrades;

    // Mostrar resultados
    System.out.println("\n--- Resultados ---");
    System.out.println("Promedio de notas > 5:" + avgAbove5);
    System.out.println("Promedio de notas < 4: " + avgBelow4);
    System.out.println("Cantidad de notas 1: " + countOnes);
    System.out.println("Promedio total: " + avgTotal);
  }
}
