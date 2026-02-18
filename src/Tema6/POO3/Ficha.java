package Tema6.POO3;

public class Ficha {
    int numero;
    String titulo;
    boolean prestado = false;

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public void mostrarInfo() {
        System.out.println("Numero del ejemplar: " + numero + " y titulo: " + titulo);
    }

    public void prestar() {
        if (this.prestado) {
            System.out.println("El ejemplar esta prestado.");
        } else {
            this.prestado = true;
            System.out.println("El ejemplar ha sido prestado.");
        }
    }

    public void devolver() {
        if (!this.prestado) {
            System.out.println("El ejemplar esta disponible en la biblioteca.");
        } else {
            this.prestado = false;
            System.out.println("Se ha procesado la devolucion");
        }
    }

    public String estadoActual() {
        if (this.prestado) {
            return "Estado: PRESTADO";
        } else {
            return "Estado: DISPONIBLE";
        }
    }
}
