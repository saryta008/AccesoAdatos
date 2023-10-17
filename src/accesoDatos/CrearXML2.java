package accesoDatos;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class CrearXML2 {
	public static void main (String [] args) {
		try{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		DOMImplementation implementation = builder.getDOMImplementation();
		Document documento = implementation.createDocument(null, "colegio", null);
		documento.setXmlVersion("1.0");
		
		Element clases = documento.createElement("clases");
		
		Element clase1 = documento.createElement("clase");
		
		Element codigo1 = documento.createElement("codigo");
		Text textocodigo1 = documento.createTextNode("A001");
		codigo1.appendChild(textocodigo1);
		clase1.appendChild(codigo1);
		
		Element clase2 = documento.createElement("clase");
		
		Element codigo2 = documento.createElement("codigo");
		Text textocodigo2 = documento.createTextNode("A002");
		codigo2.appendChild(textocodigo2);
		clase2.appendChild(codigo2);
		
		Element clase3 = documento.createElement("clase");
		
		Element codigo3 = documento.createElement("codigo");
		Text textocodigo3 = documento.createTextNode("A003");
		codigo3.appendChild(textocodigo3);
		clase3.appendChild(codigo3);
		
		clases.appendChild(clase1);
		clases.appendChild(clase2);
		clases.appendChild(clase3);
		documento.getDocumentElement().appendChild(clases);
		
		Source source = new DOMSource(documento);
		Result result = new StreamResult(new java.io.File("clases.xml"));
		
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(source, result);
		
		}catch(ParserConfigurationException e) {
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
