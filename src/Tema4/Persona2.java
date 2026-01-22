package Tema4;

public class Persona2 {

    String dni;
    Cuenta[] misCuentas;

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

    public boolean esMoroso(){
        for (int i = 0; i < misCuentas.length; i++) {
            if (misCuentas[i] != null){
                if (misCuentas[i].saldoDisp < 0){
                    return true;
                }
            }
        }
        return false;
    }



}
