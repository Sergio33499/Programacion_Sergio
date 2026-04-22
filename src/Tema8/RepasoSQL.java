package Tema8;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args){
        //Saco la consulta fuera, para poderla usar en el PreparedStatement del try
        //opcion 2: PreparedStatement
        try(Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sergiopuig")){
            String sentenciaSQL = "SELECT nombre, apellido FROM Profesor";
            PreparedStatement sentencia = con.prepareStatement(sentenciaSQL);

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                System.out.println("Profesor: " + resultados.getString("apellido") + ", " + resultados.getString("nombre"));
            }

            // sentencia 2
            String sentenciaSQL2 = "SELECT nombre, apellido FROM Estudiante WHERE fecha_nacimiento > '1980-01-01'";
            PreparedStatement sentencia2 = con.prepareStatement(sentenciaSQL2);

            ResultSet resultados2 = sentencia2.executeQuery();

            while(resultados2.next()){
                System.out.println("Estudiante >1980: " + resultados2.getString("apellido") + ", " + resultados2.getString("nombre"));
            }

            // sentencia 3
            String sentenciaSQL3 = "SELECT nombre, apellido FROM Estudiante ORDER BY fecha_nacimiento ASC";
            PreparedStatement sentencia3 = con.prepareStatement(sentenciaSQL3);

            ResultSet resultados3 = sentencia3.executeQuery();

            while(resultados3.next()){
                System.out.println("Ordenado: " + resultados3.getString("apellido") + ", " + resultados3.getString("nombre"));
            }

            // sentencia 4
            String sentenciaSQL4 = "SELECT nombre_casa, COUNT(id_estudiante) FROM Casa JOIN Estudiante ON Casa.id_casa = Estudiante.id_casa GROUP BY nombre_casa";
            PreparedStatement sentencia4 = con.prepareStatement(sentenciaSQL4);

            ResultSet resultados4 = sentencia4.executeQuery();

            while(resultados4.next()){
                System.out.println("Casa: " + resultados4.getString(1) + " | Total: " + resultados4.getInt(2));
            }

            // sentencia 5
            String sentenciaSQL5 = "SELECT AVG(calificacion), MAX(calificacion) FROM Estudiante_Asignatura JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE nombre_asignatura = 'Pociones'";
            PreparedStatement sentencia5 = con.prepareStatement(sentenciaSQL5);

            ResultSet resultados5 = sentencia5.executeQuery();

            if(resultados5.next()){ // uso if porque solo devuelve una fila de results
                System.out.println("Pociones - Media: " + resultados5.getDouble(1) + " | Máxima: " + resultados5.getDouble(2));
            }

            // sentencia 6
            String sentenciaSQL6 = "SELECT DISTINCT anyo_curso FROM Estudiante";
            PreparedStatement sentencia6 = con.prepareStatement(sentenciaSQL6);

            ResultSet resultados6 = sentencia6.executeQuery();

            while(resultados6.next()){
                System.out.println("Año de curso disponible: " + resultados6.getInt("anyo_curso"));
            }

            // sentencia 7
            String sentenciaSQL7 = "SELECT nombre FROM Estudiante WHERE apellido LIKE 'P%'";
            PreparedStatement sentencia7 = con.prepareStatement(sentenciaSQL7);

            ResultSet resultados7 = sentencia7.executeQuery();

            while(resultados7.next()){
                String nombre = resultados7.getString("nombre");
                System.out.println("Estudiante con apellido por P: " + nombre);
            }

            // sentencia 8
            String sentenciaSQL8 = "SELECT nombre, apellido FROM Estudiante WHERE anyo_curso IN (4, 5)";
            PreparedStatement sentencia8 = con.prepareStatement(sentenciaSQL8);

            ResultSet resultados8 = sentencia8.executeQuery();

            while(resultados8.next()){
                String nombre = resultados8.getString("nombre");
                String apellido = resultados8.getString("apellido");
                System.out.println("Estudiante (4º/5º año): " + apellido + ", " + nombre);
            }

            // sentencia 9
            String sentenciaSQL9 = "SELECT E.nombre, E.apellido FROM Estudiante E JOIN Casa C ON E.id_casa = C.id_casa WHERE E.anyo_curso = 5 AND (C.nombre_casa = 'Gryffindor' OR C.nombre_casa = 'Slytherin')";

            PreparedStatement sentencia9 = con.prepareStatement(sentenciaSQL9);
            ResultSet resultados9 = sentencia9.executeQuery();

            while(resultados9.next()){
                System.out.println("Estudiante 5º (G/S): " + resultados9.getString("apellido") + ", " + resultados9.getString("nombre"));
            }

            // sentencia 10
            String sentenciaSQL10 = "SELECT nombre, apellido FROM Estudiante ORDER BY fecha_nacimiento ASC LIMIT 5";
            PreparedStatement sentencia10 = con.prepareStatement(sentenciaSQL10);

            ResultSet resultados10 = sentencia10.executeQuery();

            while(resultados10.next()){
                String nombre = resultados10.getString("nombre");
                String apellido = resultados10.getString("apellido");
                System.out.println("Primeros 5 estudiantes: " + apellido + ", " + nombre);
            }

            //sentencia 11
            String sentenciaSQL11 = "SELECT E.nombre FROM Estudiante E JOIN Estudiante_Asignatura EA ON E.id_estudiante = EA.id_estudiante JOIN Asignatura A ON EA.id_asignatura = A.id_asignatura WHERE A.nombre_asignatura = 'Vuelo' AND EA.calificacion >= 8";
            PreparedStatement sentencia11 = con.prepareStatement(sentenciaSQL11);

            ResultSet resultados11 = sentencia11.executeQuery();

            while(resultados11.next()){
                System.out.println("Estudiante sobresaliente en Vuelo: " + resultados11.getString("nombre"));
            }

            //sentencia 12
            String sentenciaSQL12 = "INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) VALUES ('Nymphadora', 'Tonks', 4, 7, '1973-11-25')";
            PreparedStatement sentencia12 = con.prepareStatement(sentenciaSQL12);

            int filasAfectadas = sentencia12.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("¡Estudiante insertada correctamente!");
            }

            //sentencia 13
            String sentenciaSQL13 = "UPDATE Casa SET id_jefe = 7 WHERE nombre_casa = 'Hufflepuff'";

            PreparedStatement sentencia13 = con.prepareStatement(sentenciaSQL13);

            int filasActualizadas = sentencia13.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Jefe de casa actualizado correctamente");
            }

            //sentencia 14
            String sentenciaSQL14 = "DELETE FROM Estudiante WHERE nombre = 'Tom Riddle'";

            PreparedStatement sentencia14 = con.prepareStatement(sentenciaSQL14);

            int filasBorradas = sentencia14.executeUpdate();

            if (filasBorradas > 0) {
                System.out.println("Registro eliminado con éxito.");
            } else {
                System.out.println("No se encontró ningún estudiante con ese nombre.");
            }

            //sentencia 15
            String sentenciaSQL15 = "SELECT E.nombre, E.apellido, C.nombre_casa FROM Estudiante E JOIN Casa C ON E.id_casa = C.id_casa";
            PreparedStatement sentencia15 = con.prepareStatement(sentenciaSQL15);
            ResultSet resultados15 = sentencia15.executeQuery();

            while(resultados15.next()){
                String nombre = resultados15.getString("nombre");
                String apellido = resultados15.getString("apellido");
                String casa = resultados15.getString("nombre_casa");
                System.out.println("Estudiante: " + nombre + " " + apellido + " | Casa: " + casa);
            }

            //sentencia 16


        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
