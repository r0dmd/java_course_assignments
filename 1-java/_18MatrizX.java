/* Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo como relleno. El tamaño de la x se basa en una variable n que indicará el tamaño de la letra para imprimir en una matriz de n x n. El carácter "X" en mayúscula y el guion bajo "_" para los espacios. Por ejemplo, para n=5 se obtiene:
X___X
_X_X_
__X__
_X_X_
X___X

Para n=6 se obtiene:
X____X
_X__X_
__XX__
__XX__
_X__X_
X____X

Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa. */

public class _18MatrizX {

  public static void main(String[] args) {
    int matSize = 7;

    if (matSize == 0) {
      System.out.println("ERROR");
      return;
    }

    char[][] matrix = new char[matSize][matSize];

    for (int i = 0; i < matSize; i++) {
      for (int j = 0; j < matSize; j++) {
        if (i == j || i + j == matSize - 1) {
          matrix[i][j] = 'X';
        } else {
          matrix[i][j] = '_';
        }
      }
    }

    System.out.println("La matriz X es:");
    for (int i = 0; i < matSize; i++) {
      for (int j = 0; j < matSize; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(); // Salto de línea al final de cada fila
    }
  }
}
