package Tema6.POO3.POO4;

import java.time.LocalDateTime;

public class RegistroITV {
    private LocalDateTime fechaEntrada;
    private MedioTransporte transporte;

    public RegistroITV(MedioTransporte transporte){
        this.fechaEntrada = LocalDateTime.now();
        this.transporte = transporte;
    }

    @Override
    public String toString(){
        return "Entrada: " + fechaEntrada + " | Tipo: " + transporte.getClass().getSimpleName() +
                " [" + transporte.getIdentificador() + "]";
    }
}
