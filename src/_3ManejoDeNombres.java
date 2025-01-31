/* La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe */

import java.util.Scanner;

public class _3ManejoDeNombres {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduzca 3 nombres de personas:");
    String name1 = scanner.nextLine();
    String name2 = scanner.nextLine();
    String name3 = scanner.nextLine();

    String name1Parsed =
      name1.toUpperCase().charAt(1) +
      "." +
      name1.substring(name1.length() - 2).toLowerCase();
    String name2Parsed =
      name2.toUpperCase().charAt(1) +
      "." +
      name2.substring(name2.length() - 2).toLowerCase();
    String name3Parsed =
      name3.toUpperCase().charAt(1) +
      "." +
      name3.substring(name3.length() - 2).toLowerCase();

    String allNamesParsed = name1Parsed + "_" + name2Parsed + "_" + name3Parsed;
    System.out.println(allNamesParsed);

    scanner.close();
  }
}
