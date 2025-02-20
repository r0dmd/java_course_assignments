import java.util.Date;

public class ProyectoCatalogo {

  public static void main(String[] args) {
    IProducto[] productos = new IProducto[5];

    productos[0] = new IPhone(1200000, "Apple", "Negro", "iPhone 14");
    productos[1] = new TvLcd(800000, "Samsung", 55);
    productos[2] = new Libro(
      18000,
      new Date(),
      "Eric Gamma",
      "Elementos Reusables POO",
      "Alguna Editorial"
    );
    productos[3] = new Libro(
      14000,
      new Date(),
      "Martin Fowler",
      "UML Gota a Gota",
      "Otra Editorial"
    );
    productos[4] = new Comics(
      20000,
      new Date(),
      "Stan Lee",
      "Spider-Man",
      "Marvel",
      "Spider-Man"
    );

    for (IProducto producto : productos) {
      System.out.println("==============");
      System.out.println("Precio: $" + producto.getPrecio());
      System.out.println("Precio Venta: $" + producto.getPrecioVenta());

      if (producto instanceof Electronico) {
        System.out.println(
          "Fabricante: " + ((Electronico) producto).getFabricante()
        );
      }
      if (producto instanceof IPhone) {
        IPhone iphone = (IPhone) producto;
        System.out.println("Modelo: " + iphone.getModelo());
        System.out.println("Color: " + iphone.getColor());
      }
      if (producto instanceof TvLcd) {
        System.out.println("Pulgadas: " + ((TvLcd) producto).getPulgadas());
      }
      if (producto instanceof Libro) {
        Libro libro = (Libro) producto;
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Editorial: " + libro.getEditorial());
        System.out.println(
          "Fecha de Publicación: " + libro.getFechaPublicacion()
        );
      }
      if (producto instanceof Comics) {
        System.out.println("Personaje: " + ((Comics) producto).getPersonaje());
      }
    }
  }
}
