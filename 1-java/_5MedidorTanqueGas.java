/* Suponiendo un tanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del tanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
- Si la capacidad actual es 70 litros: imprimir Tanque lleno
- Si está entre 60 y menor a 70: imprimir Tanque casi lleno
- Si está entre 40 y menor a 60: imprimir Tanque 3/4
- Si está entre 35 y menor a 40: imprimir Medio tanque 
- Si está entre 20 y menor a 35: imprimir Suficiente
- Si está entre 1 y menor a 20: imprimir Insuficiente */

import javax.swing.JOptionPane;

public class _5MedidorTanqueGas {

  public static void main(String[] args) {
    double tankCapacity = 70;

    String numStr = JOptionPane.showInputDialog(
      null,
      "Ingrese el nivel del tanque de gasolina en litros:"
    );

    double gasLvl = Double.parseDouble(numStr);

    if (gasLvl > tankCapacity) {
      JOptionPane.showMessageDialog(
        null,
        "El volumen introducido excede la capacidad del tanque."
      );
      return;
    }

    String message = (gasLvl == tankCapacity)
      ? "Tanque lleno"
      : (gasLvl >= 60)
        ? "Tanque casi lleno"
        : (gasLvl >= 40)
          ? "Tanque 3/4"
          : (gasLvl >= 35)
            ? "Medio tanque"
            : (gasLvl >= 20)
              ? "Suficiente"
              : (gasLvl >= 1) ? "Insuficiente" : "Tanque vacío";

    JOptionPane.showMessageDialog(
      null,
      "El nivel actual de gasolina es:\n" + message
    );
  }
}
