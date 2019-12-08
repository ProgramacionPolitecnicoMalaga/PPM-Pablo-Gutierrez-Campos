import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

    ArrayList<Componente> existencias;

    public Inventario(){
        existencias = new ArrayList<Componente>();
    }

    public void addExistencia(Componente existencia, int cantidadInicial){
        // TODO Comprobar que no existe ya
        existencia.setCantidad(cantidadInicial);
        existencias.add(existencia);
    }
    public void reponer(String id, int cantidad){
        Iterator<Componente> itExistencia = existencias.iterator();
        while (itExistencia.hasNext()){
            Componente existencia = itExistencia.next();
            if (existencia.getId().equals(id))
                existencia.setCantidad(existencia.getCantidad() + cantidad);
        }
    }
    public void contabilizarProducto(Producto producto){
        ArrayList<Componente> escasos = new ArrayList<Componente>();
        Iterator<Componente> itEspecificaciones = producto.getEspecificaciones().iterator();
        while(itEspecificaciones.hasNext()){
            Componente especificacion = itEspecificaciones.next();
            Iterator<Componente> itExistencias = existencias.iterator();
            boolean encontrado = false;
            while ((itExistencias.hasNext()) && (!encontrado)){
                Componente existencia = itExistencias.next();
                if(existencia.equals(especificacion)){
                    existencia.setCantidad(existencia.getCantidad() - especificacion.getCantidad());
                    encontrado = true;
                }
            }
        }
    }

    public ArrayList<Componente> minimasExistencias(Producto producto){
        ArrayList<Componente> escasos = new ArrayList<Componente>();
        Iterator<Componente> itEspecificaciones = producto.getEspecificaciones().iterator();
        while(itEspecificaciones.hasNext()){
            Componente especificacion = itEspecificaciones.next();
            Iterator<Componente> itExistencias = existencias.iterator();
            boolean encontrado = false;
            while ((itExistencias.hasNext()) && (!encontrado)){
                Componente existencia = itExistencias.next();
                if(existencia.equals(especificacion)){
                 if ()totalFabricables = ( existencia.getCantidad() - especificacion.getCantidad()*10 < 0)
                         escasos.add(existencia);
                    encontrado = true;
                     }
                }
          } return escasos;
    }
//TODO
    @Override
    public String toString() {
        return "Inventario{" +
                "existencias=" + existencias +
                '}';
    }

    public void leerXML(String nombreArchivo){
        File inputFile = new File(dir + File.separator + "songlist.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        XPath xPath = XPathFactory.newInstance().newXPath();
        String xpathExpr ="/inventario/componente";
        NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);

        for (int i = 0)
    }
}