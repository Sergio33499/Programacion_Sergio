package Tema8.Ejercicio_Hogwarts;

public class Asignatura {
    private String nombre;
    private String aula;
    private boolean obligatoria;

    public Asignatura(String nombre, String aula, boolean obligatoria) {
        this.nombre = nombre;
        this.aula = aula;
        this.obligatoria = obligatoria;
    }

    public Asignatura() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAula(String aula){
        this.aula = aula;
    }

    public boolean isObligatoria() {
        return obligatoria;
    }

    public void setObligatoria(boolean obligatoria) {
        this.obligatoria = obligatoria;
    }

    @Override
    public String toString() {
        return "Asignatura: " + nombre + " | Aula: " + aula + " | Obligatoria: " + obligatoria;
    }
}
