public class TvLcd extends Electronico {

  private int pulgadas;

  public TvLcd(int precio, String fabricante, int pulgadas) {
    super(precio, fabricante);
    this.pulgadas = pulgadas;
  }

  @Override
  public double getPrecioVenta() {
    return getPrecio() * 1.20;
  }

  public int getPulgadas() {
    return pulgadas;
  }
}
