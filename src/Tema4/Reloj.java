package Tema4;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Reloj(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public void setHora(int hora){
        if (hora > 24 || hora < 0){
            System.out.println("ERROR. Introduce una hora correcta: ");
        }else {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto){
        if (minuto >= 60 || minuto < 0){
            System.out.println("ERROR. Introduce unos minutos correctos (0-59)");
        }else {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo){
        if (segundo >= 60 || segundo < 0){
            System.out.println("ERRor. Introduce unos segundos correctos (0-59)");
        }else {
            this.segundo = segundo;
        }
    }

    public static void mostrarHora(int hora, int minuto, int segundo){
        System.out.println("El reloj marca las: " + hora + ":" + minuto + ":" + segundo);
    }

    public String toString(){
        return "El reloj marca las: " + hora + ":" + minuto + ":" + segundo;
    }

    public static void main(String[] args){

        Reloj reloj = new Reloj(22,10,40);
        mostrarHora(reloj.hora, reloj.minuto, reloj.segundo);

        System.out.println(reloj);

    }
}
