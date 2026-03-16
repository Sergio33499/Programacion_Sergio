package Tema6.POO3.POO4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBiblioteca {

    public static int showMenu(Scanner sc) {

        System.out.println("\n--- GESTIÓN DE BIBLIOTECA ---");
        System.out.println("1. Añadir ítem");
        System.out.println("2. Buscar ítem");
        System.out.println("3. Eliminar ítem");
        System.out.println("4. Listado de la biblioteca");
        System.out.println("5. Salir");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;

    }

    public static void anadirItem(ArrayList<Biblioteca> lista, Scanner sc) {
        System.out.println("\n--- AÑADIR NUEVO ÍTEM ---");
        System.out.println("¿Qué tipo de ítem desea añadir?");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. DVD");
        System.out.print("Opción: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Introduce el ID: ");
        String id = sc.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Introduce el autor: ");
                String autor = sc.nextLine();
                System.out.print("Introduce el número de páginas: ");
                int paginas = sc.nextInt();
                sc.nextLine();
                lista.add(new Libro(titulo, id, autor, paginas));
                System.out.println("Libro añadido correctamente.");
                break;

            case 2:
                System.out.print("Introduce el número de edición: ");
                int edicion = sc.nextInt();
                System.out.print("Introduce el año de publicación: ");
                int anio = sc.nextInt();
                lista.add(new Revista(titulo, id, edicion, anio));
                System.out.println("Revista añadida correctamente.");
                break;

            case 3:
                System.out.print("Introduce el director: ");
                String director = sc.nextLine();
                System.out.print("Introduce el género: ");
                String genero = sc.nextLine();
                lista.add(new DVD(titulo, id, director, genero));
                System.out.println("DVD añadido correctamente.");
                break;

            default:
                System.out.println("Opción de tipo no válida. No se añadió nada.");
                break;
        }
    }

    public static void mostrarListado(ArrayList<Biblioteca> lista) {
        System.out.println("\n--- LISTADO COMPLETO DE LA BIBLIOTECA ---");

        if (lista.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            for (Biblioteca item : lista) {
                System.out.println(item.toString());
            }
        }
    }

    public static void eliminarItem(ArrayList<Biblioteca> lista, Scanner sc) {
        System.out.print("Introduce el ID del ítem a eliminar: ");
        String idEliminar = sc.nextLine();
        boolean eliminado = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).id.equals(idEliminar)) {
                lista.remove(i);
                System.out.println("Ítem eliminado correctamente.");
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("No se encontró ningún ítem con ese ID.");
        }
    }

    public static void buscarItem(ArrayList<Biblioteca> lista, Scanner sc) {
        System.out.print("Introduce el ID del ítem a buscar: ");
        String idBuscar = sc.nextLine();
        boolean encontrado = false;

        for (Biblioteca item : lista) {
            if (item.id.equals(idBuscar)) {
                System.out.println("Resultado: " + item.toString());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Ítem no localizado.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Biblioteca> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 5) {
            opcion = showMenu(sc);
            switch (opcion) {
                case 1:
                    anadirItem(list, sc);
                    break;
                case 2:
                    buscarItem(list, sc);
                    break;
                case 3:
                    eliminarItem(list, sc);
                    break;
                case 4:
                    mostrarListado(list);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        }
    }
}
