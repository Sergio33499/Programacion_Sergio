package Tema6.POO3;

public class DVD extends Ficha{
    String director;
    int anio;
    String tipo;

    public DVD(int numero, String titulo, String director, int anio, String tipo){
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String toString(){
        return "DVD: " + titulo + ", Año: " + anio + ", Tipo: " + tipo + ", Director: " + director + ", Numero: " + numero;
    }
}
