

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

public class PRU04E01_3 {

	public static void main(String[] args) {

		try{

			BufferedReader br_documento = new BufferedReader (new FileReader(args[0]));


			String[] linea;
			String linealeida = "";
			String palabra = args[1];
			int c_palabras=0;
			int i=0;
			int p=0;

			do {			

				linealeida = br_documento.readLine();

				if (linealeida != null) {

					linea = linealeida.split(" ");

					for(i=0;i<linea.length;i++) {

						if (linea[i].equals(palabra) && linea[i]!=null) {
							c_palabras++;
					}}}

					if (linealeida == null) {
					p++;
					}

			}while (p!=5);


			System.out.println("Ha salido " + c_palabras + " veces la palabra " + palabra + ".");

			br_documento.close();


		}catch(IOException e) {

		}}}






		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

