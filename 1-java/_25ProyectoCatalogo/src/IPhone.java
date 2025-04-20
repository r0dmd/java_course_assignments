public class IPhone extends Electronico {

  private String color;
  private String modelo;

  public IPhone(int precio, String fabricante, String color, String modelo) {
    super(precio, fabricante);
    this.color = color;
    this.modelo = modelo;
  }

  @Override
  public double getPrecioVenta() {
    return getPrecio() * 1.15; // Se asume un 15% de margen de venta
  }

  public String getColor() {
    return color;
  }

  public String getModelo() {
    return modelo;
  }
}
