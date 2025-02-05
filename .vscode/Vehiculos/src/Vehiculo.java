public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double velocidadMaxima;
    private String tipo; // Diesel, Gasolina, Electrico, Hibrido

    public Vehiculo(String marca, String modelo, int anio, double velocidadMaxima, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
    }

    // Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Tipo: " + tipo);
    }

    // Calcular impuestos
    public double calcularImpuesto() {
        double impuestoBase = 200.0;
        int edad = 2025 - anio;

        // Aumento por edad
        if (edad > 20) {
            impuestoBase *= 1.10;
        } else if (edad > 10) {
            impuestoBase *= 1.05;
        }

        // Aumento por tipo
        if (tipo.equals("Diesel") || tipo.equals("Gasolina")) {
            impuestoBase *= 1.10;
        } else if (tipo.equals("Electrico")) {
            impuestoBase *= 0.90;
        } else if (tipo.equals("Hibrido")) {
            impuestoBase *= 0.95;
        }

        return impuestoBase;
    }
}

