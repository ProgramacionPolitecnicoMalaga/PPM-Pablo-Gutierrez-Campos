import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Actividades {



    public void crearListActEmpleado(ArrayList<Actividad> listaActividades, Empleado empleado){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element eEmpleado = doc.createElement("empleado");
            doc.appendChild(eEmpleado);

            Attr attr = doc.createAttribute("dni");
            attr.setValue(empleado.getDNI());
            eEmpleado.setAttributeNode(attr);

            Attr attr2 = doc.createAttribute("nombre");
            attr2.setValue(empleado.getNombre());
            eEmpleado.setAttributeNode(attr2);

            Iterator<Actividad> it=listaActividades.iterator();
            while (it.hasNext()) {
                Actividad actividad=it.next();
                if (actividad.getEmpleado()==empleado) {

                    Element eTiempo = doc.createElement("tiempo_dedicado");
                    eTiempo.appendChild(doc.createTextNode(Double.toString(actividad.getDuracion())));
                    eEmpleado.appendChild(eTiempo);

                    Element eDescripcion = doc.createElement("descripcion");
                    eDescripcion.appendChild(doc.createTextNode(actividad.getDescripcion()));
                    eEmpleado.appendChild(eDescripcion);

                    Element eProyecto = doc.createElement("proyecto");
                    eProyecto.appendChild(doc.createTextNode(actividad.getProyecto().getNombre()));
                    eEmpleado.appendChild(eProyecto);
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(empleado.getDNI()+".xml"));
            transformer.transform(source, result);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
