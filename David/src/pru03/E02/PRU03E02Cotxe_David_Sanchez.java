package pru03.E02;

public class PRU03E02Cotxe_David_Sanchez extends CotxeAbstracte implements InterfaceCotxe{
	
	protected EstatsMotorCotxe estatsmotor = EstatsMotorCotxe.Aturat;
	
	public PRU03E02Cotxe_David_Sanchez(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
		// TODO Auto-generated constructor stub
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
		
		
		return null;
	}

	@Override
	public int getRevolucions() {
		
		return 0;
	}

	@Override
	public void aturarMotor() throws Exception {
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
