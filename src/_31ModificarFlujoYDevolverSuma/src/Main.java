import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        double resultado = Arrays.stream(numeros)
            .filter(num -> num % 10 != 0)
            .mapToDouble(num -> num / 2.0)
            .reduce(0.0, (a, b) -> a + b);

        System.out.println(resultado);
    }
}
