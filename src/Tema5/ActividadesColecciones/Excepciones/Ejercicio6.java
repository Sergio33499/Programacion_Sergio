package Tema5.ActividadesColecciones.Excepciones;

public class Ejercicio6 {


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
