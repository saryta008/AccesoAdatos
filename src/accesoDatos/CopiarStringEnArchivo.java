package accesoDatos;

import java.io.File;
import java.io.CharArrayReader;
import java.io.FileWriter;

import java.io.IOException;
public class CopiarStringEnArchivo {
	public static void main (String [] Args) throws IOException {
	
		File directorio = new File("NUEVODIRECTORIO");
		directorio.mkdir();
		
		File archivo1 = new File(directorio, "archivo1.txt");
		
		archivo1.createNewFile();
		
		String frase = "TODOS LOS HOMBRES SON IGUALES";
		char [] letras = frase.toCharArray();
		
		
		CharArrayReader flujoLectura= new CharArrayReader(letras);
		FileWriter flujoEscritura = new FileWriter(archivo1);
		
		int letra;
		
		while((letra=flujoLectura.read())!= -1) {
			flujoEscritura.write(letra);
		}
		
		flujoEscritura.close();
		flujoLectura.close();
}
}
