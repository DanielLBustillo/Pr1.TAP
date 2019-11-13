
public class Avion implements VehiculoAereo{
	
	private int tam; 
	
	//Constructor 
	public Avion() {
		
	}
	
	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public void arrancar() {
		System.out.println("Avion en marcha...");
	}

	
	public void acelerar() {
		System.out.println("Avion acelerando...");
	}
	
	public void mantenerVelocidad() {
		System.out.println("Velocidad constante...");
	}

	
	public void frenar() {
		System.out.println("Avion frenando...");
	}

	
	public void parar() {
		System.out.println("Avion parado...");
	}

	
	public void apagar() {
		System.out.println("Avion apagado...");
	}


	public void despegar() {
		System.out.println("Avion despegando del suelo...");
	}

	public void aterrizar() {
		System.out.println("Avion aterrizando en el suelo...");
	}

}
