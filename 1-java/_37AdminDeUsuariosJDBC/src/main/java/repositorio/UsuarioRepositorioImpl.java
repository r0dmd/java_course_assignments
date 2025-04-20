package main.java.repositorio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import main.java.modelo.Usuario;

public class UsuarioRepositorioImpl implements Repositorio<Usuario> {

  private Connection conn;

  public UsuarioRepositorioImpl(Connection conn) {
    this.conn = conn;
  }

  @Override
  public Usuario porId(int id) {
    Usuario usuario = null;
    try (
      PreparedStatement stmt = conn.prepareStatement(
        "SELECT * FROM usuarios WHERE id = ?"
      )
    ) {
      stmt.setInt(1, id);
      ResultSet rs = stmt.executeQuery();
      if (rs.next()) {
        usuario = crearUsuario(rs);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return usuario;
  }

  @Override
  public List<Usuario> listar() {
    List<Usuario> usuarios = new ArrayList<>();
    try (
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")
    ) {
      while (rs.next()) {
        usuarios.add(crearUsuario(rs));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return usuarios;
  }

  @Override
  public void guardar(Usuario usuario) {
    String sql;
    if (usuario.getId() > 0) {
      sql = "UPDATE usuarios SET username=?, password=?, email=? WHERE id=?";
    } else {
      sql = "INSERT INTO usuarios(username, password, email) VALUES (?, ?, ?)";
    }
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setString(1, usuario.getUsername());
      stmt.setString(2, usuario.getPassword());
      stmt.setString(3, usuario.getEmail());
      if (usuario.getId() > 0) {
        stmt.setInt(4, usuario.getId());
      }
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void eliminar(int id) {
    try (
      PreparedStatement stmt = conn.prepareStatement(
        "DELETE FROM usuarios WHERE id=?"
      )
    ) {
      stmt.setInt(1, id);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private Usuario crearUsuario(ResultSet rs) throws SQLException {
    Usuario u = new Usuario();
    u.setId(rs.getInt("id"));
    u.setUsername(rs.getString("username"));
    u.setPassword(rs.getString("password"));
    u.setEmail(rs.getString("email"));
    return u;
  }
}
