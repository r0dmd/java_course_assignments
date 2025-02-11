import java.util.Date;

public class OrdenCompra {

  // ATRIBUTOS
  private Cliente cliente;
  private String descripcion;
  private Date fecha;
  private Integer identificador;
  private Producto[] productos;

  private static int contador = 1; // Para evitar el id 0
  private int indiceProducto = 0;

  // CONSTRUCTOR
  public OrdenCompra(String descripcion) {
    this.identificador = contador++;
    this.descripcion = descripcion;
    this.productos = new Producto[4];
  }

  // GETTERS
  public Cliente getCliente() {
    return cliente;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public Date getFecha() {
    return fecha;
  }

  public Integer getIdentificador() {
    return identificador;
  }

  public Producto[] getProductos() {
    return productos;
  }

  public static int getContador() {
    return contador;
  }

  // SETTERS
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  // MÁS MÉTODOS
  public void addProducto(Producto producto) {
    if (indiceProducto < productos.length) {
      productos[indiceProducto++] = producto;
    } else {
      System.out.println("No se pueden añadir más productos al pedido.");
    }
  }

  public int getGranTotal() {
    int total = 0;
    for (Producto p : productos) {
      // Evitar errores con posiciones vacías
      if (p != null) {
        total += p.getPrecio();
      }
    }
    return total;
  }
}
