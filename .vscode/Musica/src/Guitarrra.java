public class Guitarra extends Instrumento {
    private int numCuerdas;

    public Guitarra(String nombre, int numCuerdas) {
        super(nombre, "Guitarra");
        this.numCuerdas = numCuerdas;
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Afinando guitarra " + getNombre() + " con " + numCuerdas + " cuerdas.");
    }
}

