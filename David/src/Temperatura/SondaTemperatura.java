package Temperatura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SondaTemperatura extends Sonda{
	
	private Connection conectar = null;	
	private Statement consulta = null;
    private ResultSet resultado = null;
    private ResultSet index = null;

	private void conectarbdd() throws Exception {

	
       conectar = DriverManager.getConnection("jdbc:mysql://172.16.26.200/Temperatures?" + "user=alumne&password=tofol");
		
       
	}
	
	private static Date sacarFecha() {
		
	Date fecha = new Date();	
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				
	return fecha;
	}
	
	@SuppressWarnings("finally")
	@Override	
	public boolean enregistrarTemperatura (String ip, String ubicacio, double valor) {
		
		boolean falso = false;	
		
		try {
		
		conectarbdd();
		
		
		
			
		
		}catch(Exception e){
			
		throw e;
			
		}
		
		finally {
		close();
		return falso;	
		}
			
		}
		
	
	@SuppressWarnings("finally")
	@Override
	public double obtenirTemperatura(String ubicacio, Date data){
		
		double falso = 0;		
			
		try {
			
			conectarbdd();
			
			
			
				
			
			}catch(Exception e){
				
			throw e;
				
			}
			
			finally {
			close();
			return falso;
			}
		
		}
	
	
	private void close() {
        try {
            if (resultado != null) {
                resultado.close();
            }

            if (consulta != null) {
                consulta.close();
            }

            if (conectar != null) {
                conectar.close();
            }
            if (index != null) {
                index.close();
            }
        } catch (Exception e) {

        }
    }
	
	
	public static void main(String[] args) {
	
	Date fecha = new Date();
	String ubicacion = "Lalala";
	fecha = sacarFecha();	
	SondaTemperatura pene = new SondaTemperatura();
		
	pene.obtenirTemperatura(ubicacion,fecha);
		
		
		
		
	}

}
