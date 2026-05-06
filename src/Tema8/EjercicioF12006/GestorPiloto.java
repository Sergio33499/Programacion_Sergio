package Tema8.EjercicioF12006;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GestorPiloto {

    public static void CreatePilot(Piloto p) {
        String sql = "INSERT INTO drivers (code, forename, surname, dob, nationality) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = dbProperties.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, p.getCode());
            pstmt.setString(2, p.getForename());
            pstmt.setString(3, p.getSurname());
            pstmt.setDate(4, Date.valueOf(p.getDob()));
            pstmt.setString(5, p.getNationality());

            pstmt.executeUpdate();
            System.out.println("Piloto creado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear piloto: " + e.getMessage());
        }
    }

    public static Piloto ReadPilot(int id) {
        String sql = "SELECT * FROM drivers WHERE driverid = ?";
        try (Connection conn = dbProperties.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Piloto(rs.getInt("driverid"), rs.getString("code"),
                        rs.getString("forename"), rs.getString("surname"),
                        rs.getString("dob"), rs.getString("nationality"));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return null;
    }

    public static List<Piloto> ReadPilots() {
        List<Piloto> lista = new ArrayList<>();
        String sql = "SELECT * FROM drivers";
        try (Connection conn = dbProperties.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Piloto(rs.getInt("driverid"), rs.getString("code"),
                        rs.getString("forename"), rs.getString("surname"),
                        rs.getString("dob"), rs.getString("nationality")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }



}
