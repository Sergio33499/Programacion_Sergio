package Tema5.ActividadesColecciones.POO3;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int anoMatriculacion;

    public Vehiculo(String matricula, String marca, String modelo, int anoMatriculacion) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anoMatriculacion = anoMatriculacion;
    }
}
    class Turismo extends Vehiculo{
        private int numPlazas;
        private String tipoDeUso;

        public Turismo(String matricula, String marca, String modelo,int anoMatriculacion, int numPlazas, String tipoDeUso) {
            super(matricula, marca, modelo, anoMatriculacion);
            this.numPlazas = numPlazas;
            this.tipoDeUso = tipoDeUso;
        }

    }

    class Camion extends Vehiculo{
        int pesoMax;
        boolean mercanciaEsPeligrosa;

        public Camion(String matricula, String marca, String modelo,int anoMatriculacion,int pesoMax, boolean mercanciaEsPeligrosa){
            super(matricula,marca,modelo,anoMatriculacion);
            this.pesoMax = pesoMax;
            this.mercanciaEsPeligrosa = mercanciaEsPeligrosa;
        }
    }

    class Ciclomotor extends Vehiculo{
        int cilindrada;

        public Ciclomotor(int cilindrada,String marca,String modelo, int anoMatriculacion,String matricula){
            super(matricula,marca,modelo,anoMatriculacion);
            this.cilindrada = cilindrada;
        }

        public boolean necesitaCarnet(){
            boolean necesita;
            if (cilindrada >= 125){
                necesita = true;
            }else {
                necesita = false;
            }
            return necesita;
        }

    }

