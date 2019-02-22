package sitioparaaparcar;

// Importamos todo lo necesario.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class PRU04E05Parking_David_Sanchez {

	// Declaracion de los hashmaps y atributos.
	
	private int plaza;
	private int plaza_d;
	HashMap<Integer, String> hmap = new HashMap<Integer, String>(plaza);
	HashMap<Integer, String> hmap_d = new HashMap<Integer, String>(plaza_d);

	// Constructor.
	
	public PRU04E05Parking_David_Sanchez (int places_no_discapacitats, int places_discapacitats) {

		this.plaza = places_no_discapacitats;
		this.plaza_d = places_discapacitats;


	}

	// Me creo una subclase del Parking, por mi facilidad de mover los coches.
	
	protected class Coche{

		protected String matricula;
		protected boolean discapacitado;
		protected int posicion;

		// Tengo un constructor que depende del valor que le ponga, sera discapacitado o no lo será.
		
		public Coche(String mat, int numero) {

			this.matricula = mat;
			if (numero>=0 && numero<=2) {

				this.discapacitado = true;

			}
			else if (numero>2 && numero <=50) {

				this.discapacitado = false;

			}	
		}


	}

	// Hago el enum.
	
	protected enum TipusPlacesParking {
		
	Discapacitat,
		
	No_Discapacitat;
		
	}

	
	// Son dos metodos para toda la introduccion de cada matricula a los hashmap.
	
	private void cocheDiscapacitado(Coche coche)throws Exception {

		// Defino las variables.
		
		int porcentaje85_d;
		int porcentaje99_d;
		int contadord_d = 1;
		int contador_d = 1;
		
		// Contador para saber plazas ocupadas. Luego son unos cuantos if, para ver a cuanto esta el parking, introducir el coche si
		// se puede y si esta lleno. En ese caso, al ser el discapacitado, intento meterlo en las otras plazas siguiendo el mismo orden.
		
		for(int i= 1; i<= plaza_d; i++) {

			if(!(hmap_d.get(i) == null)) {

				contadord_d++;

			}
		}

		if (contadord_d<plaza_d) {
			
			if (contadord_d == plaza_d-1) {

				System.out.println ("ALERTA =====> Ocupació de places per discapacitats supera el 85%.");

				contadord_d = 1;

				for(int i = 1; i<= plaza_d; i++) {

					if(hmap_d.get(i) == null) {

						hmap_d.put(i, coche.matricula); 
						System.out.println (coche.matricula + " se ha introduit en la plaça: " + i + " de discapacitats.");
						coche.posicion = i;
						i = plaza_d + 1;
					}
				}
			}	
			
			else {

				contadord_d = 1;

				for(int i = 1; i<= plaza_d; i++) {

					if(hmap_d.get(i) == null) {

						hmap_d.put(i, coche.matricula);
						System.out.println (coche.matricula + " se ha introduit en la plaça: " + i + " de discapacitats.");
						coche.posicion = i;
						i = plaza_d + 1;

					}
				}
			}
		
		}else {

				for(int i = 1; i<=plaza; i++) {
				
				if(!(hmap.get(i) == null)) {
					
					contador_d++;
		
				}}
				
				porcentaje85_d = (85 * plaza_d)/100;
				porcentaje99_d = plaza_d - 1;	
				
				if (contador_d >= porcentaje85_d && contador_d <= porcentaje99_d) {

					System.out.println ("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");

					contador_d = 0;

					for(int i= 1 ; i<=plaza; i++) {

						if(hmap.get(i) == null) {

							hmap.put(i, coche.matricula); 
							System.out.println ("ALERTA =====> Parking per discapacitats ple. Ha ocupat plaça normal num: " + i);
							coche.posicion = i;
							i = plaza + 1;
						}
					}
				}	


				else if(contador_d == plaza) {

					System.out.println ("ALERTA =====> Parking per no discapacitats ple.");
					System.out.println ("ALERTA =====> No haurá aparcat a cap parking.");
					contador_d = 0;
					
				}
				else {

					contador_d = 0;

					for(int i= 1; i<=plaza; i++) {

						if(hmap.get(i) == null) {

							hmap.put(i, coche.matricula);
							System.out.println ("ALERTA =====> Parking per discapacitats ple. Ha ocupat plaça normal num: " + i);
							coche.posicion = i;
							i = plaza + 1;

						}
					}
				}
				
			
		}


	}

	private void cocheNoDiscapacitado(Coche coche)throws Exception {

		// Mas de lo mismo pero sin ser discapacitado pero con la definición del garrulo.
		
		int porcentaje85 = 0;
		int porcentaje99 = 0;
		int contador = 1;
		int contadord = 1;
		int garruloTofolVerdera = 0;
		
	
		garruloTofolVerdera = (int)(Math.random() * (80 - 0) + 0);

		if (garruloTofolVerdera >=0 && garruloTofolVerdera <= 75) {


			for(int i= 1; i<=plaza; i++) {

				if(!(hmap.get(i) == null)) {

					contador++;

				}}

			porcentaje85 = (85 * plaza)/100;
			porcentaje99 = plaza - 1;		


			if (contador >= porcentaje85 && contador <= porcentaje99) {

				System.out.println ("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");

				contador = 1;

				for(int i= 1; i<=plaza; i++) {

					if(hmap.get(i) == null) {

						hmap.put(i, coche.matricula); 
						System.out.println (coche.matricula + " se ha introduit en la plaça: " + i + ".");
						coche.posicion = i;
						i = plaza + 1;
					}
				}
			}	


			else if(contador == plaza) {

				System.out.println ("ALERTA =====> Parking per no discapacitats ple.");
				contador = 1;
			}
			else {

				contador = 1;

				for(int i= 1; i<=plaza; i++) {

					if(hmap.get(i) == null) {

						hmap.put(i, coche.matricula);
						System.out.println (coche.matricula + " se ha introduit en la plaça: " + i + ".");
						coche.posicion = i;
						i = plaza + 1;

					}
				}
			}
		}
		else {

			for(int i= 1; i<= plaza_d; i++) {

				if(!(hmap_d.get(i) == null)) {

					contadord++;

				}
			}

			if (contadord<=plaza_d) {

				porcentaje85 = (85 * plaza_d)/100;
				porcentaje99 = plaza_d - 1;		

				if (contadord >= porcentaje85 && contadord <= porcentaje99) {

					System.out.println ("ALERTA =====> Ocupació de places per discapacitats supera el 85%.");
					
					contadord = 1;

					for(int i= 1; i<= plaza_d; i++) {

						if(hmap_d.get(i) == null) {

							hmap_d.put(i, coche.matricula); 
							System.out.println ("ALERTA =====> Garrulo detected!!! Ha aparcat a la plaça: " + i);
							coche.posicion = i;
							i = plaza_d + 1;
						}
					}
				}	

				else {

					contadord = 1;

					for(int i= 1; i<= plaza_d; i++) {

						if(hmap_d.get(i) == null) {

							hmap_d.put(i, coche.matricula);
							System.out.println ("ALERTA =====> Garrulo detected!!! Ha aparcat a la plaça: " + i);
							coche.posicion = i;
							i = plaza_d + 1;

						}
					}
				}
			}
			else {

				System.out.println ("ALERTA =====> Parking per no discapacitats ple.");
				System.out.println ("ALERTA =====> Aquest cotxe no ha pogut aparcar a cap parking.");

			}
		}

		}

	
	
	private int matriculaV(Coche coche)throws Exception {

		// Un metodo sencillo para verificar las matriculas. Compruebo por posiciones que lo primero son 4 numeros y
		// luego 3 letras, en ese caso devuelvo un int, con el valor 7 que dara el visto bueno a mi otro metodo.
		
		int valor = 0;
		String Vmatricula = coche.matricula;

		for (int i = 0; i<4; i++) {

			if (Vmatricula.charAt(i)>=48 && Vmatricula.charAt(i)<=57) {

				valor++;

			}

		}

		for (int i = 4; i<7; i++) {

			if (Vmatricula.charAt(i)>=65 && Vmatricula.charAt(i)<=90) {

				valor++;

			}

		}
		
		
		return valor;

			
	}
	
	
	public void llegirMatricules(String path) throws Exception{	

		//  Este metodo para mi, resulta el mas complicado de entender. Primero miro la ruta, se la igualo a una variable, que mas tarde mirare con el buffer reader.
		// A su vez, hago un do while a todo el try catch, para que en caso de que la ruta sea incorrecta, lo soluciono en un catch volviendo a pedir la ruta.
		// En caso de que sea correcta, realizo otro do while por cada linea del archivo. A cada matricula, se la asigno a un objeto llamado coche, para el cual despues
		// asignarle un numero aleatorio el cual, indicara si ese coche es discapacitado o no. Una vez tengo el coche creado, paso la matricula a mi metodo anterior para que 
		// verifique que es correcta. Si es asi, solo falta mirar de que tipo es, para introducirla en el hashmap indicado, con mis otros metodos. Cuando no haya mas lineas,
		// acabrá.

		String scanner = path;
		int num = 0;

		do {
			
			
			try {	

				BufferedReader br = new	BufferedReader (new FileReader(scanner));

				String linea = "";
				int probabilidad = 0;
				int valor = 0;

				do {

					linea = br.readLine();
					System.out.print("\n");
					probabilidad = (int)(Math.random() * (50 - 0) + 0);
					valor = 0;

					if (linea != null) {

						Coche coche = new Coche(linea,probabilidad);
						valor = matriculaV(coche);


						if (valor==7) {

							if (coche.discapacitado == false && !(hmap.containsValue(coche.matricula)) && !(hmap_d.containsValue(coche.matricula))) {

								System.out.println ("Introduiras aquesta matricula (" + coche.matricula +") al parking.");
								cocheNoDiscapacitado(coche);

							}

							else if (coche.discapacitado == true && !(hmap.containsValue(coche.matricula)) && !(hmap_d.containsValue(coche.matricula))) {

								System.out.println ("Introduiras aquesta matricula (" + coche.matricula +") al parking de discapacitats.");
								cocheDiscapacitado(coche);


							}

							else if ((hmap.containsValue(coche.matricula)) || (hmap_d.containsValue(coche.matricula))) {

								System.out.println ("El cotxe ja està al parking. No pot entrar.");

							}
						}else {

							System.out.println ("ALERTA =====> Matrícula incorrecte");

						}	
					
					}}while (linea != null) ;
				
				num++;
				br.close();
				
			}catch(FileNotFoundException e) {	

				System.out.println ("ALERTA =====> Fitxer incorrecte o inexistent.");
				Scanner teclado = new Scanner(System.in);
				System.out.println ("La ruta ha fallat, posala de nou:");
				scanner = teclado.next();

			}
			
		}while(num != 1);
		

		}

	// Los metodos de introducir los coches manualmente.
	
	public int entraCotxe(String matricula)throws Exception{

		// Es exactamente igual que el de leer matriculas, pero en este caso para una en concreto.
		
		int valor = 0;
		int posicion = 0;
		Coche coche = new Coche(matricula,5);
		valor = matriculaV(coche);


		if (valor==7) {

			if (coche.discapacitado == false && !(hmap.containsValue(coche.matricula)) && 
					!(hmap_d.containsValue(coche.matricula))) {

				System.out.println ("Introduiras aquesta matricula (" + coche.matricula +") al parking.");
				cocheNoDiscapacitado(coche);
				posicion = coche.posicion;
			}

			else if ((hmap.containsValue(coche.matricula)) || (hmap_d.containsValue(coche.matricula))) {

				System.out.println ("El cotxe ja està al parking. No pot entrar.");

			}
		}else {

			System.out.println ("ALERTA =====> Matrícula incorrecte");

		}			
		
		return posicion;
	}

	public int entraCotxeDiscapacitat(String matricula)throws Exception{

	// Igual pero para discapacitados.
		
		int valor = 0;
		int posicion= 0;
		Coche coche = new Coche(matricula,1);
		valor = matriculaV(coche);


		if (valor==7) {

			if (coche.discapacitado == true && !(hmap.containsValue(coche.matricula)) && 
					!(hmap_d.containsValue(coche.matricula))) {

				System.out.println ("Introduiras aquesta matricula (" + coche.matricula +") al parking de discapacitats.");
				cocheDiscapacitado(coche);
				posicion = coche.posicion;
			}

			else if ((hmap.containsValue(coche.matricula)) || (hmap_d.containsValue(coche.matricula))) {

				System.out.println ("El cotxe ja està al parking. No pot entrar.");

			}
		}else {

			System.out.println ("ALERTA =====> Matrícula incorrecte");

		}			

		return posicion;
	}

	
	
	// Dos metodos simples para sacar los coches, depende de que tipo sean, miro si esta el valor en el hashmap y simplemente lo elimino de su id.
	
	public void surtCotxe(String matricula)throws Exception{

		if (hmap.containsValue(matricula)) {

			for (int i = 1; i<=plaza; i++) {

				if (hmap.get(i).equals(matricula)) {
					hmap.remove(i);
					System.out.println("Ha sortit de la posicio: "+ i + " la matricula: " + matricula);
					i = plaza +1;
				}
			}
		}
		else {
			System.out.println("La matricula no està en el parking");
		}
	}

	public void surtCotxeDiscapacitats(String matricula)throws Exception{

		if (hmap_d.containsValue(matricula)) {

			for (int i = 1; i<=plaza_d; i++) {

				if (hmap_d.get(i).equals(matricula)) {
					hmap_d.remove(i);
					System.out.println("Ha sortit de la posicio: "+ i + " la matricula: " + matricula);
					i = plaza_d + 1;
				}
			}
		}
		else {
			System.out.println("La matricula no està en el parking");
		}
	
		
		
		
	}

	
	// No los he usado los enum, pero los he dejado operativos por si alguien los usa. Son mis contadores del otro 
	// metodo, pero indicandoles por el enum, el tipo.

	public int getPlacesOcupades(TipusPlacesParking tipus)throws Exception{


		int n = 0;

		if (tipus.equals(TipusPlacesParking.Discapacitat)) {

			for(int i= 1; i<= plaza; i++) {

				if(!(hmap.get(i) == null)) {

					n++;

				}}}

		if (tipus.equals(TipusPlacesParking.No_Discapacitat)) {

			for(int i= 1; i<= plaza_d; i++) {

				if(!(hmap_d.get(i) == null)) {

					n++;

				}}


		}


		return n;


	}

	public int getPlacesLliures(TipusPlacesParking tipus)throws Exception{	

		int n = 0;

		if (tipus.equals(TipusPlacesParking.Discapacitat)) {

			for(int i= 1; i<= plaza; i++) {

				if(hmap.get(i) == null) {

					n++;

				}}}

		if (tipus.equals(TipusPlacesParking.No_Discapacitat)) {

			for(int i= 1; i<= plaza_d; i++) {

				if(hmap_d.get(i) == null) {

					n++;

				}}


		}


		return n;
	}

	
	// Finalmente, este metodo sirve para calcar a un archivo, todas las matriculas que tenemos mediante un for y un if.
	
	public void guardarMatricules(String path)throws Exception{

		BufferedWriter bw = new BufferedWriter (new FileWriter(path));	
		String matricula = "";
		
		for (int i=1;i<=plaza;i++) {
			if(!(hmap.get(i) == null)) {
			matricula = hmap.get(i);
			bw.write(matricula + "\n");
		

		}}
		
		for (int i=1;i<=plaza_d;i++) {
			if(!(hmap_d.get(i) == null)) {
			matricula = hmap_d.get(i);
			bw.write(matricula + "\n");
			

		}}
		
		bw.close();
		
	}
	
}
