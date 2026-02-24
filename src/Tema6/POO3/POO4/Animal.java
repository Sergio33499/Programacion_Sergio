package Tema6.POO3.POO4;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public Animal(){
        this.nombre = "Paco";
    }

    public abstract void hacerRuido();

    public String getNombre(){
        return nombre;
    }
}
