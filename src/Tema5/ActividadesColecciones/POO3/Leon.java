package Tema5.ActividadesColecciones.POO3;

public class Leon extends Animal{

    @Override
    void comer() {
        System.out.println("Come animales.");
    }

    @Override
    void hacerRuido() {
        System.out.println("Grrr Grrr!");
    }

    public Leon(String nombre, int edad){
        super(nombre, edad);
    }

    public void cazar(){
        System.out.println("El león ha cazado una zebra.");
    }
}

