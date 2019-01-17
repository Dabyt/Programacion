package PRU04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PRU04_David_Sanchez {

	
	public String pasarParaula (String linea, int pos_inicial, int pos_final) {
		
		String lineaEditada = "";
		
		for (int i=0;i<linealeida.length();i++) {
			
			if (linealeida.charAt(i) == 32) {
				
				
				
			}
				
				
			}
		
		
		
		return lineaEditada;
	}
	
	public static void main(String[] args) {
		
		try{

			BufferedReader br = new	BufferedReader (new FileReader(args[0]));
			BufferedWriter bw = new	BufferedWriter (new FileWriter(args[1]));

			ArrayList<String> lineacompleta = new ArrayList<String>();
			String[] linea;
			String linealeida = "";
			int posicion_a = 0;
			int posicion_b = 0;
			int posicion_c = 0;
			int posicion_d = 0;
			int n=0;
			
			
			do {
				
				linealeida = br.readLine();
				
				if (linealeida !=null) {
					
				
					
					
				}
				
				
				
			}while(linealeida !=null);
					
			br.close();
			bw.close();
		
		}catch(IOException e) {
		
		}}}
