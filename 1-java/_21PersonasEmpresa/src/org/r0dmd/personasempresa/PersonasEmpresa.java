package org.r0dmd.personasempresa;

public class PersonasEmpresa {

  public static void main(String[] args) {
    Gerente gerente = new Gerente(
      "Juan",
      "Pérez",
      "1111122A",
      "Av. Principal 123",
      2054.87,
      548,
      10000
    );
    Cliente cliente = new Cliente(
      "Ana",
      "Fernández",
      "1234567M",
      "Calle Secundaria 123"
    );
    Cliente cliente2 = new Cliente(
      "Pepe",
      "Gómez",
      "9999997K",
      "Calle Terciaria 321"
    );

    // Imprimir datos
    System.out.println("=== Datos del gerente ===");
    System.out.println(gerente); // gerente.toString() no sería necesario, se invoca automáticamente

    System.out.println("\n=== Datos de los clientes ===");
    System.out.println(cliente);
    System.out.println("\n" + cliente2);

    // Prueba de métodos
    gerente.aumentarRemuneracion(15);
    gerente.setPresupuesto(24000);

    System.out.println("\n=== Datos del gerente tras la actualización ===");
    System.out.println(gerente);
  }
}
