package pru03.E02;

import java.util.Scanner;

public class PRU03E02Cotxe_David_Sanchez extends CotxeAbstracte implements InterfaceCotxe{

	protected EstatsMotorCotxe estatsmotor;

	protected String auto[] = {"F","N","R"};

	protected int manual[] = {0,1,2,3,4,5,6};

	
	
	public PRU03E02Cotxe_David_Sanchez(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
		this.marca = marca;
		this.model = model;
		this.tipuscanvi = tipuscanvi;
		this.estatsmotor = EstatsMotorCotxe.Aturat;

	}

	@Override
	public void arrancarMotor() throws Exception {

		if (estatsmotor.equals(EstatsMotorCotxe.Aturat)) {

			estatsmotor = EstatsMotorCotxe.EnMarxa;
			System.out.println ("Coche en marcha.");

		} else { 

			throw new IllegalArgumentException ("El coche ya esta encendido.");

		}	
	}

	@Override 
	public EstatsMotorCotxe comprovaMotor() {

		return estatsmotor;
	}

	@Override
	public int getRevolucions() {

		int revoluciones = 1;

		if (estatsmotor.equals(EstatsMotorCotxe.EnMarxa)) {
			revoluciones = (int) (Math.random()*6500);
		}
		else if (estatsmotor.equals(EstatsMotorCotxe.EnMarxa)) {

			revoluciones = 0;
		}	

		return revoluciones;
	}

	@Override
	public void aturarMotor() throws Exception {

		if (estatsmotor.equals(EstatsMotorCotxe.EnMarxa)) {

			estatsmotor = EstatsMotorCotxe.Aturat;

		} else {

			throw new IllegalArgumentException ("El coche ya esta apagado.");		
		}		
	}

	public void CanviarMarxaAutomatic() throws Exception {

		int menuu;
		int nn= 0;
		String valor = "N";
		Scanner teclado = new Scanner(System.in);	


		if (this.tipuscanvi.equals(TipusCanvi.CanviAutomatic)) {

			do {

				System.out.println ("1- Cambiar a neutra");
				System.out.println ("2- Cambiar a reverse");
				System.out.println ("3- Cambiar forward");
				System.out.println ("4- Marchas cambiadas.");

				menuu = teclado.nextInt();

				if (menuu==1) {

					valor = auto[1];
					System.out.println ("Has cambiado a la marcha " + valor);

				}
				else if (menuu==2) {

					valor = auto[2];
					System.out.println ("Has cambiado a la marcha " + valor);

				}
				else if (menuu==3) {

					valor = auto[0];
					System.out.println ("Has cambiado a la marcha " + valor);

				}
				else if (menuu==4) {


					System.out.println("Te habras quedado en modo" + valor); 
					nn++;
				}

				else{

					System.out.println("¡Eso no está en el menu! Intentalo otra vez...");  
				}
			}while (nn<=0);


		} else { 

			throw new IllegalArgumentException ("El coche es manual, no puedes cambiar marchas automaticas.");

		}	
	}



	public void CanviarMarxaManual() throws Exception {

	
			int menuu;
			int nn= 0;
			int x = 1;
			String valor = "N";
			Scanner teclado = new Scanner(System.in);	


			if (this.tipuscanvi.equals(TipusCanvi.CanviManual)) {
				
				
	
				do {

					System.out.println ("1- Subir marcha.");
					System.out.println ("2- Bajar marcha.");
					System.out.println ("3- Marchas cambiadas.");
				
					menuu = teclado.nextInt();
					
					if (menuu==1) {

						if (x < 6 && x >=0) {
						
						x++;
						
						
						if (x==1) {
							System.out.println ("Has subido de marcha");
							System.out.println ("Estas en primera");
						}
						if (x==2) {
							System.out.println ("Has subido de marcha");
							System.out.println ("Estas en segunda");
						}
						if (x==3) {
							System.out.println ("Has subido de marcha");
							System.out.println ("Estas en tercera");
						}
						if (x==4) {
							System.out.println ("Has subido de marcha");
							System.out.println ("Estas en cuarta");
						}
						if (x==5) {
							System.out.println ("Has subido de marcha");
							System.out.println ("Estas en quinta");
						}
						if (x==6) {
							System.out.println ("Has subido de marcha");
							System.out.println ("Estas en sexta");
						}
						}
						else {
							System.out.println ("No puedes subir más.");
							System.out.println ("Estas en sexta");
						}

					}
					else if (menuu==2) {

						if (x<=6 && x>0) {
							
							x--;
							
							if (x==0) {
								System.out.println("Has bajado de marcha.");
								System.out.println ("Estas marcha atrás.");
							}
							if (x==1) {
								System.out.println("Has bajado de marcha.");
								System.out.println ("Estas en primera");
							}
							if (x==2) {
								System.out.println("Has bajado de marcha.");
								System.out.println ("Estas en segunda");
							}
							if (x==3) {
								System.out.println("Has bajado de marcha.");
								System.out.println ("Estas en tercera");
							}
							if (x==4) {
								System.out.println("Has bajado de marcha.");
								System.out.println ("Estas en cuarta");
							}
							if (x==5) {
								System.out.println("Has bajado de marcha.");
								System.out.println ("Estas en quinta");
							}
							
							}
							else {
								System.out.println ("No puedes bajar más, ya estás en marcha atrás.");
							}
							}
					
						else if (menuu==3) {

						valor = auto[0];
						nn++;
						System.out.print("Te habras quedado en la marcha"); 
						
						if (x==0) {							
							System.out.println (" R");
						}
						if (x==1) {							
							System.out.println (" primera");
						}
						if (x==2) {							
							System.out.println (" segunda");
						}
						if (x==3) {							
							System.out.println (" tercera");
						}
						if (x==4) {						
							System.out.println (" cuarta");
						}
						if (x==5) {
							System.out.println (" quinta");
						}
						if (x==6) {						
							System.out.println (" sexta");
						}

					}
					
					else{

						System.out.println("¡Eso no está en el menu! Intentalo otra vez...");  
					}
				}while (nn<=0);


			} else { 

				throw new IllegalArgumentException ("El coche es automatico, no puedes cambiar marchas manuales.");

			}}}
