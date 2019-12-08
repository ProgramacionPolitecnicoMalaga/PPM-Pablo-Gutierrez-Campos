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
import java.util.ArrayList;

public class CreadorXMLActividadesEmpleados{

    public void crearXML(ArrayList<Actividad> actividades, Empleado empleado){
        try {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        Element eEmpleado = doc.createElement("empleado");
        doc.appendChild(eEmpleado);

        Attr apellidos = doc.createAttribute("apellidos");
        apellidos.setValue(empleado.getApellidos());
        eEmpleado.setAttributeNode(apellidos);

        Attr dni = doc.createAttribute("dni");
        dni.setValue(empleado.getDNI());
        eEmpleado.setAttributeNode(dni);

        Attr categoria = doc.createAttribute("categoria");
        categoria.setValue(empleado.getCategoria());
        eEmpleado.setAttributeNode(categoria);

        Attr nombre = doc.createAttribute("nombre");
        nombre.setValue(empleado.getNombre());
        eEmpleado.setAttributeNode(nombre);

            for (Actividad a: actividades) {
                if(a.getEmpleado().getNombre().equals(empleado.getNombre())){
                    Element actividad = doc.createElement("actividad");

                    Attr duracion = doc.createAttribute("duracion");
                    duracion.setValue(String.valueOf(a.getDuracion()));
                    actividad.setAttributeNode(duracion);

                    Attr proyecto = doc.createAttribute("proyecto");
                    proyecto.setValue(String.valueOf(a.getProyecto().getNombre()));
                    actividad.setAttributeNode(proyecto);

                    actividad.appendChild(doc.createTextNode(a.getDescripcion()));

                    eEmpleado.appendChild(actividad);
                }

            }


        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(empleado.getDNI()+".xml"));
        transformer.transform(source, result);
        } catch (TransformerException | ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
