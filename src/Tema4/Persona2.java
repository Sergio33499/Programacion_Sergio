package Tema4;

public class Persona2 {

    String dni;
    Cuenta[] misCuentas;

    public Persona2(){
        this.dni = " ";
        this.misCuentas = new Cuenta[3];
    }

    public String toString() {
        String resultado = "DNI: " + this.dni + "\n";

        for (int i = 0; i < this.misCuentas.length; i++) {
            if (this.misCuentas[i] != null) {
                resultado += "Cuenta: " + this.misCuentas[i].numCuenta +
                        " Saldo: " + this.misCuentas[i].consultarSaldo() + "€\n";
            }
        }
        return resultado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cuenta[] getMisCuentas() {
        return misCuentas;
    }

    public void setMisCuentas(Cuenta[] misCuentas) {
        this.misCuentas = misCuentas;
    }
    public Persona2(String dni,Cuenta[] misCuentas){
        this.dni = dni;
        this.misCuentas = new Cuenta[3];
    }

    public void anadirCuentas(Cuenta nuevaCuenta){
        for (int i = 0; i < misCuentas.length; i++) {
            if (misCuentas[i] == null){
                misCuentas[i] = nuevaCuenta;
                System.out.println("Cuenta añadida correctamente");
                return;
            }
        }
        System.out.println("ERROR. La persona ya tiene el maximo de 3 cuentas");
    }

    public boolean esMoroso() {
        boolean moroso = false;

        for (int i = 0; i < misCuentas.length; i++) {
            if (misCuentas[i] != null) {
                if (misCuentas[i].saldoDisp < 0) {
                    moroso = true;
                    break;
                }
            }
        }
        return moroso;
    }



}
