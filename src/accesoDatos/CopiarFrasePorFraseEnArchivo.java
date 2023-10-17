package accesoDatos;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CopiarFrasePorFraseEnArchivo {
	public static void main (String [] Args) throws IOException {
		File directorio = new File("C:\\Users\\Usuario\\eclipse-workspace\\accesoDatos\\NUEVODIRECTORIO");
		File archivo2 = new File("C:\\Users\\Usuario\\eclipse-workspace\\accesoDatos\\NUEVODIRECTORIO\\ArchivoNuevo.txt");
		File archivo3 = new File(directorio, "Archivo3.txt");
		
		archivo3.createNewFile();
		
		BufferedReader flujoLectura = new BufferedReader(new FileReader(archivo2));
		BufferedWriter flujoEscritura = new BufferedWriter(new FileWriter(archivo3));
		
		String frase;
		while ((frase=flujoLectura.readLine()) != null) {
			flujoEscritura.write(frase);
			flujoEscritura.newLine();
		}
		flujoLectura.close();
		flujoEscritura.close();
	}
}
