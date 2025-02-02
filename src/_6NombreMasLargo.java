/* Obtener el nombre mas largo de tres personas, según los siguientes requerimientos:
- Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
- Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
- Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
- Restricción: no usar loops en el desarrollo de la tarea.
- Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo." */

import javax.swing.JOptionPane;

public class _6NombreMasLargo {

  public static void main(String[] args) {
    // Tomamos los nombres completos con apellidos
    String fullName1 = JOptionPane.showInputDialog(
      null,
      "Introduzca un nombre completo (con apellidos):"
    );
    String fullName2 = JOptionPane.showInputDialog(null, "Introduzca otro:");
    String fullName3 = JOptionPane.showInputDialog(
      null,
      "Introduzca un tercero:"
    );

    // Obtenemos solo el nombre
    String name1 = fullName1.split(" ")[0];
    String name2 = fullName2.split(" ")[0];
    String name3 = fullName3.split(" ")[0];

    // Obtenemos las longitudes de los nombres
    int name1Lgth = name1.length();
    int name2Lgth = name2.length();
    int name3Lgth = name3.length();

    // Determinamos el nombre más largo
    String longestName = (name1Lgth >= name2Lgth && name1Lgth >= name3Lgth)
      ? name1
      : (name2Lgth >= name1Lgth && name2Lgth >= name3Lgth) ? name2 : name3;

    // Mostramos el resultado
    JOptionPane.showMessageDialog(
      null,
      longestName + " tiene el nombre más largo."
    );
  }
}
/* SOLUCIÓN DEL PROFESOR
 * import javax.swing.JOptionPane;

public class ProgramaNombreMasLargo {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;
        
        System.out.println("La persona con el nombre mas largo es " + max);
    }
} 
 */
