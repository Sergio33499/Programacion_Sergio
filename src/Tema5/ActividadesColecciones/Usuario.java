package Tema5.ActividadesColecciones;

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

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad;
    }
}
