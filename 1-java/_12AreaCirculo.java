/* Pedir el radio de un círculo y calcular su área. utilizar la formula:
area = PI*r² (Constante PI multiplicado por el radio al cuadrado).

 */

import javax.swing.JOptionPane;

public class _12AreaCirculo {

  public static void main(String[] args) {
    String radiusStr = JOptionPane.showInputDialog(
      null,
      "Introduzca el radio",
      "Calculadora de área de un círculo",
      1
    );

    try {
      double radius = Double.parseDouble(radiusStr);
      if (radius <= 0) {
        JOptionPane.showMessageDialog(
          null,
          "El radio debe ser un número positivo",
          "Error",
          JOptionPane.ERROR_MESSAGE
        );
        return;
      }

      double area = Math.PI * Math.pow(radius, 2);

      JOptionPane.showMessageDialog(
        null,
        "El área de un círculo con radio " + radius + " es " + area
      );
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(
        null,
        "Entrada no válida",
        "Error",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }
}
