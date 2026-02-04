package Tema5.ActividadesColecciones;

import java.util.LinkedList;
import java.util.List;

public class GestionBanco {
    List<Usuario> cola = new LinkedList<>();

    public void anadirALaCola(Usuario u){
        cola.add(u);
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
}
