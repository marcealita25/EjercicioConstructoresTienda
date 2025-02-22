public class Guitarrra extends Instrumento {
    private int numCuerdas;

    public Guitarrra(String nombre, int numCuerdas, String tipo) {
        super(nombre, "Guitarrra");

        this.numCuerdas = numCuerdas;
    }

      public Guitarrra(String nombre, String tipo, int numCuerdas) {
        super(nombre, tipo);
        this.numCuerdas = 6;
    }


    public int getNumCuerdas() {
        return numCuerdas;
    }

    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }

    @Override
    public String toString() {
        return "Guitarrra [numCuerdas=" + numCuerdas + "]";
    }
    
    
    
    @Override
    public void Afinar(){
       super.Afinar();
      System.out.println("Afinando la guitarra");

    }



}






