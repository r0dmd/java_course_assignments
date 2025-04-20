package main.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

  private static String url =
    "jdbc:mysql://localhost:3306/tarea-admin-usuarios-jdbc";
  private static String username = "root";
  private static String password = "123456";

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(url, username, password);
  }
}
