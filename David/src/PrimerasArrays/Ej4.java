/*
Defina tres matrices de 20 enteros cada una, con los nombres número, cuadrado y cubo. Cargue el número de matriz con valores aleatorios entre 0 y 100. En la matriz cuadrada deben almacenarse los cuadrados de los valores en el número de matriz. En la matriz de cubos, deben almacenarse los cubos de los valores que están en número. A continuación, muestra el contenido de las tres matrices dispuestas en tres columnas.*/

package PrimerasArrays;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		int[] normal = new int [20];
		int[] cuadrado = new int [20];
		int[] cubo = new int [20];

		Scanner teclado = new Scanner(System.in);

		for (int i=0; i<normal.length;i++) {

			normal[i] = (int)(Math.random()*100);

			cuadrado[i] = (int)Math.pow(normal[i],2);

			cubo[i] = (int)Math.pow(normal[i],3);

			System.out.println (normal[i] + "\t" + cuadrado [i] + "\t" + cubo [i]);


		}


	}}
