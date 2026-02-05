package Tema5.ActividadesColecciones;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GestionBanco {
    List<Usuario> cola = new LinkedList<>();

    public void anadirALaCola(Usuario u){
        cola.add(u);
    }

    public void quitarPrimeroDeLaCola(){
        if (cola.isEmpty()){
            System.out.println("No se puede quitar a alguien de la cola porque esta vacia");
        }else {
            cola.remove(0);
            System.out.println("El primer usuario ha sido atendido.");
        }
    }

    public void quitarDeCualquierPosicion(int posicion){
        if (posicion >= 0 && posicion < cola.size()){
            cola.remove(posicion);
        }else {
            System.out.println("Esa posicion no existe en la cola!");
        }
    }

    public class Usuario{
        String nombre;
        String dni;
        int edad;

        public Usuario(){
            this.nombre = "Paco";
            this.edad = 14;
            this.dni = "12324415H";
        }

        public Usuario(String nombre,String dni,int edad){
            this.nombre = nombre;
            this.dni = dni;
            this.edad = edad;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setDni(String dni){
            this.dni = dni;
        }

        public String getNombre(){
            return nombre;
        }
        public String getDni(){
            return dni;
        }
        public int getEdad(){
            return edad;
        }
    }

    public static void main(String[] args) {
        GestionBanco banco = new GestionBanco();
        Scanner scanner = new Scanner(System.in);
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
                    Usuario newUser = banco.new Usuario(nombre,dni,edad);
                    banco.anadirALaCola(newUser);
                    System.out.println("Usuario añadido correctamente!");
                    break;

                case 2:
                    banco.quitarPrimeroDeLaCola();
                    break;

                case 3:
                    System.out.println("Introduce la posicion a eliminar:");
                    int pos = scanner.nextInt();
                    banco.quitarDeCualquierPosicion(pos);
                    break;
            }
        }
    }

}
