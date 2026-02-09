package Tema5.ActividadesColecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompraAmpliado {

    Set<String> products = new HashSet<>();
    Set<String> carroCompra = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public String leerProducto(String mensaje){
        System.out.println(mensaje);
        String respuesta = scanner.nextLine();
        return respuesta.toLowerCase();
    }

    public void anadirALista(){
        for (int i = 0; i < 5; i++) {
            String p = leerProducto("Introduce un producto para la lista: ");
            if (products.contains(p)){
                System.out.println("El producto ya esta en la lista.");
            }else {
                products.add(p);
            }
        }
    }

    public void anadirAlCarro(){
        String p = leerProducto("Introduce el producto que quieres: ");
        carroCompra.add(p);
    }

    public void mostrarEstadoCompra(){
        Set<String> faltan = new HashSet<>(products);
        Set<String> enCarro = new HashSet<>(products);
        faltan.removeAll(carroCompra);
        System.out.println("Productros que te faltan: " + faltan);
        enCarro.retainAll(carroCompra);
        System.out.println("Productos que ya tienes en el carro: " + enCarro);
    }

    public static void main(String[]args){
        ListaCompraAmpliado lista = new ListaCompraAmpliado();
        Scanner sc = new Scanner(System.in);

        int opcion = -1;
        while (opcion != 0){
            System.out.println("\n---MENÚ---");
            System.out.println("1-Añadir producto a la lista");
            System.out.println("2-Añadir producto al carro");
            System.out.println("3-Mostrar estado de la compra");
            System.out.println("4-Salir");

            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    lista.anadirALista();
                    break;
                case 2:
                    lista.anadirAlCarro();
                    break;
                case 3:
                    lista.mostrarEstadoCompra();
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
    }
}
