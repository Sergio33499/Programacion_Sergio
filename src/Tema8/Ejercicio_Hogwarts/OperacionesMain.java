package Tema8.Ejercicio_Hogwarts;

import java.util.Scanner;

public class OperacionesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre de la casa: ");
        String casaBusqueda = sc.nextLine();
        Operaciones.consultarEstudiantesPorCasa(casaBusqueda);

        System.out.println("\nBusqueda de mascota");
        System.out.print("Nombre del estudiante: ");
        String nomEst = sc.nextLine();
        System.out.print("Apellido del estudiante: ");
        String apeEst = sc.nextLine();
        Operaciones.obtenerMascotaEstudiante(nomEst, apeEst);

        System.out.println("\nInsertar nueva asignatura");
        System.out.print("Nombre de la asignatura: ");
        String nomAsig = sc.nextLine();
        System.out.print("Aula: ");
        String aulaAsig = sc.nextLine();
        System.out.print("Es obligatoria? ");
        boolean esOblig = sc.nextBoolean();
        sc.nextLine();

        Asignatura nueva = new Asignatura(nomAsig, aulaAsig, esOblig);
        Operaciones.insertarNuevaAsignatura(nueva);

        System.out.print("\nA que asignatura quieres cambiar el aula?: ");
        String asigAModificar = sc.nextLine();
        System.out.print("Introduce la nueva aula: ");
        String nuevaAula = sc.nextLine();
        Operaciones.modificarAulaAsignatura(asigAModificar, nuevaAula);

        System.out.print("\nIntroduce una asignatura para eliminar: ");
        String asigAEliminar = sc.nextLine();
        Operaciones.eliminarAsignatura(asigAEliminar);

        sc.close();
    }
}