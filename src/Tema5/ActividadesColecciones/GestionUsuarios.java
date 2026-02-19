package Tema5.ActividadesColecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GestionUsuarios {

    public static void altaDeUsuario(String dni, String nombre, int edad,Map<String, Usuario> datosUsuario) {
        if (datosUsuario.containsKey(dni)) {
            System.out.println("ERROR. El DNI ya existe!");
        } else {
            Usuario nuevoUsuario = new Usuario(nombre, edad);
            datosUsuario.put(dni, nuevoUsuario);
            System.out.println("Usuario registrado con exito!");

        }
    }

    public static void bajaDeUsuario(String dni,Map<String, Usuario> datosUsuario) {
        if (!datosUsuario.containsKey(dni)) {
            System.out.println("ERROR. No existe el dni!");
        } else {
            datosUsuario.remove(dni);
            System.out.println("Usuario dado de baja con exito!");
        }
    }

    public static void mostrarDatos(String dni, Map<String, Usuario> datosUsuario) {
        if (datosUsuario.containsKey(dni)) {
            Usuario u = datosUsuario.get(dni);
            System.out.println(u + " | DNI: " + dni);

        } else {
            System.out.println("ERROR. El usuario con DNI " + dni + " no existe.");
        }
    }

    public static void modificarUsuario(String dni, String nuevoNombre, int nuevaEdad,Map<String, Usuario> datosUsuario) {
        if (datosUsuario.containsKey(dni)) {
            Usuario u = datosUsuario.get(dni);
            u.nombre = nuevoNombre;
            u.edad = nuevaEdad;
            System.out.println("Datos actualizados correctamente!");
        } else {
            System.out.println("ERROR. No se puede modificar un usuario que no existe");
        }
    }


    public static void main(String[] args) {
        //GestionUsuarios gimnasio = new GestionUsuarios();
        Scanner scanner = new Scanner(System.in);
        Map<String, Usuario> datosUsuario = new HashMap<>();
        int opcion = -1;

        while (opcion != 5){
            System.out.println("\n--- GESTIÓN GIMNASIO ---");
            System.out.println("1. Alta | 2. Baja | 3. Mostrar | 4. Modificar | 5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("DNI: ");
                    String d = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String n = scanner.nextLine();
                    System.out.print("Edad: ");
                    int e = scanner.nextInt();
                    altaDeUsuario(d, n, e,datosUsuario);
                    break;
                case 2:
                    System.out.print("DNI a borrar: ");
                    bajaDeUsuario(scanner.nextLine(),datosUsuario);
                    break;
                case 3:
                    System.out.print("DNI a consultar: ");
                    mostrarDatos(scanner.nextLine(),datosUsuario);
                    break;
                case 4:
                    System.out.print("DNI a modificar: ");
                    String dm = scanner.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String nm = scanner.nextLine();
                    System.out.print("Nueva Edad: ");
                    int em = scanner.nextInt();
                    scanner.nextLine();
                    modificarUsuario(dm, nm, em,datosUsuario);
                    break;
            }
        }
    }
}