package LecturaEscritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class Impares {

	public static void main(String[] args) {
	
		try {
		
		BufferedWriter bw = new	BufferedWriter (new FileWriter("impares.dat"));
		
		
		
		
		bw.write("hola");;
		bw.close();
		
		}
		catch{
			
			
			
		}
		
		
		
		
		
		
		
	}

}
