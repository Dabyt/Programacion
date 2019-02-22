package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PRU05E01e1_David_Sanchez {
	
	// Creo las variables del SQL.
	
	    private Connection conectar = null;
	    private Statement consulta = null;
	    private ResultSet resultado = null;
	  
	//  Aqui hago el metodo de conexion con la base de datos, la consulta, y se lo paso al siguiente
	//	método para que haga las operaciones.
	    
	// ANOTACIÓN: Hay que ejecutar el set global para que funcione.
	    
	    public  void leerBasededatos() throws Exception {
	        
	    	try {
	    		
	    	
	    		conectar = DriverManager.getConnection("jdbc:mysql://localhost/employees?" + "user=root&password=cide1234");

	    		consulta = conectar.createStatement();
	    
	    		consulta.executeQuery("SET GLOBAL time_zone = '+1:00'");
	                
	    		resultado = consulta.executeQuery("SELECT * FROM employees.departments");
	           
	    		writeResultSet(resultado);

	    		} catch (Exception e) {
	    			throw e;
	    		} finally {
	    			close();
	    		}} 
	    
	    // Me lee linea por linea sobre la consulta anterior y me lo imprime como yo le pido.
	    
	    private void writeResultSet(ResultSet resultado) throws SQLException {
	        
	 	
	        while (resultado.next()) {
	          
	        
	            String nombre = resultado.getString("dept_no");
	            String apellido = resultado.getString("dept_name");
	           
	            System.out.println("Id departamento: " + nombre);
	            System.out.println("Nombre departamento:  " + apellido);
	            System.out.println("================================================================");
	           
	        }
	    }
	    
	    // Cierro todas las variables de sql cuando ya no tienen nada.
	    
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
	            
	        } catch (Exception e) {

	        }
	    }
	
public static void main(String[] args) throws Exception {

	// Invoco mi clase.
	
	PRU05E01e1_David_Sanchez basededatos = new PRU05E01e1_David_Sanchez();
    basededatos.leerBasededatos();	
   
}

}
