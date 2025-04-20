/*
// NOTA: RESUMEN DEL USO DE <T> EN CLASES GENÉRICAS

// 1️⃣ En la declaración de la clase:
//    Se usa <T> para decir que esta clase es genérica y puede trabajar con cualquier tipo.
//    Ejemplo: public class BolsaSupermercado<T> { }

// 2️⃣ En atributos o listas genéricas:
//    Se usa <T> para indicar que la lista o colección contiene elementos del tipo T.
//    Ejemplo: private List<T> productos;

// 3️⃣ En el constructor u otras partes donde ya se declaró T:
//    No es necesario volver a poner <T> porque ya se definió en la clase.
//    Ejemplo: this.productos = new ArrayList<>();

// 4️⃣ En métodos que usan el tipo genérico:
//    El tipo T ya es conocido, así que lo usamos como cualquier otro tipo.
//    Ejemplo: public void addProducto(T producto) { } 
*/

import java.util.ArrayList;
import java.util.List;

// Declaramos la clase, que puede usar cualquier tipo, con el tipo genérico T
public class BolsaSupermercado<T> {

  private List<T> productos; // Lista de productos genéricos
  private final int MAX_PRODUCTOS = 5;

  public BolsaSupermercado() {
    this.productos = new ArrayList<>();
  }

  // Método para añadir producto
  public BolsaSupermercado<T> addProducto(T producto) {
    if (productos.size() < MAX_PRODUCTOS) {
      productos.add(producto);
    } else {
      System.out.println(
        "La bolsa ya está llena, no se pueden agregar más productos."
      );
    }
    return this; // Devolvemos la propia bolsa para encadenar métodos
  }

  // Método para devolver productos
  public List<T> getProductos() {
    return productos;
  }
}
