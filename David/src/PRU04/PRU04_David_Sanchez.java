



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;

public class PRU04_David_Sanchez {

	/*	Aqui creo el método, en el cual le paso tres valores, la linea leida, y las dos posiciones.
	 * 	Hago un for en el cual lo igualo a las posiciones que le paso, de esa forma, puedo leer 
	 *	la posicion de la linea a a la vez que el for solo dura de dicha posicion a la posicion final.
	 * 	Ahora miro que no sea un espacio, y voy concatenando un string letra por letra. Si es espacio, no hace nada.
	 * Finalmente pongo un ; y devuelvo la variable.
	 */

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

			String variable = "";
			String linealeida = "";

			do {

				// Leo la linea, y la pongo en una variable.

				linealeida = br.readLine();

				// Dicha linea si no es null, me hace la secuencia de métodos, y 
				// me va concatenando todo en una variable, con la variable que me devuelve el metodo.

				if (linealeida !=null) {

					variable += pasarParaula(linealeida,0,5);	
					variable += pasarParaula(linealeida,6,15);
					variable += pasarParaula(linealeida,16,26);
					variable += pasarParaula(linealeida,27,40);
					variable += pasarParaula(linealeida,41,47);
					variable += pasarParaula(linealeida,48,57);


					// Lo escribo, y vacío la variable.

					bw.write(variable + "\n");
					variable = "";
				}

			}while(linealeida !=null);

			br.close();
			bw.close();

		}catch(IOException e) {

		}}}
