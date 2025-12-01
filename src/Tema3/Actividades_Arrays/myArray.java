package Tema3.Actividades_Arrays;

import java.util.Scanner;

public class myArray {

    public static void showMenu() {
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

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double mediaDelArray(int[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double media = suma / array.length;
        return media;
    }

    public static int elementoExiste(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static int[] sumarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = array1[i] + array2[i];
        }
        return resultado;
    }

    public static int[] restarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = array1[i] - array2[i];
        }
        return resultado;
    }

    public static int productoArrays(int[] array1, int[] array2) {
        int producto = 0;
        for (int i = 0; i < array1.length; i++) {
            producto = producto + (array1[i] * array2[i]);
        }
        return producto;
    }

    public static int[] invertirArray(int[] array){
        int[] arrayInverso = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInverso[i] += array[array.length -1 -i];
        }
        return arrayInverso;
    }

    public static void invertirOrden(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = temp;
        }
    }

    public static boolean esCapicua(int[] array){
            boolean capicua = false;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length -1 -i]){
                return false;
            }
        }
        return true;
    }

    public static int[] leerArray(Scanner sc) {
        System.out.print("¿Cuántos elementos tiene el array? ");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.nextLine();  // Limpiar buffer
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INTRODUCIR PRIMER ARRAY ---");
        int[] array = leerArray(sc);

        System.out.println("--- INTRODUCIR SEGUNDO ARRAY ---");
        int[] array2 = leerArray(sc);

        char opcion;
        boolean salir = false;

        while (!salir) {
            showMenu();
            opcion = sc.nextLine().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("El contenido del array es: ");
                    mostrarArray(array);
                    break;
                case 'b':
                    int max = maxArray(array);
                    System.out.println("El maximo del array es: " + max);
                    break;
                case 'c':
                    int min = minArray(array);
                    System.out.println("El minimo del array es: " + min);
                    break;
                case 'd':
                    double media = mediaDelArray(array);
                    System.out.println("La media del array es: " + media);
                    break;
                case 'e':
                    System.out.println("Introduce el numero que quieres buscar: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    int posicion = elementoExiste(array, num);

                    if (posicion != -1) {
                        System.out.println("Numero encontrado en la posicion: " + posicion);
                    } else {
                        System.out.println("Numero no encontrado");
                    }
                    break;
                case 'f':
                    System.out.println("Array 1 es: ");
                    mostrarArray(array);
                    System.out.println("Array 2 es: ");
                    mostrarArray(array2);
                    int[] suma = sumarArrays(array, array2);
                    System.out.println("La suma de los dos arrays es: ");
                    mostrarArray(suma);
                    break;
                case 'g':
                    System.out.println("El array 1 es: ");
                    mostrarArray(array);
                    System.out.println("El array 2 es: ");
                    mostrarArray(array2);
                    int[] resta = restarArrays(array, array2);
                    System.out.println("La resta de los dos arrays es: ");
                    mostrarArray(resta);
                    break;
                case 'h':
                    System.out.println("El array 1 es: ");
                    mostrarArray(array);
                    System.out.println("El array 2 es: ");
                    mostrarArray(array2);
                    int productoEscalar = productoArrays(array,array2);
                    System.out.println("El producto escalar de los dos arrays es: " + productoEscalar);
                    break;
                case 'i':
                    System.out.println("El array es: ");
                    mostrarArray(array);
                    int[] arrayInverso = invertirArray(array);
                    System.out.println("El array invertido es: ");
                    mostrarArray(arrayInverso);
                    break;
                case 'j':
                    System.out.println("El array es: ");
                    mostrarArray(array);
                    invertirOrden(array);
                    System.out.println("El array invertido es: ");
                    mostrarArray(array);
                    break;
                case 'k':
                    System.out.println("El array es: ");
                    mostrarArray(array);
                    if (esCapicua(array)){
                        System.out.println("El array es capicua");
                    }else {
                        System.out.println("El array no es capicua");
                    }
                    break;
                case 'l':
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }
    }
}
