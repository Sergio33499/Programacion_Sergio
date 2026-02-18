package Tema5.ActividadesColecciones.POO3;

public class Cuadrado extends Rectangulo{

    public Cuadrado(int lado){
        super(lado,lado);
    }

    @Override
    public String toString(){
        return "Cuadrado de base: " + base + " y altura: " + altura;
    }
}
