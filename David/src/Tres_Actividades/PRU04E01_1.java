package Tres_Actividades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class PRU04E01_1 {

	public static void main(String[] args) {
		
		try{

			BufferedReader bf = new	BufferedReader (new FileReader(args[0]));
			BufferedWriter bw = new	BufferedWriter (new FileWriter(args[0] + "sort.txt"));
			
			ArrayList<String> linea = new ArrayList<String>();
			String linealeida = "";
			int n = 0;
			
			while (linea != null) {

				linealeida = bf.readLine();
				linea.add(n, linealeida);

				if (linea != null) {

					bw.write(linea + "\n");

					System.out.println (linea);

				}}

			

			
			
			
		}catch(IOException e) {

		}	

	
		
		
		
		
		
		
		

	}

}
