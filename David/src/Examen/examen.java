package Examen;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import Examen.SyncSafe.Convertion;

public class examen extends SyncSafe{
	
	
	public static void main(String[] args) {
	
		
	try {
	
	// Creo el datainput para coger el archivo y el file para poder manipularlo a su vez.	
		
	DataInputStream cogerarchivo = new DataInputStream ( new FileInputStream("C:\\Temp\\PR2AVAEX02.mp3"));	
	File archivo = new File("C:\\Temp\\PR2AVAEX02.mp3");	
	
	// Creo mis variables y mis arrays
	
	long variable = archivo.length();
	byte[] nn= new byte [(int) variable];
	int n = 0;
	String f = "";
	
	// Leo el archivo y lo voy pasando por bytes a una array de bytes
	
	cogerarchivo.read(nn);

	// Creo un for para que de la posicion del nombre del album, al final pueda manipular su contenido.
	
	for (int i=43;i<=61;i++) {
	
	// Veo que valor da esa posicion en byte pasado a decimal, y descodificandolo.
		
	System.out.print(nn[i] + " ");
	System.out.print(Decode(nn[i]));
	
	// Voy concatenando esos bytes en un string y lo voy imprimiendo para ver que da.
	
	f += nn[i];
	
	System.out.print(" " + f);
	
	System.out.println("\n");

	
	}
	}catch(IOException e) {
		
	}
	}
}
