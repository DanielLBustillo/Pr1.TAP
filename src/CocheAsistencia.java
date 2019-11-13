public class CocheAsistencia implements VehiculoTerrestre{
	
	String matricula; 
	
	public String getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	String equipamiento; 
	
		
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	

	CocheAsistencia() {
		
		
	}
	
	public void Repostar() {
		System.out.println("Repostando...");
	}
	
	
	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ponerAlarma() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ponerLuces() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagarAlarma() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagarLuces() {
		// TODO Auto-generated method stub
		
	}

}
