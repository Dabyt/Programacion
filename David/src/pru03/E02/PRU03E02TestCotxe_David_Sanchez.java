package pru03.E02;

import java.util.Scanner;

public class PRU03E02TestCotxe_David_Sanchez {

	public static void main (String[] args) throws Exception {

		PRU03E02Cotxe_David_Sanchez micoche = new PRU03E02Cotxe_David_Sanchez("Citroen", "Renault", TipusCanvi.CanviManual);	
		int menu;
		int n= 0;
		Scanner teclado = new Scanner(System.in);	          

		do {

			System.out.println ("1- Arrancar coche.");
			System.out.println ("2- Estado del motor. ");
			System.out.println ("3- Revoluciones del coche.");
			System.out.println ("4- Cambiar marchas.");
			System.out.println ("5- Apagar coche..");

			menu = teclado.nextInt();

			if (menu==1) {

				micoche.arrancarMotor();

			}
			else if (menu==2) {

				System.out.println(micoche.comprovaMotor()); 

			}
			else if (menu==3) {

				System.out.println("Tus revoluciones son " + micoche.getRevolucions()); 

			}
			else if (menu==4) {
				
				
				
				if (micoche.tipuscanvi.equals(TipusCanvi.CanviAutomatic)) {
					micoche.CanviarMarxaAutomatic();
				}
				
				else if (micoche.tipuscanvi.equals(TipusCanvi.CanviManual)) {
					micoche.CanviarMarxaManual();
					 
					}

			}
			else if (menu==5) {
				
				micoche.aturarMotor();
				System.out.println("Su coche se ha apagado, hasta la proxima."); 
				n++;
			}
			
			else{
				System.out.println("¡Eso no está en el menu! Intentalo otra vez...");  
			}
			}while (n<=0);
			
		}}
















	
	
	

