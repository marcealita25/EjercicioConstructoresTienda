public class Prenda {
    private String color;
    private String talla;
    private double precio;

    public Prenda(String color, String talla, double precio) {
        this.color = color;
        this.talla = talla;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Prenda [color=" + color + ", talla=" + talla + ", precio=" + precio + "]";
    }


    
}
