package es.cursojava.poo.ejercicios.maniqui;

public class Pantalon extends Prenda {
    private int largo;

    public Pantalon(String color, double precio, String talla, int largo) {
        super(color, precio, talla);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}