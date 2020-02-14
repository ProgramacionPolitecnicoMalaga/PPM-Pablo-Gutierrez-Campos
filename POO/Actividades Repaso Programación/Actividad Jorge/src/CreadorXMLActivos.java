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

public class CreadorXMLActivos {
    public void crearXML(Inmobiliaria inmobiliaria) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        Element eActivos = doc.createElement("Activos");
        doc.appendChild(eActivos);

        Element eVenta = doc.createElement("EnVenta");
        eActivos.appendChild(eVenta);

        for (Activo a: inmobiliaria.getVentas() ) {
            Element venta = doc.createElement("Venta");
            eVenta.appendChild(venta);

            Attr precio = doc.createAttribute("precio");
            precio.setValue(String.valueOf(a.getPrecio()));
            venta.setAttributeNode(precio);

            Attr dirección = doc.createAttribute("Dirección");
            dirección.setValue(String.valueOf(a.getDirección().getDireccion()));
            venta.setAttributeNode(dirección);

        }

        Element eAlquiler = doc.createElement("EnAlquiler");
        eActivos.appendChild(eAlquiler);

        for (Activo a2: inmobiliaria.getAlquileres() ) {
            Element alquiler = doc.createElement("Alquiler");
            eAlquiler.appendChild(alquiler);

            Attr precio2 = doc.createAttribute("precio");
            precio2.setValue(String.valueOf(a2.getPrecio()));
            alquiler.setAttributeNode(precio2);

            Attr dirección2 = doc.createAttribute("Dirección");
            dirección2.setValue(String.valueOf(a2.getDirección().getDireccion()));
            alquiler.setAttributeNode(dirección2);



        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("activos.xml"));
        transformer.transform(source, result);



    }
}
