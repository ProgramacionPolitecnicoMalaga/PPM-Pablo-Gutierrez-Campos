import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreadorXMLClientes {

    public void crearXML(Inmobiliaria inmobiliaria) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        Element eCafeteria = doc.createElement("Clientes");
        doc.appendChild(eCafeteria);

        for (Cliente c: inmobiliaria.getClientes() ) {
            Element eCliente = doc.createElement("Cliente");
            eCafeteria.appendChild(eCliente);

            Attr nombre = doc.createAttribute("nombre");
            nombre.setValue(c.getNombre());
            eCliente.setAttributeNode(nombre);

            Attr dni = doc.createAttribute("dni");
            dni.setValue(c.getDni());
            eCliente.setAttributeNode(dni);

            Attr apellidos = doc.createAttribute("apellidos");
            apellidos.setValue(c.getApellidos());
            eCliente.setAttributeNode(apellidos);


        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("clientes.xml"));
        transformer.transform(source, result);



    }
}
