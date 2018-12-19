package pru03.E02;

import java.util.Scanner;

public class PRU03E02Cotxe_David_Sanchez extends CotxeAbstracte implements InterfaceCotxe{

	protected EstatsMotorCotxe estatsmotor;

	protected String auto[] = {"F","N","R"};


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

		if (estatsmotor.equals(EstatsMotorCotxe.EnMarxa)) {

			estatsmotor = EstatsMotorCotxe.Aturat;

		} else {

			throw new IllegalArgumentException ("El coche ya esta apagado.");		
		}		
	}










}
