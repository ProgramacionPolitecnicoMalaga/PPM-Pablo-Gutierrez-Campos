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

public class CreadorXMLClientesFinanciacion {
    public void crearXML(Inmobiliaria inmobiliaria) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        Element eClientesFinanciacion = doc.createElement("ClientesConFinanciacion");
        doc.appendChild(eClientesFinanciacion);


        for (Formulario f: inmobiliaria.getClientesFinanciacion() ) {
            System.out.println(f);
            Element eClientes = doc.createElement("Clientes");
            eClientesFinanciacion.appendChild(eClientes);

            Attr id = doc.createAttribute("id");
            id.setValue(f.getCliente().getDni());
            eClientes.setAttributeNode(id);

            Attr cuotas = doc.createAttribute("cuotas");
            cuotas.setValue(String.valueOf(f.getFinanciación().getCuotasTotales()));
            eClientes.setAttributeNode(cuotas);

            Attr cuotasRes = doc.createAttribute("cuotasRestantes");
            cuotasRes.setValue(String.valueOf(f.getFinanciación().getCuotasRestantes()));
            eClientes.setAttributeNode(cuotasRes);

        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("clientesFinanciacion.xml"));
        transformer.transform(source, result);



    }
}
