import java.util.Date;

public class EjemploOrdenes {

  public static void main(String[] args) {
    // Órdenes de compra
    OrdenCompra compra1 = new OrdenCompra("Productos tecnológicos.");
    OrdenCompra compra2 = new OrdenCompra("Productos de hogar.");
    OrdenCompra compra3 = new OrdenCompra("Productos de papelería.");

    // Comprador
    Cliente cliente1 = new Cliente("Juan", "Pérez");

    // Asignar cliente y fecha a cada compra
    compra1.setCliente(cliente1);
    compra1.setFecha(new Date());

    compra2.setCliente(cliente1);
    compra2.setFecha(new Date());

    compra3.setCliente(cliente1);
    compra3.setFecha(new Date());

    // Productos
    Producto prod1 = new Producto("Samsung", "Teléfono", 800);
    Producto prod2 = new Producto("Sony", "Audífonos", 150);
    Producto prod3 = new Producto("Apple", "MacBook", 2000);
    Producto prod4 = new Producto("Logitech", "Teclado", 100);

    Producto prod5 = new Producto("IKEA", "Silla", 120);
    Producto prod6 = new Producto("Tefal", "Sartén", 80);
    Producto prod7 = new Producto("Oster", "Licuadora", 90);
    Producto prod8 = new Producto("Samsung", "Microondas", 200);

    Producto prod9 = new Producto("Bic", "Bolígrafo", 2);
    Producto prod10 = new Producto("Staples", "Resma de papel", 10);
    Producto prod11 = new Producto("Moleskine", "Agenda", 25);
    Producto prod12 = new Producto("Faber-Castell", "Lápices de colores", 15);

    // Asignar productos a cada compra
    compra1.addProducto(prod1);
    compra1.addProducto(prod2);
    compra1.addProducto(prod3);
    compra1.addProducto(prod4);

    compra2.addProducto(prod5);
    compra2.addProducto(prod6);
    compra2.addProducto(prod7);
    compra2.addProducto(prod8);

    compra3.addProducto(prod9);
    compra3.addProducto(prod10);
    compra3.addProducto(prod11);
    compra3.addProducto(prod12);

    // Imprimir compras
    imprimirOrden(compra1);
    imprimirOrden(compra2);
    imprimirOrden(compra3);
  }

  ///////////
  // Método para imprimir orden
  public static void imprimirOrden(OrdenCompra pedido) {
    System.out.println("Número de pedido: " + pedido.getIdentificador());
    System.out.println(
      "Cliente: " +
      pedido.getCliente().getNombre() +
      " " +
      pedido.getCliente().getApellido()
    );
    System.out.println("Descripción: " + pedido.getDescripcion());
    System.out.println("Fecha: " + pedido.getFecha());
    System.out.println("Productos:");
    for (Producto p : pedido.getProductos()) {
      if (p != null) {
        System.out.println(
          " - " +
          p.getFabricante() +
          ", " +
          p.getNombre() +
          ", " +
          p.getPrecio() +
          "\u20AC" // €
        );
      }
    }
    System.out.println(
      "El gran total de su compra es: " + pedido.getGranTotal()
    );
  }
}
