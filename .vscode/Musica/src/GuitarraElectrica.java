public class GuitarraElectrica extends Guitarrra {
    private double potencia;

    
    public GuitarraElectrica(String nombre, int numCuerdas, String tipo, double potencia) {
        super(nombre, numCuerdas, tipo);
        this.potencia = potencia;
    }


    public void  setPotencia(double potencia){

    }

    

    @Override
    public void tocar() {
        System.out.println("Tocando muy alto " + getNombre());
    }
}
