public class Tambor extends Instrumento {
    private String material;

    public Tambor(String nombre, String material) {
        super(nombre, "Tambor");
        this.material = material;
    }

   
    public void aporrear() {
        System.out.println("Aporreando tambor " + getNombre());
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public void afinar();

    this.setAfinado(true);
    
    

    





}
