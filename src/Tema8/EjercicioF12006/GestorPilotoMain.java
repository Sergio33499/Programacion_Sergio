package Tema8.EjercicioF12006;

import java.util.List;
import java.util.Scanner;

public class GestorPilotoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = -1;

        while (opcion != 0){
            System.out.println("\n--- GESTIÓN F1 2006 ---");
            System.out.println("1. Crear Piloto");
            System.out.println("2. Leer un Piloto (ID)");
            System.out.println("3. Listar todos los Pilotos");
            System.out.println("4. Actualizar Piloto");
            System.out.println("5. Eliminar Piloto");
            System.out.println("6. Clasificación Mundial Pilotos");
            System.out.println("7. Clasificación Mundial Equipos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("--- NUEVO PILOTO ---");
                    System.out.print("Código (3 letras): "); String cod = sc.nextLine();
                    System.out.print("Nombre: "); String nom = sc.nextLine();
                    System.out.print("Apellido: "); String ape = sc.nextLine();
                    System.out.print("Nacimiento (YYYY-MM-DD): "); String fec = sc.nextLine();
                    System.out.print("Nacionalidad: "); String nac = sc.nextLine();

                    Piloto nuevo = new Piloto(0, cod, nom, ape, fec, nac);
                    GestorPiloto.CreatePilot(nuevo);
                    break;

                case 2:
                    System.out.println("Introduce ID a buscar:");
                    int idBuscar = sc.nextInt();
                    Piloto pEncontrado = GestorPiloto.ReadPilot(idBuscar);
                    if (pEncontrado != null){
                        System.out.println("Resultado: " + pEncontrado.getForename());
                    }else {
                        System.out.println("No existe ningun piloto con ese ID");
                    }
                    break;

                case 3:
                    System.out.println("---LISTADO COMPLETO---");
                    List<Piloto> lista = GestorPiloto.ReadPilots();
                    for (Piloto p : lista){
                        System.out.println(p.getDriverid() + " | " + p.getCode() + " | " + p.getForename() + " " + p.getSurname());
                    }
                    break;

                case 4:
                    System.out.println("ID del piloto a editar: ");
                    int idEdit = sc.nextInt();
                    sc.nextLine();
                    Piloto pEdit = GestorPiloto.ReadPilot(idEdit);
                    if (pEdit != null){
                        System.out.println("Nuevo nombre (actual: " + pEdit.getForename() + "): ");
                        pEdit.setForename(sc.nextLine());
                        System.out.print("Nuevo apellido (actual: " + pEdit.getSurname() + "): ");
                        pEdit.setSurname(sc.nextLine());
                        GestorPiloto.UpdatePilot(pEdit);
                        System.out.println("Piloto actualizado.");
                    }
                    break;

                case 5:
                    System.out.print("ID del piloto a borrar: ");
                    int idBorrar = sc.nextInt();
                    Piloto pBorrar = GestorPiloto.ReadPilot(idBorrar);
                    if (pBorrar != null) {
                        GestorPiloto.DeletePilot(pBorrar);
                        System.out.println("Piloto eliminado de la base de datos.");
                    }
                    break;

                case 6:
                    GestorPiloto.ShowPilotClassification();
                    break;

                case 7:
                    GestorPiloto.ShowBuildersClassification();
                    break;

                case 0:
                    System.out.println("Cerrando aplicación...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        }
    }
}
