package LecturaEscritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Tots {

	public static void main(String[] args) {

		try {

			BufferedReader bfp = new	BufferedReader (new FileReader("C:\\David Sanchez\\pares.dat"));
			BufferedReader bfi = new	BufferedReader (new FileReader("C:\\David Sanchez\\impares.dat"));
			BufferedWriter bwt = new	BufferedWriter (new FileWriter("C:\\David Sanchez\\tots.dat"));
			String linea = "";
			String lineados = "";


			while (linea != null) {

				linea = bfp.readLine();

				if (linea != null) {

					bwt.write(linea + "\n");

					System.out.println (linea);

				}

				lineados = bfi.readLine();

				if (lineados != null) {

					bwt.write(lineados + "\n");

					System.out.println (lineados);

				}

			}

			bfp.close();
			bfi.close();
			bwt.close();

		}catch(IOException e) {

		}}		
}

