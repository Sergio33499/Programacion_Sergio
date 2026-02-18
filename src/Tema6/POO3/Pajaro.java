package Tema6.POO3;

public class Pajaro extends Animal{

    @Override
    void comer() {
        System.out.println("Come semillas.");
    }

    @Override
    void hacerRuido() {
        System.out.println("Pio Pio!");
    }

    public Pajaro(String nombre, int edad){
        super(nombre, edad);
    }

    public void volar(){
        System.out.println("El pájaro se fué volando!");
    }
}
