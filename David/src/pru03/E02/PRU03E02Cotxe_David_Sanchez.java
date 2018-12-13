package pru03.E02;

public class PRU03E02Cotxe_David_Sanchez extends CotxeAbstracte implements InterfaceCotxe{
	
	protected EstatsMotorCotxe estatsmotor = EstatsMotorCotxe.Aturat;
	
	public PRU03E02Cotxe_David_Sanchez(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estat) {
		super(marca, model, tipuscanvi);
		this.marca = marca;
		
	}

	@Override
	public void arrancarMotor() throws Exception {
		
	if (estatsmotor.equals(EstatsMotorCotxe.Aturat)) {
		
		estatsmotor = EstatsMotorCotxe.EnMarxa;
		
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
}
