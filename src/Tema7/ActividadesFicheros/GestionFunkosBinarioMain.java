package Tema7.ActividadesFicheros;

import java.util.Scanner;

public class GestionFunkosBinarioMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GestionFunkosBinario gestor = new GestionFunkosBinario("funkos.dat");

        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE FUNKOS (MODO BINARIO) ---");
            System.out.println("1. Añadir funko");
            System.out.println("2. Borrar funko");
            System.out.println("3. Mostrar todos los funkos");
            System.out.println("4. Mostrar el funko más caro");
            System.out.println("5. Mostrar la media de precio");
            System.out.println("6. Mostrar funkos agrupados por modelos");
            System.out.println("7. Mostrar los funkos de 2023");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.print("Año: ");
                    int año = Integer.parseInt(sc.nextLine());

                    gestor.añadirFunko(new Funko(nombre, modelo, precio, año));
                    break;

                case 2:
                    System.out.print("Nombre del funko a borrar: ");
                    String nombreBorrar = sc.nextLine();
                    if (gestor.borrarFunko(nombreBorrar)) {
                        System.out.println("Eliminado de la lista y del archivo binario");
                    } else {
                        System.out.println("No se encontró el funko.");
                    }
                    break;

                case 3:
                    gestor.mostrarTodos();
                    break;

                case 4:
                    gestor.mostrarMasCaro();
                    break;

                case 5:
                    gestor.mostrarMediaPrecio();
                    break;

                case 6:
                    gestor.mostrarPorModelo();
                    break;

                case 7:
                    gestor.mostrarFunkos2023();
                    break;

                case 0:
                    System.out.println("Cerrando aplicación...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
