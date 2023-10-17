package accesoDatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichTexto2 {
public static void main (String [] Args) throws IOException{
	File fichero = new File ("C:\\ejercicio\\archivo2.txt");

	FileWriter fic2 = new FileWriter(fichero, true);
	String [] cadena2 = {"Madrid", "Alcorcón", "Mostoles", "hola"};
	for (int i=0; i<cadena2.length; i++) {
		fic2.write(cadena2[i]);
		fic2.write(" ");
	}
	fic2.append('*');
	fic2.close();
}
}
