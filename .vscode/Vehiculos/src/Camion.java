public class Camion extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;

    public Camion(String marca, String modelo, int anio, double velocidadMaxima, String tipo, double capacidadCarga, int numeroEjes) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    // Métodos getters y setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
        System.out.println("Número de ejes: " + numeroEjes);
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto();
        return impuesto * 1.10; // 10% más para camiones
    }
}
