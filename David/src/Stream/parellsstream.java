package Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;


public class parellsstream {

	public static void main(String[] args) {
	
		try {

			InputStream is = new FileInputStream("C:\\David Sanchez\\pares.dat");
			int linea = 0;
			int lineamas = 0;
			int PedazoLinea [];

			for (int i=0; i<=500;i= i + 2) {
				
				linea = is.read();
				if (linea==10) {
				System.out.println (lineamas);
				lineamas = 0;
				}
				else {
					PedazoLinea = lineamas;
					
				}
			}

		

		}catch(IOException e) {

			System.out.println ("Ha habido un error");
			
		}}		
	
		

		

	}

