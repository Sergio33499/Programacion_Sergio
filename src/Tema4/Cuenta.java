package Tema4;

public class Cuenta {

    String numCuenta;
    double saldoDisp;

    public Cuenta(String numCuenta,double saldoDisp){
        this.numCuenta = numCuenta;
        this.saldoDisp = saldoDisp;
    }

    public double consultarSaldo(){
        return saldoDisp;
    }

    public void abonar(double cantidadAAbonar){
        this.saldoDisp += cantidadAAbonar;
    }

    public void pagar(double cantidadAPagar){
        saldoDisp -= cantidadAPagar;
    }

}

