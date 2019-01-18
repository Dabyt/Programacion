

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;

public class PRU04_David_Sanchez {

	
	public static String pasarParaula (String linea, int pos_inicial, int pos_final) {
		
		String lineaEditada = "";
		
		for (int i=pos_inicial;i<pos_final;i++) {
			
			if (linea.charAt(i) != 32) {
				lineaEditada += linea.charAt(i);	
			}}
		
		lineaEditada += ";";
		
		return lineaEditada;
	}
	
	public static void main(String[] args) {
		
		try{

			BufferedReader br = new	BufferedReader (new FileReader(args[0]));
			BufferedWriter bw = new	BufferedWriter (new FileWriter(args[1]));

			//ArrayList<String> lineacompleta = new ArrayList<String>();
			//String[] linea;
			String variable = "";
			String linealeida = "";
		
			do {
				
				linealeida = br.readLine();
				
				if (linealeida !=null) {
					
				variable += pasarParaula(linealeida,0,5);	
				variable += pasarParaula(linealeida,6,15);
				variable += pasarParaula(linealeida,16,26);
				variable += pasarParaula(linealeida,27,40);
				variable += pasarParaula(linealeida,41,47);
				variable += pasarParaula(linealeida,48,57);
				
				bw.write(variable + "\n");
				}
					
			}while(linealeida !=null);
					
			br.close();
			bw.close();
		
		}catch(IOException e) {
		
		}}}
