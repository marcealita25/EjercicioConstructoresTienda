/*-color
	-precio
	-talla
	-Boton */



public class Pantalon {

	private String color;
	private int precio;
	private double talla;
	private Boton boton;


	public Pantalon(String color, int precio, double talla, Boton boton) {
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.boton = boton;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public double getTalla() {
		return talla;
	}


	public void setTalla(double talla) {
		this.talla = talla;
	}


	public Boton getBoton() {
		return boton;
	}


	public void setBoton(Boton boton) {
		this.boton = boton;
	}

	



}
