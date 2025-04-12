import java.util.Arrays;
import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    int[] numeros = { 1, 2, 4, 5, 7, 8, 45, 67, 89, 23, 3, 4, 6 };

    Function<int[], Integer> obtenerMayor = arr ->
      Arrays.stream(arr).reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

    int numeroMayor = obtenerMayor.apply(numeros);

    System.out.println("El número mayor es: " + numeroMayor);
  }
}
