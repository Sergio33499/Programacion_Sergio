package Tema5.ActividadesColecciones.POO3;

public class Pez extends Animal{

    public Pez(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void comer() {
        System.out.println("Come plancton.");
    }

    @Override
    public void dormir(){
        System.out.println("Flota y descansa.");
    }

    @Override
    void hacerRuido() {
        System.out.println("Glu Glu!");
    }

    public void nadar(){
        System.out.println("El pez se fué nadando!");
    }
}
