public class AlfanumericoTarea implements Runnable {

  private Tipo tipo;

  public AlfanumericoTarea(Tipo tipo) {
    this.tipo = tipo;
  }

  @Override
  public void run() {
    if (tipo == Tipo.NUMERO) {
      for (int i = 1; i < 10; i++) {
        System.out.println(i);
      }
    } else if (tipo == Tipo.LETRA) {
      for (char c = 'A'; c <= 'Z'; c++) {
        System.out.println(c);
      }
    }
  }
}
