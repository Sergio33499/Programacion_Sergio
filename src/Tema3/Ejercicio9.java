package Tema3;

import java.util.Scanner;

public class Ejercicio9 {

public static void dibujarTriangulo(char c, int n){
    for (int i = 0; i <= n; i++) {
        for (int j = 1; j <= n -i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i -1; j++) {
            System.out.print(c);
        }
        System.out.println();
    }
}



    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el caracter del triangulo: ");
        char c = scanner.next().charAt(0);

        System.out.print("Introduce el numero de lineas: ");
        int n = scanner.nextInt();

        if (n <= 0){
            System.out.println("El numero de lineas debe ser mayor a 0.");
        }else{
            dibujarTriangulo(c,n);
        }

    }
}
