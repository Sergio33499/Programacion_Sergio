package Tema8.EjercicioF12006;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbProperties {
    private static final String URL = "jdbc:postgresql://database-1.cugxoidqvjyr.us-east-1.rds.amazonaws.com:5432/f12006";
    private static final String USER = "maestro";
    private static final String PASS = "maestro1";

    private dbProperties(){}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}