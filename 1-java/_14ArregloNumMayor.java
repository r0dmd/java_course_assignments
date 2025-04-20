/* Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo. */

import java.util.Arrays;

public class _14ArregloNumMayor {

  public static void main(String[] args) {
    int arrayLength = 3;
    int[] numArray = new int[arrayLength];

    for (int i = 0; i < arrayLength; i++) {
      numArray[i] = 11 + (int) (Math.random() * 89);
    }
    System.out.println("El arreglo es " + Arrays.toString(numArray));

    int numMayor = numArray[0];
    for (int i = 1; i < arrayLength; i++) {
      if (numArray[i] > numMayor) {
        numMayor = numArray[i];
      }
    }
    System.out.println("El número mayor es " + numMayor);
  }
}
