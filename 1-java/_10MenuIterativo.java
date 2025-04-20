/* Para la tarea se requiere un menú para administrar los productos con las opciones: actualizar, eliminar, crear, listar y salir.

Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un numero. */

import java.util.Scanner;

public class _10MenuIterativo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userSelection;

    do {
      System.out.println("\nSeleccione una de las siguientes opciones:");
      System.out.println("1. Actualizar");
      System.out.println("2. Eliminar");
      System.out.println("3. Crear");
      System.out.println("4. Listar");
      System.out.println("5. Salir");
      System.out.print("Opción: ");

      userSelection = scanner.nextInt();
      scanner.nextLine();

      switch (userSelection) {
        case 1:
          System.out.println("Producto actualizado correctamente.");
          break;
        case 2:
          System.out.println("Producto eliminado correctamente.");
          break;
        case 3:
          System.out.print("Introduzca el nombre del nuevo producto: ");
          String newProductName = scanner.nextLine();
          System.out.println(
            "El producto '" + newProductName + "' ha sido añadido."
          );
          break;
        case 4:
          System.out.println("Lista de productos.");
          break;
        case 5:
          System.out.println("Programa cerrado.");
          break;
        default:
          System.out.println("Selección inválida, inténtelo de nuevo.");
      }
    } while (userSelection != 5);

    scanner.close();
  }
}
/* O bien! otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces graficas de la siguiente forma:

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ProgramaMenuOpcionesIterativo {

    public static void main(String[] args) {
        int opcionIndice = 0;
        do {

            // los Map (o mapas) los veremos mas adelante en el curso en profundidad
            // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
            // también se les conoce como diccionarios para almacenar datos en base a un nombre.
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Operación", "Mantenedor de Usuario", JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                String mensaje = null;

                switch (opcionIndice) {
                    case 1 -> {
                        mensaje = "Usuario actualizado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 2 -> {
                        mensaje = "Usuario eliminado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 3 -> {
                        mensaje = "Usuario agregado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 4 -> {
                        mensaje = "Listando a los usuarios";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                }
            }

        } while (opcionIndice != 5);

        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
    }
}

Según el numero ingresado usar un if o switch para implementar cada una de las 4 operaciones y 5 para salir.

Dentro de cada sentencia o switch imprimir un texto relacionado a la opción, por ejemplo para actualizar:

JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");

o mediante sout en consola:

System.out.println("Usuario actualizado correctamente");

Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.

Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir, al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe mostrar el mensaje "Has salido con exito!" y finalizar el programa. */
