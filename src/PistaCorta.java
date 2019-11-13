import java.util.UUID;

public class PistaCorta extends Pista{
	
	
	PistaCorta(){
		
	}
	
	Pista p = new Pista(); 
	
	
	PistaCorta nuevaPistaCorta() {
		PistaCorta pC = new PistaCorta(); 
		pC.setIdPista("CORTA" + UUID.randomUUID().toString());
		pC.setDisponibilidadPista(true);
		System.out.println("Datos Pista");
		System.out.println("Id Pista:" + pC.getIdPista() + "\nDisponibilidad: " + pC.isDisponibilidadPista()); 
		return pC; 
	}
	
	
	
	public void reservarPista(String numPista) {
		
		if(p.getIdPista() == numPista) {
			p.setDisponibilidadPista(false);
			System.out.println("Pista reservada....");
		}
		else {
			System.out.println("Numero de pista no valido..."); 
		}
		
		
	}
	
	
		public void liberarPista(String numPista) {
			if(p.getIdPista() == numPista) {
				p.setDisponibilidadPista(true);
				System.out.println("Pista liberada...");
			}
			else {
				System.out.println("Numero de pista no valido..."); 
			}
		}
	
	
	//Registramos una nueva pista. En caso de ser demasiado larga la descarta. 
	
	public void generarNuevaPista(String idPista) {
		
		p.setIdPista(idPista);
		System.out.println("Nueva Pista dada de alta....");
	}
	
	//Mostramos los datos de una pista en concreto

	
	public void mostrarDatosPista(String numPista) {
		
		if(numPista == p.getIdPista()) {
			System.out.println("Datos de la pista:" + p.getIdPista());
			System.out.print("Estado: "); 
			if(p.isDisponibilidadPista() == true) {
				System.out.print("libre"); }
			else {
				System.out.print("ocupada");
			}
		}
		
		
		
	}
	

}
