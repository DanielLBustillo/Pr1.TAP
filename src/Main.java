
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Aeropuerto aeropuerto = new Aeropuerto(); 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		//aeropuerto.mostrarTerminales();
		
		System.out.println("Si desea agregar una nueva terminal introduza 0");
		int t = Integer.parseInt(sc.nextLine().toString()); 
		if(t == 0) {
			System.out.println("Introduzca un id de terminal");
			String idTerminal = sc.nextLine();
			System.out.println("Introduza un nombre para la terminal");
			String nomTerminal = sc.nextLine();
			aeropuerto.anadirTerminal(idTerminal, nomTerminal);
			//aeropuerto.mostrarTerminales();
		}
		else {
		//Mostramos los datos por pantalla durante 3 segundos
		try {
			System.out.println("Accediendo a terminal. Espere.");
			Thread.sleep(3000);}
		catch (Exception e) {
			System.out.println(e); 
		}
		
		//Realizamos un salto de linea
		for(int i = 0; i<60; i++)
			System.out.println(" ");
		
		System.out.println("Acceso a terminal: " + aeropuerto.t.getNomTerminal()); 
		System.out.println("\n\nMENU:");
		System.out.println("1.- Vehículos");
		System.out.println("2.- Personal"); 
		System.out.println("3.- Pistas"); 
		System.out.println("4.- Vuelos"); 
		System.out.println("Introduzca una opción: "); 
		try{
			String opcion = sc.nextLine();
			switch(opcion) {
			case "1": 
				
				System.out.println("Pulse -1 para continuar al control de vehículos. Pulse cualquier tecla para dar de alta vehiculos.");
				int v = Integer.parseInt(sc.nextLine().toString());
				while(v != -1) {
				aeropuerto.anadirVehiculo();
				}
				
				System.out.println("Elija una opcion:"); 
				System.out.println("1.- Vehiculo terrestre");
				System.out.println("2.- Vehiculo aereo");
				String vehiculo = sc.nextLine();
				switch(vehiculo) {
				case "1":
					System.out.println("1.- Autobus Maletas");
					System.out.println("2.- Camion Repostaje");
					System.out.println("3.- Autobus Viajeros");
					System.out.println("4.- Coche Asistencia");
					String tipoVehiculoTer = sc.nextLine();
					switch(tipoVehiculoTer) {
					case "1":
						
						System.out.println("Autobus maletas. Seleccione una opción. Use -1 para salir");
						System.out.println("1.- Arrancar");
						System.out.println("2.- Acelerar");
						System.out.println("3.- Frenar");
						System.out.println("4.- Parar"); 
						System.out.println("5.- Apagar");
						System.out.println("6.- Poner Luces");
						System.out.println("7.- Apagar Luces"); 
						int ordVM = Integer.parseInt(sc.nextLine().toString()); 
						AutobusMaletas aM = new AutobusMaletas(); 
						do {
							switch(ordVM) {
							
							case 1:
								aM.arrancar();
								break;
							case 2:
								aM.acelerar();
								break; 
							case 3:
								aM.frenar();
								break; 
							case 4:
								aM.parar();
								break; 
							case 5:
								aM.apagar();
								break; 
							case 6:
								aM.ponerLuces();
								break; 
							case 7: 
								aM.apagarLuces();
								break; 
							}
						}while(ordVM != -1); 
						break; 
					case "2":
						break; 
					case "3":
						break; 
					case "4":
						break; 
					}
					break;
				case "2":
					System.out.println("1.- Avion pasajeros");
					System.out.println("2.- Avion carga");
					break; 
				}
				break;
			case "2": 
				break;
			case "3":
				break; 
			case "4":
				break; 
			}}
		
			catch(Exception e) {
				System.out.println("Opcion no valida. Introduza un numero del 1 al 4" + e); 
			}
		}
		
		
		
		
		
		
	}
}


