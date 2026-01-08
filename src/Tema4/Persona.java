package Tema4;

public class Persona {
    final String dni;
    String nombre;
    String apellidos;
    int edad;
    final int adultAge = 18;
    final int retiredAge = 65;

    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public static void print(String dni, String nombre, String apellidos, int edad){
        System.out.println("El nombre y apellidos de la persona es: " + nombre + " " + apellidos + ", con edad: " + edad + " y DNI: " + dni);
    }

    public boolean isAdult(int edad, boolean esAdulto){
        if (edad >= adultAge){
            esAdulto = true;
        }else {
            esAdulto = false;
        }
        return esAdulto;
    }

    public boolean isRetired(int edad, boolean jubilado){
        if (edad >= retiredAge){
            jubilado = true;
        }else {
            jubilado = false;
        }
        return jubilado;
    }

    public int ageDifference(Persona persona, int edad) {
        return persona.edad - edad;
    }

    //public static boolean checkDNI(boolean esCorrecto, String dni){}

}
