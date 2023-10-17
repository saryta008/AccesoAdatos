package accesoDatos;

import java.io.ByteArrayInputStream;


public class FlujoEntrada {
	public static void main (String [] Args) {
		byte [] datos = {8, 12, 26, 31, 36, 42, 46, 80};
		ByteArrayInputStream datosEntrada= new ByteArrayInputStream(datos);
		int lectorByte;
		
		while ((lectorByte = datosEntrada.read() ) != -1){
			    
		}
	}
}
