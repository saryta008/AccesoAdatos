package accesoDatos;

import java.io.File;
import java.io.IOException;

public class Actividad_1_1 {
	public static void main (String [] Args) throws IOException {
		String dirActual = ".";	//Directorio actual
		
		File f1 = new File (dirActual);
		
		File [] contenido1 = f1.listFiles();
		
		String nombreCarpeta= f1.getName();
		
		System.out.printf("Nombre carpeta: %s %n",nombreCarpeta);
		
		try {
		for (int i=0; i<contenido1.length; i++) {
			System.out.println(contenido1[i].getName());
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		String dir = "C:\\Users\\Usuario\\Documents\\Pruebaas";	 //Una direccion de pruebas 
		
		File f2 = new File (dir);
		
		File [] contenido2 = f2.listFiles();
		
		nombreCarpeta= f2.getName();
		
		System.out.printf("Nombre carpeta: %s %n",nombreCarpeta);
		try {
		for (int i=0; i<contenido2.length; i++) {
			System.out.println(contenido2[i].getName());
		}
		}catch (Exception a) {
			a.printStackTrace();
		}
		
	}

}
