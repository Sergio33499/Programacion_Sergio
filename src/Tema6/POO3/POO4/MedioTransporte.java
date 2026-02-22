package Tema6.POO3.POO4;

public abstract class MedioTransporte {
    protected String identificador;

    public MedioTransporte(String id){
        this.identificador = id;
    }

    public String getIdentificador(){
        return this.identificador;
    }
}
