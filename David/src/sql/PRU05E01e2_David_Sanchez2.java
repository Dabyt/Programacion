package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PRU05E01e2_David_Sanchez2 {

	    private Connection conectar = null;
	    private Statement consulta = null;
	    private Statement introducir = null;
	    private ResultSet resultado = null;
	    
	  
	    public void leerBasededatos(String args) throws Exception {
	        
	    	try {
	    		
	    	
	    		conectar = DriverManager.getConnection("jdbc:mysql://localhost/employees?" + "user=root&password=cide1234");

	    		consulta = conectar.createStatement();
	    
	    		consulta.executeQuery("SET GLOBAL time_zone = '+1:00'");
	                
	    		resultado = consulta.executeQuery("SELECT * FROM departments");
	           
	    		writeResultSet(resultado,args);

	    		} catch (Exception e) {
	    			throw e;
	    		} finally {
	    			close();
	    		}} 
	    
	    private void writeResultSet(ResultSet resultado, String args) throws SQLException {
	        
	    	String nom_dept = "";
	    	Scanner sc = new Scanner(System.in); 
	    	
	        while (resultado.next()) { 
	          
	            String n_dept = resultado.getString("dept_no");
	            System.out.println("Id departamento: " + n_dept);
	            
	            if (n_dept.equals(args)) {
	            		
	            		String numero = args;
	            		nom_dept = resultado.getString("dept_name");
	            		System.out.println("Este es el nombre de departamento: " + nom_dept);
	            		System.out.println("Que nombre de partamento le quieres asignar?");
	            		nom_dept = sc.next();
	            		introducir.execute("DELETE FROM departments WHERE dept_no = '" + numero + "'");
	            		introducir.execute("insert into departments values ('"+numero+"','"+ nom_dept+"')");
	            		System.out.println("Nuevo nombre de departamento:  " + nom_dept);
	     	            System.out.println("================================================================");
	            		
	            	}
	            
	            else {
	            		 nom_dept = resultado.getString("dept_name");
	            		 System.out.println("Nombre departamento:  " + nom_dept);
	     	             System.out.println("================================================================");
	             
	            }
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
	            if (introducir != null) {
	                introducir.close();
	            }
	            
	        } catch (Exception e) {

	        }
	    }
	
public static void main(String[] args) throws Exception {

	PRU05E01e2_David_Sanchez2 basededatos = new PRU05E01e2_David_Sanchez2();
    basededatos.leerBasededatos(args[0]);	
   
}

}
