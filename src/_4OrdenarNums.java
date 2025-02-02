/* El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.

Podría ser utilizando operador ternario. */

import java.util.Scanner;

public class _4OrdenarNums {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca un número:");
    double num1 = sc.nextDouble();

    System.out.println("Introduzca otro número:");
    double num2 = sc.nextDouble();

    String resultado = (num1 > num2)
      ? (num1 + " " + num2)
      : (num2 + " " + num1);

    System.out.println("De mayor a menor: " + resultado);
    sc.close();
  }
}
