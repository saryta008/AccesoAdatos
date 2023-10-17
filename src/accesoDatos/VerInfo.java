package accesoDatos;

import java.io.File;

public class VerInfo {
public static void main (String [] Args) {
	System.out.println("INFORMACION SOBRE EL FICHERO");
	File f = new File("C:\\Users\\Usuario\\eclipse-workspace\\accesoDatos\\src\\accesoDatos\\VerInfo.java");
	if(f.exists()) {
		System.out.println("Nombre del fichero: "+f.getName());
		System.out.println("Ruta: "+f.getPath());
		System.out.println("Ruta absoluta: "+f.getAbsolutePath());
		System.out.println("Se puede leer: "+f.canRead());
		System.out.println("Se puede escribir: "+f.canWrite());
		System.out.println("Tamaño: "+f.length());
		System.out.println("Es un directorio: "+f.isDirectory());
		System.out.println("Es un fichero: "+f.isFile());
		System.out.println("Nombre del directorio padre: "+f.getParent());
	}
}
}
