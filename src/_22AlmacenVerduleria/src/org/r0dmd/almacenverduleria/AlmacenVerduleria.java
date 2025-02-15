package org.r0dmd.almacenverduleria;

public class AlmacenVerduleria {

  public static void main(String[] args) {
    // Dos productos de cada tipo, almacenados en un arreglo de tipo Producto
    Producto[] productos = new Producto[] {
      new Fruta("Manzana", 1.50, 0.5, "Rojo"),
      new Fruta("Plátano", 0.75, 1.2, "Amarillo"),
      new Lacteo("Leche", 2.30, 1, 8),
      new Lacteo("Queso", 4.50, 2, 25),
      new Limpieza("Detergente", 5.99, "Surfactantes", 1.5),
      new Limpieza("Desinfectante", 3.25, "Alcohol", 1.0),
      new NoPerecible("Atún en lata", 2.50, 140, 250),
      new NoPerecible("Arroz", 1.80, 500, 350),
    };

    // Iterar y mostrar la información de cada producto
    System.out.println("=== Inventario del Almacén y Verdulería ===");
    for (Producto producto : productos) {
      System.out.println(producto);
    }
  }
}
