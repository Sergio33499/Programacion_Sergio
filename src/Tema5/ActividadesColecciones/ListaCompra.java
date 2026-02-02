package Tema5.ActividadesColecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Set<String> products = new HashSet<>();

        System.out.println("Introduce los productos en la lista");
        for (int i = 0; i < 5; i++) {
            String producto = sc.nextLine();

            if (products.contains(producto)){
                System.out.println("El producto ya esta en la lista");
            }else {
                products.add(producto);
            }
        }
        System.out.println("Lista: " + products);
    }
}
