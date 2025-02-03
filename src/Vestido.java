public class Vestido extends Ropa{

	
	private int id;




	public Vestido(String color, double precio, String talla, int id) {
		
		super(color, precio, talla);
		
	}


	@Override
	public String toString() {
		return "Vestido [toString()=" + super.toString() + "]";
	}


	
	



}
