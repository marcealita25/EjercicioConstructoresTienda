/*-color
	-precio
	-talla
 */



public class Vestido {

	private String color;
	private double precio;
	private String talla;
	private int id;




	public Vestido(String color, double precio, String talla, int id) {
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.id    = id;
	}


	
	public int getId() {  
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getColor() {
		return color;
	}
	public int getPrecio() {
		return precio;
	}
	public String getTalla() {
		return talla;
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

	



}
