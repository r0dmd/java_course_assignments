/* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.

Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).

Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.

Por ejemplo, el resultado podría ser algo así:

La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882 */

import java.util.Scanner;

public class _2DetalleDeFactura {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduzca el nombre de la factura:");
    String nombreDeFactura = scanner.nextLine();

    double producto1 = 0;
    double producto2 = 0;

    // Captura de precios con validación
    while (true) {
      try {
        System.out.println("Introduzca el precio del primer producto:");
        producto1 = scanner.nextDouble();

        System.out.println("Introduzca el precio del segundo producto:");
        producto2 = scanner.nextDouble();
        break; // Salimos del bucle si no hay excepciones
      } catch (Exception e) {
        System.out.println(
          "Error: Debe ingresar un número válido. Inténtelo de nuevo."
        );
        scanner.nextLine(); // Limpiar el buffer
      }
    }

    // Calcular los valores
    double precioTotalBruto = producto1 + producto2;
    double impuesto = precioTotalBruto * 0.19; // 19% de impuesto
    double precioTotalNeto = precioTotalBruto + impuesto;

    // Formateamos la salida final usando String.format
    // % es un marcador de posición
    // Para escribir un % literal sin que sea interpretado como un marcador de posición, se debe escapar duplicándolo, es decir, usando %%
    // %s es para un string
    // %.2f es para un float, para un número con decimales de 2 cifras
    // Usamos \", para incluir comillas dobles dentro del mensaje
    String mensajeFinal = String.format(
      "La factura \"%s\" tiene un total bruto de %.2f, con un impuesto de %.2f (19%%) y el monto después del impuesto es de %.2f.",
      nombreDeFactura,
      precioTotalBruto,
      impuesto,
      precioTotalNeto
    );

    // Imprimir el mensaje final
    System.out.println(mensajeFinal);

    // Cerrar el Scanner
    scanner.close();
  }
}
