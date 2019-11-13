import java.util.ArrayList;
import java.util.Scanner;




public class Aeropuerto {
	
	private String nombre;
	private String localizacion;
	
	ArrayList<AutobusMaletas> aBusM = new ArrayList<AutobusMaletas>(); 
	ArrayList<AutobusPasajeros> aBusP = new ArrayList<AutobusPasajeros>(); 
	ArrayList<CamionRepostaje> camR = new ArrayList<CamionRepostaje>(); 
	ArrayList<CocheAsistencia> cocAs = new ArrayList<CocheAsistencia>(); 
	ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>(); // Array donde guardaremos los vuelos
	ArrayList<PistaCorta> pistaC = new ArrayList<PistaCorta>(); // Array de las pistas cortas
	ArrayList<PistaLarga> pistaL = new ArrayList<PistaLarga>(); 
	ArrayList<AvionCarga> avionC = new ArrayList<AvionCarga>();
	ArrayList<AvionPasajeros> avionP = new ArrayList<AvionPasajeros>();
	ArrayList<Terminal> terminal = new ArrayList<Terminal>(); 
	
	
	int contadorPasajeros = 0; // Contador de los pasajeros que han pasado pr el aeropuerto
	
	
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
	// Constructor
	Aeropuerto () {
		
		
	}
	
	Scanner sc = new Scanner(System.in); 
	Terminal t = new Terminal(); 
	
	// Metodos
	
	//Añadir terminal
	public void anadirTerminal(String idTerminal, String nomTerminal) {
		
		t = t.nuevaTerminal(idTerminal, nomTerminal);
		System.out.println("Id Terminal: " + t.getIdTerminal());
		System.out.println("Nombre Terminal: " + t.getNomTerminal()); 
		terminal.add(t);
		
		
	}
	//Borrar terminal
	public void modificarTerminal(String idTerminal, String nuevoIdTerminal, String nuevoNomTerminal) {
		for (Terminal tIndex: terminal) 
			if(t.getIdTerminal() == idTerminal) {
				t.setIdTerminal( nuevoIdTerminal);
				t.setNomTerminal( nuevoNomTerminal);
		}
	}
	
	//Mostrar terminales
	public void mostrarTerminales() {
		System.out.println("Terminales:"); 
		for(int i = 0; i<terminal.size(); i++) {
			terminal.get(i);
		}
	}
	
	
	public void anadirVehiculo() {
		// Este metodo recibe el tipo de vehiculo, y con un switch añade al array flota el vehiculo que se quiera crear
		System.out.print("Modelo: ");			
		System.out.println("Avion");
		System.out.println("Avion de Pasajeros --> AvionPasajeros");
		System.out.println("Autobus de Carga --> AvionCarga");
		System.out.println("Autobus de Pasajeros --> AutobusPasajeros");
		System.out.println("Autobus de Maletas --> AutobusMaletas");
		System.out.println("Camion de Repostaje --> CamionRepostaje");
		System.out.println("Coche de Asistencia --> CocheAsistencia");
		System.out.println("Introduzca modelo a añadir:"); 
		String Tipo = sc.nextLine();
		//int nPasaj = Integer.parseInt(System.console().readLine());
		
		
		switch (Tipo) {
		
			case "AvionPasajeros":
				
				
				AvionPasajeros aP = new AvionPasajeros(); 
				System.out.println("Introduzca modelo/tam/capacidad: "); 
				String modelo = sc.nextLine();
				String tamS = sc.nextLine();
				String capacidadS = sc.nextLine();
				int tam = Integer.parseInt(tamS);
				int capacidad = Integer.parseInt(capacidadS);
				aP = t.registroAvionPasajeros(modelo, tam, capacidad); 
				 
				avionP.add(aP);
				
				
				
				break;
				
				
			case "AvionCarga":
				
				 
				AvionCarga aC = new AvionCarga(); 
				System.out.println("Introduzca modelo/tam/capacidad:"); 
				String modeloC = sc.nextLine();
				String tamCS = sc.nextLine();
				String capacidadCS = sc.nextLine();
				int tamC = Integer.parseInt(tamCS);
				int capacidadC = Integer.parseInt(capacidadCS);
				aC = t.registroAvionCarga(modeloC, tamC, capacidadC); 
				avionC.add(aC); 
				break;
				
			case "AutobusPasajeros":
				
				AutobusPasajeros abusP = new AutobusPasajeros(); 
				System.out.println("Introduzca tamaño:"); 
				String tamAbusP = sc.nextLine(); 
				
				abusP = t.registroAutobusPasajeros(tamAbusP); 
				aBusP.add(abusP); 
				
				
				break;
				
			case "AutobusMaletas":
				
				AutobusMaletas abusM = new AutobusMaletas(); 
				System.out.println("Introduzca tamaño:"); 
				String tamAbusM = sc.nextLine(); 
				
				abusM = t.registroAutobusMaletas(tamAbusM); 
				aBusM.add(abusM); 
				
				break;
				
			case "CamionRepostaje":
				
				CamionRepostaje cR = new CamionRepostaje(); 
				System.out.println("Introduzca capacidad"); 
				String capacidadCR = sc.nextLine();
				cR = t.registroCamionRepostaje(capacidadCR); 
				camR.add(cR); 
				
				break;
				
				
			case "CocheAsistencia":
				
				CocheAsistencia cAsis = new CocheAsistencia(); 
				System.out.println("Introduzca equipamiento");
				String equipamiento = sc.nextLine(); 
				cAsis = t.registrarCocheAsistencia(equipamiento);
				cocAs.add(cAsis); 
				
				
				break;
		}
		
		
		
	}
	
	// Creamos un nuevo vuelo
	public void nuevoVuelo() {
		
		Vuelo v = new Vuelo(); 
		System.out.println("Terminales disponibles:");
		for (Terminal tIndex : terminal) 
			 System.out.println(tIndex);
			
		System.out.println("Introduza terminal de donde salga el vuelo:"); 
		String terminal = sc.nextLine();
		System.out.println("Introduzca tipo de vuelo (comercial/privado):"); 
		String tipo = sc.nextLine();
		System.out.println("Introduzca origen del vuelo:");
		String origen = sc.nextLine();
		System.out.println("Introduzca destino del vuelo: ");
		String destino = sc.nextLine(); 
		
		v = t.nuevoVuelo(terminal, tipo, origen, destino);
		vuelos.add(v); 
		
		
		
	}
	
	// Creamos una nueva pista
	public void nuevaPista() {
		
		System.out.println("Introduzca tamaño de pista: (entre 50-200m):");
		int tamPista = Integer.parseInt((sc.nextLine())); 
		if(tamPista < 120) {
			PistaCorta pC = new PistaCorta(); 
			pC = pC.nuevaPistaCorta();
			pistaC.add(pC); 
		}else {
			PistaLarga pL = new PistaLarga(); 
			pL = pL.nuevaPistaLarga(); 
			pistaL.add(pL); 
		}
		
		
	}
	
}
