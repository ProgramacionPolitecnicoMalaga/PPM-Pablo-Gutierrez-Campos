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

public class CreadorXMLActividadesProyectos {

    public void crearXML(ArrayList<Actividad> actividades, Proyecto proyecto) throws ParserConfigurationException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element eProyecto = doc.createElement("proyecto");
            doc.appendChild(eProyecto);

            Attr departamento = doc.createAttribute("departamento");
            departamento.setValue(proyecto.getDepartamento());
            eProyecto.setAttributeNode(departamento);

            Attr fp = doc.createAttribute("fp");
            fp.setValue(String.valueOf(proyecto.getFprod()));
            eProyecto.setAttributeNode(fp);

            Attr nombre = doc.createAttribute("nombre");
            nombre.setValue(proyecto.getNombre());
            eProyecto.setAttributeNode(nombre);

            Element descripcion = doc.createElement("descripcion");
            eProyecto.appendChild(descripcion);

            descripcion.appendChild(doc.createTextNode(proyecto.getDescripcion()));

            for (Actividad a: actividades) {
                if(a.getProyecto().getNombre().equals(proyecto.getNombre())){
                    Element actividad = doc.createElement("actividad");

                    Attr duracion = doc.createAttribute("duracion");
                    duracion.setValue(String.valueOf(a.getDuracion()));
                    actividad.setAttributeNode(duracion);

                    Element descripcion1 = doc.createElement("descripcion");
                    descripcion1.appendChild(doc.createTextNode(a.getDescripcion()));
                    eProyecto.appendChild(actividad);

                    Element eEmpleado = doc.createElement("empleado");

                    Attr apellidos = doc.createAttribute("apellidos");
                    apellidos.setValue(a.getEmpleado().getApellidos());
                    eEmpleado.setAttributeNode(apellidos);

                    Attr dni = doc.createAttribute("dni");
                    dni.setValue(a.getEmpleado().getDNI());
                    eEmpleado.setAttributeNode(dni);

                    Attr categoria = doc.createAttribute("categoria");
                    categoria.setValue(a.getEmpleado().getCategoria());
                    eEmpleado.setAttributeNode(categoria);

                    Attr nombre1 = doc.createAttribute("nombre");
                    nombre1.setValue(a.getEmpleado().getNombre());
                    eEmpleado.setAttributeNode(nombre1);

                    actividad.appendChild(eEmpleado);

                    eProyecto.appendChild(actividad);
                }

            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(proyecto.getNombre()+".xml"));
            transformer.transform(source, result);
        } catch (TransformerException | ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
