

public class AvionPasajeros extends Avion{
	
	
	private String idAvion;
	private int capacidad;
	private String modelo;
	
	Avion a = new Avion(); 
	
	AvionPasajeros(){
		
	}
	
	public int getTam() {
		return a.getTam();
	}
	
	public void setTam(int tam) {
		a.setTam(tam);
	}
	
	
	public String getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setTCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
