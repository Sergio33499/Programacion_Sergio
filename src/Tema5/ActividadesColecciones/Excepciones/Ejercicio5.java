package Tema5.ActividadesColecciones.Excepciones;

public class Ejercicio5 {

    public static void imprimePositivo(int p) throws Exception{
        if (p < 0){
            throw new Exception("Error: El numero " + p + " es negativo.");
        }
        System.out.println("Numero positivo: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception{
        if (n >= 0){
            throw new Exception("Error: El numero " + n + " es positivo.");
        }
        System.out.println("Numero negativo: " + n);
    }

    public static void main(String[] args){
        try {
            imprimePositivo(5);
            imprimePositivo(-1);
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            imprimeNegativo(-4);
            imprimeNegativo(3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
