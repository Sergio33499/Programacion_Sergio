package Tema5.ActividadesColecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompraAmpliado {



    public static String leerProducto(String mensaje,Scanner scanner){
        System.out.println(mensaje);
        String respuesta = scanner.nextLine();
        return respuesta.toLowerCase();
    }

    public static int showMenu(Scanner sc) {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1- Añadir producto a la lista");
        System.out.println("2- Añadir producto al carro");
        System.out.println("3- Mostrar estado de la compra");
        System.out.println("4- Salir");
        System.out.print("Elige una opcion: ");

        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public static void anadirALista(Set<String> products,Set<String> carroCompra,Scanner scanner){
        for (int i = 0; i < 5; i++) {
            String p = leerProducto("Introduce un producto para la lista: ",scanner);
            if (products.contains(p)){
                System.out.println("El producto ya esta en la lista.");
            }else {
                products.add(p);
            }
        }
    }

    public static void anadirAlCarro(Set<String> carroCompra,Set<String> products,Scanner scanner){
        String p = leerProducto("Introduce el producto que quieres: ",scanner);
        carroCompra.add(p);
    }

    public static void mostrarEstadoCompra(Set<String> products,Set<String> carroCompra){
        Set<String> faltan = new HashSet<>(products);
        Set<String> enCarro = new HashSet<>(products);
        faltan.removeAll(carroCompra);
        System.out.println("Productros que te faltan: " + faltan);
        enCarro.retainAll(carroCompra);
        System.out.println("Productos que ya tienes en el carro: " + enCarro);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Set<String> products = new HashSet<>();
        Set<String> carroCompra = new HashSet<>();

        int opcion = -1;
        while (opcion != 0) {
            opcion = showMenu(sc);

            switch (opcion) {
                case 1:
                    anadirALista(products, carroCompra, sc);
                    break;
                case 2:
                    anadirAlCarro(carroCompra, products, sc);
                    break;
                case 3:
                    mostrarEstadoCompra(products, carroCompra);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    opcion = 0;
                    break;
                default:
                    System.out.println("Operacion no valida.");
                    break;
            }
        }
        sc.close();
    }
}
