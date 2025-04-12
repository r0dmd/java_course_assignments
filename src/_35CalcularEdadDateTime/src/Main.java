import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(
      "Ingrese su fecha de nacimiento (en formato yyyy-MM-dd: )"
    );
    String input = scanner.nextLine();

    LocalDate fechaNacimiento = LocalDate.parse(input);
    LocalDate fechaActual = LocalDate.now();

    int edad = Period.between(fechaNacimiento, fechaActual).getYears();

    System.out.println("Su edad es de: " + edad);

    scanner.close();
  }
}
