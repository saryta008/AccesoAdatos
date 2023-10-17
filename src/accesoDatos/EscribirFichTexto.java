package accesoDatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichTexto {
public static void main (String [] Args) throws IOException{
	File fichero = new File ("C:\\ejercicio\\archivo2.txt");
	
	//Crear un flujo de salida
	FileWriter fic = new FileWriter(fichero);
	
	//Convertir el String a un array de char
	String cadena = "Esto es un prueba con File writer";
	char [] cad = cadena.toCharArray();
	
	//Creamos un bucle para escribir mediante write en el fichero 
	for (int i=0; i<cad.length; i++) {
		fic.write(cad[i]);
	}
	
	fic.append('*');	//Es como la marca de fin de fichero. Append es añadir
	fic.close();
}
}
