package Tema6.POO3;

abstract class Animal {
    String nombre;
    int edad;

    abstract void comer();

    public void dormir() {
        System.out.println("Cierran los ojos y descansan.");
    }

    abstract void hacerRuido();

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}