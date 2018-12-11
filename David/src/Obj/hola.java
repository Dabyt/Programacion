package Obj;

import java.util.Scanner;

public class hola {

	public static int factorial (int n) {
		int posicion;
		posicion = n;

		if (n==0) {	
			n= 1;	
		}

		else if (n<0) {
			System.out.println ("Error, es negativo el numero");
		}

		while ( posicion>1) {

			n = n*(posicion-1);
			posicion--; 
		}
		return n;
		
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n;
		int k;
		
		
		do {
		System.out.println ("Introduce n: ");
		n = teclado.nextInt();
		factorial(n);
		}while (n<=0);
			
		System.out.println (factorial(n)); 
		
		do {
			System.out.println ("Introduce K: ");
			k = teclado.nextInt();
			factorial(k);
			}while (k<=0);	
			
		System.out.println (factorial(k));

	}

}
