public class GuitarraElectrica extends Guitarra {
    private int potencia;

    public GuitarraElectrica(String nombre, int numCuerdas, int potencia) {
        super(nombre, numCuerdas);
        this.potencia = potencia;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando muy alto " + getNombre());
    }
}
