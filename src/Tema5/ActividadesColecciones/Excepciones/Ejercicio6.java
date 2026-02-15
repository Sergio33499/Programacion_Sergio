package Tema5.ActividadesColecciones.Excepciones;

public class Ejercicio6 {

    public static class Gato{
        private String nombre;
        private int edad;

        public Gato(String nombre, int edad)throws Exception{
            setNombre(nombre);
            setEdad(edad);
        }

        public void setNombre(String nombre)throws  Exception{
            if (nombre.length() < 3){
                throw new Exception("El nombre tiene que tener 3 caracteres");
            }else {
                this.nombre = nombre;
            }
        }

        public void setEdad(int edad)throws Exception{
            if (edad < 0){
                throw new Exception("La edad no puede ser negativa.");
            }else {
                this.edad = edad;
            }
        }

        public String getNombre(){
            return nombre;
        }

        public int getEdad(){
            return edad;
        }

        public void imprimir(){
            System.out.println("Gato [Nombre: " + nombre + ", Edad: " + edad + "]");
        }
    }
    public static void main(String[]args){
        try {
            Gato miGato = new Gato("Willson",5);
            miGato.imprimir();
            miGato.setNombre("Pelusa");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
