/*-color
	-precio
	-talla
	-[]Boton */



public class Camisa {

	private String color;
	private  double precio;
	private String talla;
	private  Boton [] botones;

	

	
	public Camisa(String color, double precio, String talla, Boton[] boton) {
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.botones = botones;
	}



	public String getColor() {
	return color;
}



public double getPrecio() {
	return precio;
}



public String getTalla() {
	return talla;
}



public Boton[] getBoton() {
	return botones;
}



	public void setColor(String color) {
		this.color = color;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public void setBoton(Boton[] boton) {
		this.botones = botones;
	}



}
