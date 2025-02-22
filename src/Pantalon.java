public class Pantalon extends Ropa{


	private Boton boton;


	public Pantalon(String color, double precio, String talla, Boton boton) {
		
		super(color, precio, talla);
		this.boton = boton;
	}
	


	public Boton getBoton() {
		return boton;
	}


	public void setBoton(Boton boton) {
		this.boton = boton;
	}



	@Override
	public String toString() {
		return "Pantalon [boton=" + boton + ", toString()=" + super.toString() + "]";
	}



	



	



	

	



}