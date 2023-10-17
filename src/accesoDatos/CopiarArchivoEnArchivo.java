package accesoDatos;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopiarArchivoEnArchivo {
	public static void main ( String [] Args) throws IOException {
		File directorio = new File("C:\\Users\\Usuario\\eclipse-workspace\\accesoDatos\\NUEVODIRECTORIO");
		File archivo = new File ("C:\\\\Users\\\\Usuario\\\\eclipse-workspace\\\\accesoDatos\\\\NUEVODIRECTORIO\\archivo1.txt");
		
		File archivoNuevo = new File(directorio, "ArchivoNuevo.txt");
		archivoNuevo.createNewFile();
		
		FileReader flujoLectura= new FileReader(archivo);
		FileWriter flujoEscritura = new FileWriter(archivoNuevo);
		
		int letra;
		while((letra=flujoLectura.read())!=-1) {
			flujoEscritura.write(letra);
		}
		flujoEscritura.close();
		flujoLectura.close();
	}
}
