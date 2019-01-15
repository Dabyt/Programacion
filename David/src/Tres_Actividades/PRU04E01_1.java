package Tres_Actividades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;

public class PRU04E01_1 {

	public static void main(String[] args) {

		try{

			BufferedReader bf = new	BufferedReader (new FileReader(args[0]));
			BufferedWriter bw = new	BufferedWriter (new FileWriter(args[0] + "sort.txt"));

			ArrayList<String> linea = new ArrayList<String>();
			String linealeida = "";

			do {			

				linealeida = bf.readLine();
				
				if (linealeida != null) {
					linea.add(linealeida);
					//System.out.println(linealeida);
					}
				
			}while (linealeida != null);

			//System.out.println(linea.size());
			
			for (int i=0; i<linea.size();i++) {
				System.out.println(linea.get(i));
			}
			
			System.out.println("-------------------------------------------------");
			Collections.sort(linea);

			for (int i=0; i<linea.size();i++) {
				System.out.println(linea.get(i));
				bw.write(linea.get(i) + "\n");

			}

			bf.close();
			bw.close();
			// https://jarroba.com/arraylist-en-java-ejemplos/
		}catch(IOException e) {

		}}}
