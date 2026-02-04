package Tema5.ActividadesColecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GestionUsuarios {
    Map<String, Usuario> datosUsuario = new HashMap<>();


    public void altaDeUsuario(String dni, String nombre, int edad) {
        if (datosUsuario.containsKey(dni)) {
            System.out.println("ERROR. El DNI ya existe!");
        } else {
            Usuario nuevoUsuario = new Usuario(nombre, edad);
            datosUsuario.put(dni, nuevoUsuario);
            System.out.println("Usuario registrado con exito!");

        }
    }

    public void bajaDeUsuario(String dni) {
        if (!datosUsuario.containsKey(dni)) {
            System.out.println("ERROR. No existe el dni!");
        } else {
            datosUsuario.remove(dni);
            System.out.println("Usuario dado de baja con exito!");
        }
    }

    public void mostrarDatos(String dni) {
        if (datosUsuario.containsKey(dni)) {
            Usuario u = datosUsuario.get(dni);
            System.out.println("Nombre: " + u.nombre + " - Edad: " + u.edad + " - DNI: " + dni);
        }else{
            System.out.println("ERROR. El usuario con DNI " + dni + " no existe.");
        }
    }

    public void modificarUsuario(String dni, String nuevoNombre, int nuevaEdad) {
        if (datosUsuario.containsKey(dni)) {
            Usuario u = datosUsuario.get(dni);
            u.nombre = nuevoNombre;
            u.edad = nuevaEdad;
            System.out.println("Datos actualizados correctamente!");
        } else {
            System.out.println("ERROR. No se puede modificar un usuario que no existe");
        }
    }

    public class Usuario {
        String nombre;
        int edad;

        public Usuario() {
            this.nombre = "Paco";
            this.edad = 51;
        }

        public Usuario(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public static void main(String[] args) {
        GestionUsuarios gimnasio = new GestionUsuarios();
        Scanner scanner = new Scanner(System.in);
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
                    gimnasio.altaDeUsuario(d, n, e);
                    break;
                case 2:
                    System.out.print("DNI a borrar: ");
                    gimnasio.bajaDeUsuario(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("DNI a consultar: ");
                    gimnasio.mostrarDatos(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("DNI a modificar: ");
                    String dm = scanner.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String nm = scanner.nextLine();
                    System.out.print("Nueva Edad: ");
                    int em = scanner.nextInt();
                    scanner.nextLine();
                    gimnasio.modificarUsuario(dm, nm, em);
                    break;
            }
        }
    }
}