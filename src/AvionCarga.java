
public class AvionCarga extends Avion{
	
	private String idAvion;
	private int taraMaxima;
	private String modelo;
	private double tam; 
	
	Avion a = new Avion(); 
	
	
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
	public int getTaraMaxima() {
		return taraMaxima;
	}
	public void setTaraMaxima(int taraMaxima) {
		this.taraMaxima = taraMaxima;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}
