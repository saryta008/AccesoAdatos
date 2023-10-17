package accesoDatos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichTextoBuf {
public static void main (String [] Args) throws IOException {
	File f1 = new File ("C:\\ejercicio\\Archivo1.txt");
	f1.createNewFile();
	FileReader fic = new FileReader(f1);
	char b [] = new char[8];
	int i;
	while ((i= fic.read(b)) != -1) {
		System.out.print(b);	
	}
	
	fic.close();
}
}
