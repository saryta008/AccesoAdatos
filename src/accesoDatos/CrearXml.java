package accesoDatos;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

public class CrearXml {
	public static void main (String [] args) {
		try {
			
		//Creo el documento XML y lo llamo clientes
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder= factory.newDocumentBuilder();
		
		DOMImplementation implementation = builder.getDOMImplementation();
		Document documento = implementation.createDocument(null, "listadoClientes", null);
		documento.setXmlVersion("1.0");
		
		//Creo el padre
		Element clientes= documento.createElement("clientes");
		
		//Creo el primer hijo
		Element cliente1= documento.createElement("cliente");
		
		//Hijos de hijo y sus textos
		Element nombre = documento.createElement("nombre");
		Text textoNombre = documento.createTextNode("Come con Gusto");
		nombre.appendChild(textoNombre);
		cliente1.appendChild(nombre);
		
		Element nif = documento.createElement("nif");
		Text textoNif = documento.createTextNode("785694521B");
		nif.appendChild(textoNif);
		cliente1.appendChild(nif);
		
		Element direccion= documento.createElement("direccion");
		Text textoDireccion= documento.createTextNode("C/ Serrano nº23");
		direccion.appendChild(textoDireccion);
		cliente1.appendChild(direccion);
		
		//Creo el segundo hijo
		Element cliente2 = documento.createElement("cliente");
		
		//creo los hijos del segundo hijo 
		Element nombre2= documento.createElement("nombre2");
		Text textoNombre2= documento.createTextNode("Las conchas");
		nombre2.appendChild(textoNombre2);
		cliente2.appendChild(nombre2);
		
		Element nif2= documento.createElement("nif");
		Text textoNif2 = documento.createTextNode("754521845P");
		nif2.appendChild(textoNif2);
		cliente2.appendChild(nif2);
		
		Element direccion2 =documento.createElement("direccion");
		Text textoDireccion2 = documento.createTextNode("Calle de las delicias nº2");
		direccion2.appendChild(textoDireccion2);
		cliente2.appendChild(direccion2);
		
		//Meto cliente detro de clientes
		clientes.appendChild(cliente1);
		clientes.appendChild(cliente2);
		//Meto los clientes dentro del documento
		documento.getDocumentElement().appendChild(clientes);
		
		//Creamos el source y el resultado
		Source source = new DOMSource(documento);
		Result result= new StreamResult(new java.io.File("listadoClientes.xml"));
		
		//Creamos el transformador y transformamos el source y el result 
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(source, result);
		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
