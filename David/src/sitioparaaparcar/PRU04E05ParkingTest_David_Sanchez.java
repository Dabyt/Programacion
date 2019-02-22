package sitioparaaparcar;

import java.util.Scanner;


public class PRU04E05ParkingTest_David_Sanchez {


	public static void main(String[] args) throws Exception {
	
	
		// Declaracion de variables, el scanner, la clase, etc.
		
		PRU04E05Parking_David_Sanchez test = new PRU04E05Parking_David_Sanchez(100,5);
		int menu;
		int n= 0;
		Scanner teclado = new Scanner(System.in);
		Scanner m = new Scanner(System.in);	
		String matricula = "";

		
		// Un menu simple, mediante un do while llamando a los metodos.
		
		do {

			System.out.println ("1- Omplir parking a partir de fitxer.");
			System.out.println ("2- Entrar Cotxe. ");
			System.out.println ("3- Entrar Cotxe Discapacitat.");
			System.out.println ("4- Surtir Cotxe.");
			System.out.println ("5- Surtir Cotxe Discapacitat.");
			System.out.println ("6- Guardar llistat de matricules en fitxer.");
			System.out.println ("7- Sortir.");

			menu = teclado.nextInt();

			if (menu==1) {

				System.out.println ("Cotxes ficats:  ");
				test.llegirMatricules(args[0]);

			}
			else if (menu==2) {

				System.out.println ("Indica sa matricula: ");
				matricula = m.next();
				test.entraCotxe(matricula);

			}
			else if (menu==3) {

				System.out.println ("Indica sa matricula: ");
				matricula = m.next();
				test.entraCotxeDiscapacitat(matricula);

			}
			else if (menu==4) {
			
				System.out.println ("Indica sa matricula: ");
				matricula = m.next();
				test.surtCotxe(matricula);

			}
			else if (menu==5) {
				
				System.out.println ("Indica sa matricula: ");
				matricula = m.next();
				test.surtCotxeDiscapacitats(matricula);
			}
			else if (menu==6) {
				
				System.out.println ("Cotxes guardats.");
				test.guardarMatricules(args[0]);
			}
			else if (menu==7) {
	
				n++;
				
			}
			
			else{
				System.out.println("¡Eso no está en el menu! Intentalo otra vez...");  
			}
			}while (n<=0);
			
		}}


