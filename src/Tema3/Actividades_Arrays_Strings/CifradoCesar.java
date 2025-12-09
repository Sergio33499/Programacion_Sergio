package Tema3.Actividades_Arrays_Strings;

import java.util.Scanner;

public class CifradoCesar {
    //char letraOriginal = 'B';
    //char letraCifrada = (char) (letraOriginal + 1); // Esto te daría 'C'

    public static String encriptar (String cadena){
        String palabra = cadena.toUpperCase();
        String result = "";

        for (int i = 0; i < palabra.length(); i++) {
            char letraOriginal = palabra.charAt(i);
            char letraCifrada;
            if (letraOriginal >= 'A' && letraOriginal <= 'Z'){
                if (letraOriginal == 'Z'){
                    letraCifrada = 'A';
                }else {
                    letraCifrada = (char) (letraOriginal +1);
                }
            } else if (letraOriginal >= '0' && letraOriginal <= '9') {
                if (letraOriginal == '9'){
                    letraCifrada = '0';
                } else {
                    letraCifrada = (char) (letraOriginal + 1);
                }
            } else {
                letraCifrada = letraOriginal;
            }
            result = result + letraCifrada;
        }
        return result;
    }

    public static String desencriptar(String cadena){
        String palabra = cadena.toUpperCase();
        String result = "";

        for (int i = 0; i < palabra.length(); i++) {
            char letraOriginal = palabra.charAt(i);
            char letraCifrada;
            if (letraOriginal <= 'Z' && letraOriginal >= 'A'){
                if (letraOriginal == 'A'){
                    letraCifrada = 'Z';
                }else {
                    letraCifrada = (char) (letraOriginal -1);
                }
            } else if (letraOriginal <= '9' && letraOriginal >= '0') {
                if (letraOriginal == '0'){
                    letraCifrada = '9';
                }else {
                    letraCifrada = (char) (letraOriginal - 1);
                }
            }else {
                letraCifrada = letraOriginal;
            }
            result = result + letraCifrada;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String cadenaOriginal = scanner.nextLine();

        System.out.println("Original: " + cadenaOriginal);
        System.out.println("-------------------------");

        String cadenaCifrada = encriptar(cadenaOriginal);
        System.out.println("Cifrado: " + cadenaCifrada);

        String cadenaDescifrada = desencriptar(cadenaCifrada);
        System.out.println("Descifrado: " + cadenaDescifrada);
    }
}
