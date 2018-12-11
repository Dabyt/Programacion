package Obj;

import java.util.Scanner;

public class CavallStatic {

	public static String Dueño = "Manolo";
	
	
	public void AñadirDueño(String h){
		Dueño = h;
	}

	

	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);
		String x;
		CavallStatic cavall1 = new CavallStatic();
		CavallStatic cavall2 = new CavallStatic();
		
		
		System.out.println("El dueño del caballo 1 ahora mismo es de " + cavall1.Dueño);	
		System.out.println("El dueño del caballo 2 ahora mismo es de " + cavall2.Dueño);
		System.out.println("¿Quien es el dueño de los nuevos caballos? ");
		x = teclado.nextLine();
		cavall1.AñadirDueño(x);
		System.out.println("El dueño del primer caballo ha cambiado a " + cavall1.Dueño);
		System.out.println("El dueño del segundo caballo ha cambiado a " + cavall2.Dueño);
		
		
	}}

