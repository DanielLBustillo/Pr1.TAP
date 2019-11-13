import java.util.UUID;
public class Terminal {
	
	String idTerminal; 
	String nomTerminal;
	
	
	
	public String getIdTerminal() {
		return idTerminal;
	}
	public void setIdTerminal(String idTerminal) {
		this.idTerminal = idTerminal;
	}
	public String getNomTerminal() {
		return nomTerminal;
	}
	public void setNomTerminal(String nomTerminal) {
		this.nomTerminal = nomTerminal;
	} 
	
	Terminal(){
		
	}
	
	
	//Nueva terminal
	
	Terminal nuevaTerminal(String idTerminal, String nomTerminal) {
		Terminal t = new Terminal(); 
		t.setIdTerminal(idTerminal);
		t.setNomTerminal(nomTerminal);
		return t; 
	}
	
	
	//Registrar nuevo vuelo en terminal
	public Vuelo nuevoVuelo(String terminal, String tipo, String origen, String destino) {
		
		Vuelo v = new Vuelo(); 
		
		v.setNumVuelo(UUID.randomUUID().toString());
		v.setFecha("FECHA");
		v.setHora("HORA");
		v.setTerminal(terminal);
		v.setTipo(tipo);
		v.setDestino(destino);
		v.setOrigen(origen);
		
		System.out.println("Vuelo registrado"); 
		System.out.println("Numero vuelo: " + v.getNumVuelo() + "\nOrigen: " + v.getOrigen() + "\nDestino: " + v.getDestino() + "\nFecha: " + v.getFecha() +  "\nHora: " + v.getHora() +  "\nTerminal: "+ v.getTerminal() +  "\nTipo: " + v.getTipo());
		
		return v; 
	}
	
	 
	
	//Registro de avion
	
	AvionCarga registroAvionCarga(String modelo, int tam, int capacidad) {
		
		AvionCarga aC = new AvionCarga(); 
		aC.setIdAvion(UUID.randomUUID().toString());
		aC.setModelo(modelo);
		aC.setTaraMaxima(capacidad);
		aC.setTam(tam);
		
		System.out.println("Avion registrado"); 
		System.out.println("Matricula Avion: " + aC.getIdAvion() + "\nModelo Avion: " + aC.getModelo() + "\nTamaño: " + aC.getTam() + "\nCapacidad: " + aC.getTaraMaxima());
		
		
		return aC; 
	}
	
	
	AvionPasajeros registroAvionPasajeros(String modelo, int tam, int capacidad) {
		
		AvionPasajeros aP = new AvionPasajeros(); 
		aP.setIdAvion(UUID.randomUUID().toString());
		aP.setModelo(modelo);
		aP.setTCapacidad(capacidad);
		aP.setTam(tam);
		
		System.out.println("Avion registrado"); 
		System.out.println("Matricula Avion: " + aP.getIdAvion() + "\nModelo Avion: " + aP.getModelo() + "\nTamaño: " + aP.getTam() + "\nCapacidad: " + aP.getCapacidad()); 
		
		return aP; 
	}
	
	
	AutobusPasajeros registroAutobusPasajeros(String tam) {
		
		AutobusPasajeros abusP = new AutobusPasajeros();
		abusP.setMatricula(UUID.randomUUID().toString());
		abusP.setTam(tam);
		
		System.out.println("Autobus registrado"); 
		System.out.println("Matricula autobus: " + abusP.getMatricula() + "\nTamaño autobus: " + abusP.getTam()); 
		
		return abusP; 
		
	}
	
	AutobusMaletas registroAutobusMaletas(String tam) {
		AutobusMaletas abusM = new AutobusMaletas(); 
		abusM.setMatricula(UUID.randomUUID().toString());
		abusM.setTam(tam);
		System.out.println("Autobus registrado"); 
		System.out.println("Matricula autobus: " + abusM.getMatricula() + "\nTamaño autobus: " + abusM.getTam()); 
		return abusM; 
	}
	
	CamionRepostaje registroCamionRepostaje(String capacidad) {
		CamionRepostaje cR = new CamionRepostaje(); 
		cR.setMatricula(UUID.randomUUID().toString());
		cR.setCapacidad(capacidad);
		System.out.println("Camion creado:"); 
		System.out.println("Matricula camion" + cR.getMatricula() + "\nCapacidad: " + cR.getCapacidad()); 
		return cR; 
		
	}
	
	CocheAsistencia registrarCocheAsistencia(String equipamiento) {
		CocheAsistencia cAsis = new CocheAsistencia(); 
		cAsis.setMatricula(UUID.randomUUID().toString());
		cAsis.setEquipamiento(equipamiento);
		System.out.println("Coche Asistencia creado:");
		System.out.println("Matricula coche: "+ cAsis.getMatricula() + "\nEquipamiento: " + cAsis.getEquipamiento()); 
		return cAsis; 
	}
	
	Avion a = new Avion(); 
	//Registro de vehiculo
	public void registroVehiculo() {}
	
	//Reserva de pista para avion
		public void reservaPista(String numPista) {
			
			int tam = a.getTam(); 
			if(tam > 20) {
				PistaLarga pL = new PistaLarga(); 
				pL.reservarPistaLarga(numPista);
				pL.mostrarDatosPista(numPista);
				
			}
			else {
				PistaCorta pC = new PistaCorta();
				pC.reservarPista(numPista);
				pC.mostrarDatosPista(numPista);
			}
			
			
		}
	
	
	
	
	
	

}
