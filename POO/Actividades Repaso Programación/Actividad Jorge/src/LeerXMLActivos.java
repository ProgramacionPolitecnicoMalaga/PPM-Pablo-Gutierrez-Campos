import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class LeerXMLActivos {
        Document doc;

        public LeerXMLActivos(String nombreFichero){
            String dir = System.getProperty("user.dir");
            try {
                File inputFile = new File(dir + File.separator + nombreFichero);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
                doc = docBuilder.parse(inputFile);
                doc.getDocumentElement().normalize();

            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public NodeList evaluateXPath(String xpathExpr) throws XPathExpressionException {
            XPath xPath = XPathFactory.newInstance().newXPath();
            NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            return nodeList;
        }

        public void leerVentas(NodeList listaDeNodos, Inmobiliaria inmobiliaria){
            for (int i = 0; i < listaDeNodos.getLength(); i++) { //Recorrer nodos
                Node n = listaDeNodos.item(i);

                if ((n != null) && (n.getNodeType() == Element.ELEMENT_NODE)) {//Recorrer atributos de los nodos
                    NamedNodeMap atributos = n.getAttributes();
                    String precio = atributos.item(1).getNodeValue();
                    Dirección direccion = new Dirección(atributos.item(0).getNodeValue());
                    Activo venta = new Activo(direccion,Double.parseDouble(precio));
                    inmobiliaria.ponerEnVenta(venta);
                }

            }
        }

        public void leerAlquileres(NodeList listaDeNodos, Inmobiliaria inmobiliaria){
            for (int i = 0; i < listaDeNodos.getLength(); i++) { //Recorrer nodos
                Node n = listaDeNodos.item(i);

                if ((n != null) && (n.getNodeType() == Element.ELEMENT_NODE)) {//Recorrer atributos de los nodos
                    NamedNodeMap atributos = n.getAttributes();
                    String precio = atributos.item(1).getNodeValue();
                    Dirección direccion = new Dirección(atributos.item(0).getNodeValue());
                    Activo alquiler = new Activo(direccion,Double.parseDouble(precio));
                    inmobiliaria.ponerEnAlquiler(alquiler);
                }

            }
        }


}
