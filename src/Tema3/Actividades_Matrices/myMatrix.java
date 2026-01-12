package Tema3.Actividades_Matrices;

public class myMatrix {

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int maxMatriz(int[][] matriz){
        int max = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max){
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    public static int minMatriz (int[][] matriz){
        int min = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < min){
                    min = matriz[i][j];
                }
            }
        }
        return min;
    }

    public static double mediaMatriz(int[][] matriz){
        double suma = 0;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                contador++;
            }
        }
        int total = matriz.length * matriz[0].length;
        double media = suma / contador;
        return media;
    }

    public static boolean elementoExiste (int[][] matriz, int valorABuscar){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (valorABuscar == matriz[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int contarRepetidos(int[][] matriz,int valorABuscar){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (valorABuscar == matriz[i][j]){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int[][] sumarMatrices(int[][] matriz1,int[][] matriz2){
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] restarMatrices(int[][] matriz1,int[][] matriz2){
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resultado;
    }

    public static boolean matrizUnidad (int[][] matriz){
        if (matriz.length != matriz[0].length){
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
                    if (matriz[i][j] != 1) {
                        return false;
                    }
                    }else {
                        if (matriz[i][j] != 0){
                            return false;
                        }

                }
            }
        }
        return true;
    }

    public static void main(String[] args){

    }
}
