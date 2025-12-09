package Tema3.Actividades_Arrays_Strings;

import java.util.Scanner;

public class myString {

    public static void mostrarArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static String invertirArray(String array) {
        String resultado = "";
        for (int i = 0; i < array.length(); i++) {
            resultado = array.charAt(i) + resultado;
        }
        return resultado.toUpperCase();
    }

    public static int devolverNumVocales(String array) {
        int contador = 0;
        String minusculas = array.toLowerCase();
        for (int i = 0; i < minusculas.length(); i++) {
            char letra = minusculas.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static String devolverPalabraMasLarga(String frase) {
        String palabraActual = "";
        String palabraMasLarga = "";

        frase += " ";

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra != ' ') {
                palabraActual += letra;
            }else {
                if (palabraActual.length() > palabraMasLarga.length()){
                    palabraMasLarga = palabraActual;
                }
                palabraActual = "";
            }
        }
        return palabraMasLarga;
    }

    public static int contarSubCadena(String cadena1, String cadena2){
        int cont = 0;
        int n = cadena1.length();
        int m = cadena2.length();

        for (int i = 0; i <= n - m ; i++) {
            boolean coinciden = true;

            for (int j = 0; j < m ; j++) {
                if (cadena1.charAt(i +j) != cadena2.charAt(j)){
                    coinciden = false;
                    break;
                }
            }
            if (coinciden){
                cont++;
            }
        }
        return cont;
    }

    public static int contarPalabras(String cadena){
        int cont = 0;
        boolean enPalabra = false;

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (letra != ' ' && !enPalabra){
                cont++;
                enPalabra = true;
            } else if (letra == ' ') {
                enPalabra = false;
            }
        }
        return cont;
    }

    public static String devolverNumTelefono(String numero){
        String resultado = "(+";

        for (int i = 0; i < numero.length(); i++) {
            resultado += numero.charAt(i);

            if (i == 1){
                resultado += ")-";
            } else if (i == 4) {
                resultado += "-";
            }
        }
        return resultado;
    }

    public static void mostrarHistogramaVocales(String cadena) {
        String vocales = "aeiou";
        String minusculas = cadena.toLowerCase();

        for (int i = 0; i < vocales.length(); i++) {
            char vocalActual = vocales.charAt(i);
            int contador = 0;

            for (int j = 0; j < minusculas.length(); j++) {
                if (minusculas.charAt(j) == vocalActual) {
                    contador++;
                }
            }

            System.out.print(vocalActual + " " + contador + " ");
            for (int k = 0; k < contador; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Apartado A: Invertir y Mayúsculas ---");
        System.out.print("Introduce una cadena: ");
        String cadenaA = sc.nextLine();
        System.out.println("Resultado: " + myString.invertirArray(cadenaA));

        System.out.println("\n--- Apartado B: Contar vocales ---");
        System.out.print("Introduce una cadena: ");
        String cadenaB = sc.nextLine();
        System.out.println("Número de vocales: " + myString.devolverNumVocales(cadenaB));

        System.out.println("\n--- Apartado C: Palabra más larga ---");
        System.out.print("Introduce una frase: ");
        String fraseC = sc.nextLine();
        System.out.println("La palabra más larga es: " + myString.devolverPalabraMasLarga(fraseC));

        System.out.println("\n--- Apartado D: Frecuencia de subcadena ---");
        System.out.print("Principal: ");
        String principal = sc.nextLine();
        System.out.print("Subcadena: ");
        String sub = sc.nextLine();
        System.out.println("Frecuencia: " + myString.contarSubCadena(principal, sub));

        System.out.println("\n--- Apartado E: Número de palabras ---");
        System.out.print("Introduce una frase: ");
        String fraseE = sc.nextLine();
        System.out.println("Contiene: " + myString.contarPalabras(fraseE) + " palabras.");

        System.out.println("\n--- Apartado F: Formato teléfono ---");
        System.out.print("Introduce 11 dígitos: ");
        String tlf = sc.nextLine();
        System.out.println("Formato: " + myString.devolverNumTelefono(tlf));

        System.out.println("\n--- Apartado G: Histograma de vocales ---");
        System.out.print("Introduce una cadena: ");
        String cadenaG = sc.nextLine();
        myString.mostrarHistogramaVocales(cadenaG);

        sc.close();
    }
}
