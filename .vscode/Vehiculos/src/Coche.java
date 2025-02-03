public class Coche extends Vehiculo {
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;

    public Coche(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int numeroPuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    // Métodos getters y setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Tiene aire acondicionado: " + (tieneAireAcondicionado ? "Sí" : "No"));
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();
        return impuesto * 1.05; // 5% más para coches
    }
}
