package Tema6.POO3.POO4;

public class Libro extends Biblioteca{
    String autor;
    int numPaginas;

    public Libro(String titulo, String id, String autor, int numPaginas){
        super(titulo,id);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public Libro(){
        this.autor = "Manolo";
        this.numPaginas = 142;
    }

    @Override
    public String toString() {
        return "[Libro] ID: " + id + " | Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numPaginas;
    }
}
