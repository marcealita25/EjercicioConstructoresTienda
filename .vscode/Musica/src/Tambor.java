public class Tambor extends Instrumento {
    private String material;

    public Tambor(String nombre, String material) {
        super(nombre, "Tambor");
        this.material = material;
    }

    @Override
    public void afinar() {
        // El tambor siempre está afinado
        System.out.println("Afinando tambor " + getNombre() + " (siempre afinado).");
    }

    public void aporrear() {
        System.out.println("Aporreando tambor " + getNombre());
    }
}
