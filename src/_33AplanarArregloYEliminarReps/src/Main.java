import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    String[][] lenguajes = {
      { "java", "groovy" },
      { "php" },
      { "c#", "python", "groovy" },
      { "java", "javascript", "kotlin" },
      { "javascript" },
      {},
    };

    List<String> lenguajesUnicos = Arrays.stream(lenguajes)
      .flatMap(Arrays::stream)
      .distinct()
      .collect(Collectors.toList());

    System.out.println(lenguajesUnicos);
  }
}
