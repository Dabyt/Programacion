package LecturaEscritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pares {

	public static void main(String[] args) {

		try {

			BufferedWriter bw = new	BufferedWriter (new FileWriter("C:\\David Sanchez\\pares.dat"));

			for (int i=0; i<=500;i= i + 2) {

				System.out.println (i);
				bw.write(i + "\n");
			}

			bw.close();

		}catch(IOException e) {

		}}		

}


