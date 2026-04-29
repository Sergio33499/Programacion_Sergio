package Tema8.Ejercicio_Hogwarts;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    private static final String URL = "jdbc:postgresql://database-1.cugxoidqvjyr.us-east-1.rds.amazonaws.com:5432/hogwarts";
    private static final String USER = "maestro";
    private static final String PASS = "maestro1";

    public static List<Asignatura> listarAsignaturas() {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT nombre, aula, obligatoria FROM Asignatura";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Asignatura asig = new Asignatura();
                asig.setNombre(rs.getString("nombre"));
                asig.setAula(rs.getString("aula"));
                asig.setObligatoria(rs.getBoolean("obligatoria"));
                lista.add(asig);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }

    public static void consultarEstudiantesPorCasa(String casa) {
        String sql = "SELECT E.nombre, E.apellido FROM Estudiante E JOIN Casa C ON E.id_casa = C.id_casa WHERE C.nombre = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, casa);
            ResultSet rs = ps.executeQuery();
            System.out.println("Estudiantes de " + casa + ":");
            while (rs.next()) {
                System.out.println("- " + rs.getString("apellido") + ", " + rs.getString("nombre"));
            }
        } catch (SQLException e) { System.err.println(e.getMessage()); }
      }

    public static void obtenerMascotaEstudiante(String nombre, String apellido) {
        String sql = "SELECT M.nombre FROM Mascota M JOIN Estudiante E ON M.id_estudiante = E.id_estudiante WHERE E.nombre = ? AND E.apellido = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) System.out.println("Mascota de " + nombre + ": " + rs.getString(1));
            else System.out.println(nombre + " no tiene mascota.");
        } catch (SQLException e) { System.err.println(e.getMessage()); }
    }
    }
