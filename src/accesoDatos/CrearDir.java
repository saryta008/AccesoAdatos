package accesoDatos;

import java.io.File;
import java.io.IOException;

public class CrearDir {
	public static void main(String [] Args) {
		File d = new File ("NUEVODIR"); //directorio que creo 
		File f1 = new File(d, "FICHERO1.TXT");
		File f2 = new File (d, "FICHERO2.TXT");
		d.mkdir(); 	//CREAR DIRECTORIO
		
		try {
			if(f1.createNewFile()) {
				System.out.println("FICHERO 1 creado correctamente...");
			}else {
				System.out.println("No se ha podido crear FICHERO 1");
			}
			if(f2.createNewFile()) {
				System.out.println("FICHERO 2 creado correctamente...");
			}else {
				System.out.println("No se ha podido crear FICHERO 2");
			}
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		f1.renameTo(new File(d,"FICHERO1NUEVO"));
		
		try {
			File f3 = new File("NUEVODIR/FICHERO·.TXT");
			f3.createNewFile();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
