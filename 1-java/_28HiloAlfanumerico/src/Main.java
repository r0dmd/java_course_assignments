public class Main {

  public static void main(String[] args) {
    Runnable tareaNumero = new AlfanumericoTarea(Tipo.NUMERO);
    Runnable tareaLetra = new AlfanumericoTarea(Tipo.LETRA);

    Thread hiloNumero = new Thread(tareaNumero);
    Thread hiloLetra = new Thread(tareaLetra);

    hiloNumero.start();
    hiloLetra.start();
  }
}
