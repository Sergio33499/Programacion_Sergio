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

    public static void UpdatePilot(Piloto p){
        String sql = "UPDATE drivers SET code=?, forename=?, surname=?, dob=?, nationality=? WHERE driverid=?";
        try(Connection conn = dbProperties.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, p.getCode());
            pstmt.setString(2, p.getForename());
            pstmt.setString(3, p.getSurname());
            pstmt.setDate(4, Date.valueOf(p.getDob()));
            pstmt.setString(5, p.getNationality());
            pstmt.setInt(6, p.getDriverid());
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void DeletePilot(Piloto p){
        String sql = "DELETE FROM drivers WHERE driverid = ?";
        try(Connection conn = dbProperties.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, p.getDriverid());
            pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void ShowPilotClassification(){
        String sql = "SELECT * FROM get_drivers_standings()";
        try(Connection conn = dbProperties.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            System.out.println("CLASIFICACION PILOTOS");
            while (rs.next()){
                System.out.println(rs.getString("driver") + ": " + rs.getInt("points") + " puntos");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void ShowBuildersClassification() {
        String sql = "SELECT c.name, SUM;(res.points) as total_points FROM constructors c JOIN drivers d ON c.constructorid = d.constructorid JOIN results res ON d.driverid = res.driverid GROUP BY c.name ORDER BY total_points DESC";
        try(Connection conn = dbProperties.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            System.out.println("CLASIFICACION DE CONSTRUCTORES");
            while (rs.next()){
                System.out.println(rs.getString("name") + ": " + rs.getInt("total_points") + " puntos");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
