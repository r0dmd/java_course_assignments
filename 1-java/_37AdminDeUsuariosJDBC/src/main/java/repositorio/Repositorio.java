package main.java.repositorio;

import java.util.List;

public interface Repositorio<T> {
  T porId(int id);
  List<T> listar();
  void guardar(T t);
  void eliminar(int id);
}
