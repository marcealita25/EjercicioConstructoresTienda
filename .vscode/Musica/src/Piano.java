public class Piano extends Instrumento {
    private int numeroOctavas;
    private String tipoPiano;

    public Piano(String nombre, int numeroOctavas, String tipoPiano) {
        super(nombre, "Piano");
        this.numeroOctavas = numeroOctavas;
        this.tipoPiano = tipoPiano;
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Afinando piano " + getNombre() + " tipo: " + tipoPiano + " con " + numeroOctavas + " octavas.");
    }
}
