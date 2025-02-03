

public class Maniqui {

	
	private  int id;
	private  Pantalon pantalon;
	private  Camisa camisa;

	}
	
	public Maniqui(int id){
		this.id = id;

	}
	
	public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
		
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public Maniqui(int id, Vestido vestido){
		this.id = id;
		this.Vestido = vestido;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPantalon(String pantalon) {
		this.pantalon = pantalon;
	}


	public void setCamisa(String camisa) {
		this.camisa = camisa;
	}


	public void setVestidos(String vestidos) {
		this.vestido = vestidos;
	}


	public String getId() {
		return id;
	}



	public String getPantalon() {
		return pantalon;
	}



	public String getCamisa() {
		return camisa;
	}



	public String getVestidos() {
		return vestido;
	}

	




	

}
