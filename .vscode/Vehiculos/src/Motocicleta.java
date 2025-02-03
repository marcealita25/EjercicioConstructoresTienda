public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int anio, double velocidadMaxima, String tipo, boolean tieneSidecar, int cilindrada) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.tieneSidecar = tieneSidecar;
        this.cilindrada = cilindrada;
    }

    // Métodos getters y setters
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();
        return impuesto * 0.95; // 5% menos para motos
    }
}
