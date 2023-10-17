package accesoDatos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeUnFicheroAotro {
	public static void main (String [] Args) throws IOException {
		File fichero1 = new File("C:\\ejercicio\\Archivo1.txt");
		FileReader lectura = new FileReader(fichero1);
		
		File fichero2 = new File ("C:\\ejercicio\\Archivo2.txt");
		fichero2.createNewFile();
		FileWriter escritura = new FileWriter(fichero2);
		
		int lec;
		while ((lec=lectura.read()) != -1) {
			char letra =(char) lec;
			escritura.write(letra);
		}
		lectura.close();
		escritura.close();
		
	}

}
