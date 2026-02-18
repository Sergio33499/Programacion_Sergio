package Tema5.ActividadesColecciones.POO3;

public class Perro extends Animal{

    @Override
    void comer() {
        System.out.println("Come pienso.");
    }

    @Override
    void hacerRuido() {
        System.out.println("Guau Guau!");
    }



    public Perro(String nombre, int edad){
        super(nombre,edad);
    }

    public void traerPelota(){
        System.out.println("El perro ha traido la pelota!");
    }
}
