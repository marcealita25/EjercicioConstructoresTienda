import java.util.Arrays;

public class Camisa extends Ropa {
	private  Boton [] botones;

	public Camisa (String color, String talla, double precio,Boton []botones){

		super(color, precio, talla);
		this.botones = botones;
	}

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "Camisa [botones=" + Arrays.toString(botones) + ", getBotones()=" + Arrays.toString(getBotones())
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}

