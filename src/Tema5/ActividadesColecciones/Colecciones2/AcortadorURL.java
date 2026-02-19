package Tema5.ActividadesColecciones.Colecciones2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class AcortadorURL {

    public static String generarClaveAleatoria(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String claveResult = "";
        Random generador = new Random();

        for (int i = 0; i < 5; i++) {
            int indice = generador.nextInt(caracteres.length());
            claveResult += caracteres.charAt(indice);
        }
        return claveResult;
    }

    public static String crearRegistro(Map<String,String> diccionario, String urlReal){
        String clave = generarClaveAleatoria();
        diccionario.put(clave,urlReal);
        return clave;
    }

    public static String resolverDireccion(Map<String,String> diccionario,String clave){
        String result = "";
        if (diccionario.containsKey(clave)){
            result = diccionario.get(clave);
        }else {
            result = "ERROR. La clave no ha sido encontrada.";
        }
        return result;
    }

    public static boolean borrarRegistro(Map<String,String> diccionario,String clave){
        boolean exito = false;
        if (diccionario.containsKey(clave)){
            diccionario.remove(clave);
            exito = true;
            System.out.println("El registro ha sido borrado con exito.");
        }
        return exito;
    }

    public static void mostrarRegistros(Map<String,String> diccionario){
        if (!diccionario.isEmpty()){
            for (Map.Entry<String,String> entry : diccionario.entrySet()){
                System.out.println("Clave: " + entry.getKey() + " -> URL: " + entry.getValue());
            }
        }else {
            System.out.println("El diccionario esta vacio.");
        }
    }

    public static void main(String[] args) {
        Map<String,String> miDiccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0){
            System.out.println("\n--- ACORTADOR DE URLs ---");
            System.out.println("1. Crear nuevo registro");
            System.out.println("2. Resolver dirección");
            System.out.println("3. Borrar registro");
            System.out.println("4. Mostrar todos los registros");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Introduce la URL completa: ");
                    String url = sc.nextLine();
                    crearRegistro(miDiccionario,url);
                    break;

                case 2:
                    System.out.print("Introduce la clave a buscar: ");
                    String claveBusqueda = sc.nextLine();
                    borrarRegistro(miDiccionario,claveBusqueda);
                    break;

                case 3:
                    System.out.println("Introduce la clave a borrar: ");
                    String claveBorrar = sc.nextLine();
                    borrarRegistro(miDiccionario,claveBorrar);
                    break;

                case 4:
                    mostrarRegistros(miDiccionario);
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
