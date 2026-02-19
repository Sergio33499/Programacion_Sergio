package Tema5.ActividadesColecciones.Colecciones2;

public class Pajaro extends Avistamiento{
    private double peso;
    private String especie;

    public Pajaro(int hora, double peso, String especie){
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    @Override
    public String toString(){
        return "Peso: " + peso + ", Hora: " + hora + ", Especie:" + especie;
    }
}
