package Tema6.POO3;

public class Libro extends Ficha{
    String autor;
    String editorial;

    public Libro(int numero, String titulo, String autor, String editorial){
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String toString(){
        return "Libro: " + titulo + ", Autor: " + autor + ", Editorial" + editorial;
    }

}
