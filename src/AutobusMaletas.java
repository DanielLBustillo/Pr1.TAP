
public class AutobusMaletas implements VehiculoTerrestre{
	
	String matricula; 
	String tam;
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTam() {
		return tam;
	}

	public void setTam(String tam) {
		this.tam = tam;
	}

	AutobusMaletas() {
		
	}
	
	public void ponerAlarma() {
		System.out.println("Encendiendo la alarma...");
	}
	public void ponerLuces() {
		System.out.println("Encendiendo luces");
		
	}
	
	public void apagarAlarma() {
		
		System.out.println("Apagando alarma...");
		
	}
	public void apagarLuces() {
		
		System.out.println("Apagando luces...");
		
	}
	
	
	public void CargarMaletas() {
		
		System.out.println("Cargando maletas...");
	}
	
	public void DescargarMaletas() {
		
		System.out.println("Descargando maletas...");
	}
	
	public void TransportarMaletas() {
		
		System.out.println("Transportando maletas...");
	}
	
	
	
	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println("Arrancando");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelerando");
		
	}

	
	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("Frenando...");
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("Parando");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando");
	}

}
