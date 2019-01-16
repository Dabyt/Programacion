

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;

public class PRU04E01_2 {

	public static void main(String[] args) {
	
		try{

			BufferedReader br = new	BufferedReader (new FileReader(args[0]));
			BufferedWriter bw = new	BufferedWriter (new FileWriter(args[1]));

			ArrayList<String> linea = new ArrayList<String>();
			String linealeida = "";
			int n=0;
			
			do {			

				linealeida = br.readLine();
				
				if (linealeida != null && !linealeida.contains("//")){
					
					linea.add(linealeida);
					n=0;
				}
				
				else if(linealeida == null){
						
						
					linealeida = "\n";
					linea.add(linealeida);
					n++;
							
					
					
				}
				else if(linealeida.contains("//")) {
					
					linealeida = "";
					linea.add(linealeida);
					n=0;
					}
				
			}while (n<=5);
			
			for (int i=0; i<linea.size();i++) {
				
				bw.write(linea.get(i) + "\n");

			}
				
			br.close();
			bw.close();
		
		}catch(IOException e) {

		}}}	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
