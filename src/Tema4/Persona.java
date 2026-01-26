package Tema4;

import java.util.Scanner;

public class Persona {
    final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    static final int ADULT_AGE = 18;
    static final int RETIRED_AGE = 65;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void print(String dni, String nombre, String apellidos, int edad) {
        System.out.println("El nombre y apellidos de la persona es: " + nombre + " " + apellidos + ", con edad: " + edad + " y DNI: " + dni);
    }

    public boolean isAdult() {
        return edad >= ADULT_AGE;
    }

    public boolean isRetired() {
        return edad >= RETIRED_AGE;
    }

    public int ageDifference(Persona persona) {

        return Math.abs(this.edad - persona.edad);    }

    public static boolean checkDNI(String dni) {
        if (dni.length() != 9) return false;

        int numero = 0;
        for (int i = 0; i < 8; i++) {
            char c = dni.charAt(i);
            if (c < '0' || c > '9') return false;
            numero = numero * 10 + (c - '0');
        }

        char letra = dni.charAt(8);
        if (letra >= 'a' && letra <= 'z') letra = (char) (letra - 32);
        if (letra < 'A' || letra > 'Z') return false;

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraCorrecta = letras.charAt(numero % 23);

        return letra == letraCorrecta;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persona[] persona = new Persona[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce los datos de la persona " + (i + 1) + ":");
            String dni = "";
            while (!checkDNI(dni)) {
                System.out.print("DNI: ");
                dni = scanner.nextLine();
                if (!checkDNI(dni)) {
                    System.out.println("DNI incorrecto. Inténtalo de nuevo.");
                }
            }

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            persona[i] = new Persona(dni, nombre, apellidos, edad);
        }
        System.out.println("\n--- Información de las personas ---");
        for (Persona p : persona){
            Persona.print(p.getDni(), p.getNombre(), p.getApellidos(), p.getEdad());
            System.out.println("Mayor de edad: " + (p.isAdult() ? "Sí" : "No"));
            System.out.println("Jubilado: " + (p.isRetired() ? "Sí" : "No"));
            System.out.println();
        }

        int diferencia = persona[0].ageDifference(persona[1]);
        System.out.println("Diferencia de edad entre las dos personas: " + diferencia + " años");

        scanner.close();

    }
}