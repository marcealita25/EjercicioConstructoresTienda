public class Instrumento {
    private String nombre;
    private String tipo;
    private boolean afinado;

    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.afinado = false;
    }

    public void afinar() {
        if (Math.random() > 0.4) {
            afinado = true;
            System.out.println("Afinando instrumento " + nombre + ", se ha afinado.");
        } else {
            afinado = false;
            System.out.println("Afinando instrumento " + nombre + ", no se ha afinado.");
        }
    }

    public void tocar() {
        System.out.println("Tocando instrumento " + nombre);
    }

    public boolean isAfinado() {
        return afinado;
    }

    public String getNombre() {
        return nombre;
    }
}


