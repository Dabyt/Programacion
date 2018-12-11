package Obj;

import java.util.Scanner;

public class Cavall {

	public String color;
	public int edad;
	public int peso;

	public void setEdad(int e){
		edad = e;
	}

	public int getEdad(){
		return edad;
	}

	public void devolver(int d){
		peso = d;
	}

	public void setColor(String h){
		color = h;
	}


	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x;
		int y;
		String z;
		Cavall cavall1 = new Cavall();

		System.out.println("Vamos a crear tu caballo:");
		System.out.println ("¿La edad del caballo es?");
		y = teclado.nextInt();
		cavall1.setEdad(y);
		System.out.println("¿Cuanto pesa el gordo de tu caballo? ");
		x = teclado.nextInt();
		cavall1.devolver(x);
		System.out.println("¿Cual es el color de tu caballo?");
		teclado.nextLine();
		z = teclado.nextLine();
		cavall1.setColor(z);

		System.out.println("Tu caballo es de color " + cavall1.color + ", pesa " + cavall1.peso + "kg");
		System.out.println("y ha vivido de momento " + cavall1.getEdad() + " años.");	


	}}
