/* Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.

Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante, también se pueden apoyar de google que hay varios ejemplos. */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _11CalcularEdad {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    System.out.println("Introduzca su fecha de nacimiento (dd-MM-yyyy): ");
    String dateBirth = scanner.nextLine();

    try {
      // Convertimos el String a Date
      Date birthDate = dateFormat.parse(dateBirth);

      // Fecha actual
      Date currentDate = new Date();

      // Convertimos ambas fechas a Calendar
      Calendar birthCalendar = Calendar.getInstance();
      birthCalendar.setTime(birthDate);
      Calendar currentCalendar = Calendar.getInstance();
      currentCalendar.setTime(currentDate);

      int edad =
        currentCalendar.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);

      // Si el cumpleaños ya pasó este año
      if (
        currentCalendar.get(Calendar.DAY_OF_YEAR) <
        birthCalendar.get(Calendar.DAY_OF_YEAR)
      ) {
        edad--;
      }

      System.out.println("Su edad es: " + edad + " años.");
    } catch (ParseException e) {
      System.out.println("Error: Formato de fecha incorrecto. Use dd-MM-yyyy.");
    }

    scanner.close();
  }
}
