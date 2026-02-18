package Tema6.POO3;

public class Gato extends Animal{

    @Override
    void comer() {
        System.out.println("Come latas de atún.");
    }

    @Override
    void hacerRuido() {
        System.out.println("Miau Miau!");
    }

    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    public void escupirBolaPelo(){
        System.out.println("El gato escupió una bola de pelo");
    }
}
