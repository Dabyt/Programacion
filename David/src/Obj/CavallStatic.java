package Obj;

import java.util.Scanner;

public class CavallStatic {

	public static String Due�o = "Manolo";
	
	
	public void A�adirDue�o(String h){
		Due�o = h;
	}

	

	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);
		String x;
		CavallStatic cavall1 = new CavallStatic();
		CavallStatic cavall2 = new CavallStatic();
		
		
		System.out.println("El due�o del caballo 1 ahora mismo es de " + cavall1.Due�o);	
		System.out.println("El due�o del caballo 2 ahora mismo es de " + cavall2.Due�o);
		System.out.println("�Quien es el due�o de los nuevos caballos? ");
		x = teclado.nextLine();
		cavall1.A�adirDue�o(x);
		System.out.println("El due�o del primer caballo ha cambiado a " + cavall1.Due�o);
		System.out.println("El due�o del segundo caballo ha cambiado a " + cavall2.Due�o);
		
		
	}}

