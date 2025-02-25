public class EjemploCarroSupermercado {

  public static void main(String[] args) {
    System.out.println("BIENVENIDO AL SUPERMERCADO");

    // Creamos bolsas y añadimos productos.
    // Usamos <Lacteo> para indicar que esta bolsa solo aceptará objetos de esa clase.
    // Esto nos permite agregar productos sin necesidad de hacer cast y asegurando el tipo correcto.
    // Explicitamos <Lacteo> tras el new porque no siempre Java adivina el tipo y pone por defecto Object.
    BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<Lacteo>()
      .addProducto(new Lacteo("Queso Cheddar", 4.50, 1, 10))
      .addProducto(new Lacteo("Leche Entera", 2.00, 1, 8))
      .addProducto(new Lacteo("Yogurt Natural", 1.50, 1, 5))
      .addProducto(new Lacteo("Mantequilla", 3.20, 1, 12))
      .addProducto(new Lacteo("Crema de Leche", 2.80, 1, 6));

    BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<Fruta>()
      .addProducto(new Fruta("Manzana", 1.20, 0.5, "Rojo"))
      .addProducto(new Fruta("Banana", 0.80, 1.0, "Amarillo"))
      .addProducto(new Fruta("Naranja", 1.00, 0.7, "Naranja"))
      .addProducto(new Fruta("Pera", 1.50, 0.6, "Verde"))
      .addProducto(new Fruta("Uva", 2.00, 0.3, "Morado"));

    BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<
      NoPerecible
    >()
      .addProducto(new NoPerecible("Arroz", 3.00, 2, 1500))
      .addProducto(new NoPerecible("Lentejas", 2.50, 1, 1200))
      .addProducto(new NoPerecible("Atún", 4.00, 1, 800))
      .addProducto(new NoPerecible("Pasta", 2.00, 1, 1000))
      .addProducto(new NoPerecible("Harina", 1.80, 1, 900));

    BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<
      Limpieza
    >()
      .addProducto(new Limpieza("Detergente", 5.00, "Agentes limpiadores", 1.0))
      .addProducto(
        new Limpieza("Desinfectante", 4.50, "Cloro y fragancia", 0.5)
      )
      .addProducto(new Limpieza("Esponja", 1.00, "Fibra sintética", 3.0)) // Suponiendo como unidades
      .addProducto(new Limpieza("Jabón", 2.00, "Glicerina y esencias", 0.2))
      .addProducto(
        new Limpieza("Limpiavidrios", 3.50, "Alcohol y amoniaco", 0.75)
      );

    // IMPRIMIMOS PRODUCTOS
    System.out.println("\nProductos lácteos:");
    for (Lacteo lacteo : bolsaLacteos.getProductos()) {
      System.out.println("Nombre: " + lacteo.getNombre());
      System.out.println("Precio: $" + lacteo.getPrecio());
      System.out.println("Cantidad: " + lacteo.getCantidad() + " unidades");
      System.out.println("Proteínas: " + lacteo.getProteinas() + "g");
      System.out.println("--------------------------");
    }

    System.out.println("\nFrutas:");
    for (Fruta fruta : bolsaFrutas.getProductos()) {
      System.out.println("Nombre: " + fruta.getNombre());
      System.out.println("Precio: $" + fruta.getPrecio());
      System.out.println("Peso: " + fruta.getPeso() + " kg");
      System.out.println("Color: " + fruta.getColor());
      System.out.println("--------------------------");
    }

    System.out.println("\nProductos no perecibles:");
    for (NoPerecible noPerecible : bolsaNoPerecibles.getProductos()) {
      System.out.println("Nombre: " + noPerecible.getNombre());
      System.out.println("Precio: $" + noPerecible.getPrecio());
      System.out.println(
        "Contenido: " + noPerecible.getContenido() + " unidades"
      );
      System.out.println("Calorías: " + noPerecible.getCalorias() + " kcal");
      System.out.println("--------------------------");
    }

    System.out.println("\nProductos de limpieza:");
    for (Limpieza limpieza : bolsaLimpiezas.getProductos()) {
      System.out.println("Nombre: " + limpieza.getNombre());
      System.out.println("Precio: $" + limpieza.getPrecio());
      System.out.println("Componentes: " + limpieza.getComponentes());
      System.out.println("Litros: " + limpieza.getLitros() + " L");
      System.out.println("--------------------------");
    }
  }
}
