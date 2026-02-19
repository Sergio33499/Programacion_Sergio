package Tema5.ActividadesColecciones;

public class UsuarioBanco {
    String nombre;
    String dni;
    int edad;

    public UsuarioBanco(){
        this.nombre = "Paco";
        this.edad = 14;
        this.dni = "12324415H";
    }

    public UsuarioBanco(String nombre,String dni,int edad){
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

    public String toString() {
        return "Nombre: " + nombre + " | DNI: " + dni + " | Edad: " + edad;
    }
}
