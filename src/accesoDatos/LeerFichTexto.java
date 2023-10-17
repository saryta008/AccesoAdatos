package accesoDatos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichTexto {
public static void main (String [] Args) throws IOException {
	File f1 = new File ("C:\\Users\\Sara\\eclipse-workspace\\accesoAdatos\\src\\accesoAdatos\\Actividad_1_1.java");
	f1.createNewFile();
	FileReader fic = new FileReader(f1);
	int i;
	while ((i= fic.read()) != -1) {
		System.out.print((char)i);
		
	}
	fic.close();
}
}
