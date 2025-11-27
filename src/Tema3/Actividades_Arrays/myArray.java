package Tema3.Actividades_Arrays;

import java.util.Scanner;

public class myArray {

   public static void showMenu(){
        System.out.println("\n===== MENÚ DE OPERACIONES CON ARRAYS =====");
        System.out.println("a) Imprimir array");
        System.out.println("b) Obtener máximo");
        System.out.println("c) Obtener mínimo");
        System.out.println("d) Calcular media");
        System.out.println("e) Buscar elemento");
        System.out.println("f) Suma de dos vectores");
        System.out.println("g) Resta de dos vectores");
        System.out.println("h) Producto escalar");
        System.out.println("i) Invertir array (devolver nuevo)");
        System.out.println("j) Invertir array (modificar original)");
        System.out.println("k) Verificar si es capicúa");
        System.out.println("l) Salir");
        System.out.println("==========================================");
        System.out.print("Elige una opción (a-l): ");
    }

    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int maxArray(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int minArray(int[] array){
       int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {7,245,15,10};


        showMenu();

        char opcion;
        boolean salir = false;

        while (!salir){
            showMenu();
            opcion = sc.nextLine().charAt(0);

            switch (opcion){
                case 'a':
                    System.out.println("El contenido del array es: ");
                    mostrarArray(array);
                    break;
                case 'b':
                    int max = maxArray(array);
                    System.out.println("El maximo del array es: " + max);
                    break;
                case 'c':
                    int min = maxArray(array);
                    System.out.println("El maximo del array es: " + min);
                    break;            }
        }
    }
}
