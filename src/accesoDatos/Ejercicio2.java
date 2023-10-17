package accesoDatos;
import java.io.*;

public class Ejercicio2 {
	public static void main (String [] args) {
		String dir = "c:\\"; //directorio actual
		File f = new File(dir);
		String [] archivos = f.list();
		System.out.printf("Ficheros en el directorio actual : %d %n",
				archivos.length);
		for (int i=0; i<archivos.length; i++) {
			File f2 = new File(f, archivos [i]);
			if (f2.isFile() == true) {
				System.out.println("Nombre: "+archivos[i]+ " --> Es un Archivo");
			}else {
				System.out.println("Nombre: "+archivos[i]+ " --> Es un directorio");
			}
		}
	}
}
