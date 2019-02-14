package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Sql_prueba {

    private Connection conectar = null;
    private Statement consulta = null;
    private ResultSet resultado = null;
    private ResultSet index = null;

    public void leerBasededatos() throws Exception {
        
    	try {

            conectar = DriverManager.getConnection("jdbc:mysql://localhost/employees?" + "user=root&password=cide1234");

            consulta = conectar.createStatement();
            
            index = consulta.executeQuery("select count(emp_no) as contador from employees;");
           
            resultado = consulta.executeQuery("select first_name as Nombre, last_name as Apellido from employees order by emp_no ASC limit 3");
           
            writeResultSet(index,resultado);

           
        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }


    private void writeResultSet(ResultSet index, ResultSet resultado) throws SQLException {
        
 	
        while (index.next()) {
          
        
            String nombre = resultado.getString("Nombre");
            String apellido = resultado.getString("Apellido");
            
            employees empleado = new employees();
            
            System.out.print("Nom: " + nombre);
            System.out.println(" Apellido: " + apellido);
            System.out.println("===================================");
           
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

    public void llenarMatriz() {
    	
    	
    	
    	
    	
    	
    	
    }
    
}