package Tema5.ActividadesColecciones.POO3;

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

class Perro extends Animal{

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

class Gato extends Animal{

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

class Leon extends Animal{

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

class Pajaro extends Animal{

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

class Pez extends Animal{

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