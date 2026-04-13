package Tema7.ActividadesFicheros;

import java.io.Serializable;

// Implementamos Serializable para que nos sirva tambien para el ejercicio 2 mas adelante
public class Funko implements Serializable {
    private String nombre;
    private String modelo;
    private double precio;
    private int fecha;

    // Constructor
    public Funko(String nombre, String modelo, double precio, int fecha) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getNombre() { return nombre; }
    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }
    public int getFecha() { return fecha; }

    public String toCSV() {
        return nombre + "," + modelo + "," + precio + "," + fecha;
    }

    @Override
    public String toString() {
        return String.format("Funko [Nombre: %s, Modelo: %s, Precio: %.2f€, Año: %d]",
                nombre, modelo, precio, fecha);
    }
}