package Tema5.ActividadesColecciones;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GestionBanco {

    public void anadirALaCola(UsuarioBanco u,List<UsuarioBanco> cola){
        cola.add(u);
    }

    public void quitarPrimeroDeLaCola(List<UsuarioBanco> cola){
        if (cola.isEmpty()){
            System.out.println("No se puede quitar a alguien de la cola porque esta vacia");
        }else {
            cola.remove(0);
            System.out.println("El primer usuario ha sido atendido.");
        }
    }

    public void quitarDeCualquierPosicion(int posicion,List<UsuarioBanco> cola){
        if (posicion >= 0 && posicion < cola.size()){
            cola.remove(posicion);
        }else {
            System.out.println("Esa posicion no existe en la cola!");
        }
    }

    public static void main(String[] args) {
        GestionBanco banco = new GestionBanco();
        Scanner scanner = new Scanner(System.in);
        List<UsuarioBanco> cola = new LinkedList<>();

        int opcion = -1;

        while (opcion != 0){
            System.out.println("\n--- GESTIÓN DEL BANCO ---");
            System.out.println("1. Añadir cliente");
            System.out.println("2. Atender al primero");
            System.out.println("3. Cliente se cansa (quitar por posición)");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce el DNI: ");
                    String dni = scanner.nextLine();
                    System.out.println("Introduce la edad: ");
                    int edad = scanner.nextInt();
                    UsuarioBanco newUser = new UsuarioBanco(nombre,dni,edad);
                    banco.anadirALaCola(newUser,cola);
                    System.out.println("Usuario añadido correctamente!");
                    break;

                case 2:
                    banco.quitarPrimeroDeLaCola(cola);
                    break;

                case 3:
                    System.out.println("Introduce la posicion a eliminar:");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    banco.quitarDeCualquierPosicion(pos,cola);
                    break;
            }
        }
    }

}
