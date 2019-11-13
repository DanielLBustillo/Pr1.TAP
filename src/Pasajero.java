
public class Pasajero {

	private int idVuelo;
	private int nMaletas;
	private String nombreYApellidos;
	
	

	public Pasajero(int nMaletas, String nombreYApellidos, int idVuelo) {
		this.idVuelo = idVuelo;
		this.nombreYApellidos = nombreYApellidos;
		this.nMaletas = nMaletas;
	}
	
	
		
	public int getIdVuelo() {
		return idVuelo;
	}
	
	public int getnMaletas() {
		return nMaletas;
	}

	public String getNombreYApellidos() {
		return nombreYApellidos;
	}
	

}
