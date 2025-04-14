package main.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import main.java.modelo.Usuario;
import main.java.repositorio.UsuarioRepositorioImpl;
import main.java.util.ConexionBaseDatos;

public class Main {

  public static void main(String[] args) {
    try (Connection conn = ConexionBaseDatos.getConnection()) {
      UsuarioRepositorioImpl repo = new UsuarioRepositorioImpl(conn);

      Map<String, Integer> operaciones = new HashMap<>();
      operaciones.put("Actualizar", 1);
      operaciones.put("Eliminar", 2);
      operaciones.put("Agregar", 3);
      operaciones.put("Listar", 4);
      operaciones.put("Salir", 5);

      int opcionIndice = 0;

      do {
        Object[] opArreglo = operaciones.keySet().toArray();
        Object opcion = JOptionPane.showInputDialog(
          null,
          "Seleccione una operación",
          "Administración de usuarios",
          JOptionPane.INFORMATION_MESSAGE,
          null,
          opArreglo,
          opArreglo[0]
        );

        if (opcion == null) {
          JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
          continue;
        }

        opcionIndice = operaciones.get(opcion.toString());

        switch (opcionIndice) {
          case 1 -> {
            int id = Integer.parseInt(
              JOptionPane.showInputDialog(
                "Ingrese el ID del usuario a actualizar"
              )
            );
            Usuario usuario = repo.porId(id);
            if (usuario != null) {
              String username = JOptionPane.showInputDialog(
                "Nuevo username:",
                usuario.getUsername()
              );
              String password = JOptionPane.showInputDialog("Nuevo password:");
              String email = JOptionPane.showInputDialog(
                "Nuevo email:",
                usuario.getEmail()
              );
              usuario.setUsername(username);
              usuario.setPassword(password);
              usuario.setEmail(email);
              repo.guardar(usuario);
            } else {
              JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
          }
          case 2 -> {
            int id = Integer.parseInt(
              JOptionPane.showInputDialog(
                "Ingrese el ID del usuario a eliminar"
              )
            );
            repo.eliminar(id);
          }
          case 3 -> {
            String username = JOptionPane.showInputDialog("Username:");
            String password = JOptionPane.showInputDialog("Password:");
            String email = JOptionPane.showInputDialog("Email:");
            Usuario nuevo = new Usuario(username, password, email);
            repo.guardar(nuevo);
          }
          case 4 -> {
            List<Usuario> usuarios = repo.listar();
            StringBuilder sb = new StringBuilder("Usuarios:\n");
            usuarios.forEach(u -> sb.append(u).append("\n"));
            JOptionPane.showMessageDialog(null, sb.toString());
          }
        }
      } while (opcionIndice != 5);

      JOptionPane.showMessageDialog(null, "Programa finalizado.");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
