package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PRU05E01e2_David_Sanchez2 {

	// Creo las variables del SQL.
	
	    private Connection conectar = null;
	    private Statement consulta = null;
	    private Statement introducir = null;
	    private ResultSet resultado = null;
	    
	//  Aqui hago el metodo de conexion con la base de datos, la consulta, y se lo paso al siguiente
	//	método para que haga las operaciones. En este caso le paso un parametro por argumentos.
		    
	// ANOTACIÓN: Hay que ejecutar el set global para que funcione.
	    
	    
	    public void leerBasededatos(String args) throws Exception {
	        
	    	try {
	    		
	    		//consulta.executeQuery("SET GLOBAL time_zone = '+1:00'");
	    		
	    		conectar = DriverManager.getConnection("jdbc:mysql://localhost/employees?" + "user=root&password=cide1234");

	    		consulta = conectar.createStatement();
	    
	    		resultado = consulta.executeQuery("SELECT * FROM departments");
	           
	    		writeResultSet(resultado,args);

	    		} catch (Exception e) {
	    			throw e;
	    		} finally {
	    			close();
	    		}} 
	    
	 // Me lee linea por linea sobre la consulta anterior y me lo imprime como yo le pido. Además, pide la renombración
	 // de el argumento que le hayas pasado.
	    
	    private void writeResultSet(ResultSet resultado, String args) throws SQLException {
	        
	    	String nom_dept = "";
	    	Scanner sc = new Scanner(System.in); 
	    	
	        while (resultado.next()) { 
	          
	            String n_dept = resultado.getString("dept_no");
	            System.out.println("Id departamento: " + n_dept);
	            
	            if (n_dept.equals(args)) {
	            		
	            		String numero = args;
	            		System.out.println(numero);
	          
	            		nom_dept = resultado.getString("dept_name");
	            		System.out.println("Este es el nombre de departamento: " + nom_dept);
	            		System.out.println("Que nombre de departamento le quieres asignar?");
	            		nom_dept = sc.next();
	            		System.out.println(numero);
	            		introducir = conectar.createStatement();
	            		introducir.execute("DELETE FROM departments WHERE dept_no = '" + numero + "'");
	            		introducir = conectar.createStatement();
	            		introducir.execute("insert into departments values ('"+numero+"','"+nom_dept+"')");
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
	            if (introducir != null) {
	                introducir.close();
	            }
	            
	        } catch (Exception e) {

	        }
	    }
	
public static void main(String[] args) throws Exception {

	// Invoco mi clase pasandole el arg.
	
	PRU05E01e2_David_Sanchez2 basededatos = new PRU05E01e2_David_Sanchez2();
    basededatos.leerBasededatos(args[0]);	
   
}

}
