package Lectores;

import Modelo.Empadronamiento;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
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
import java.util.ArrayList;

public class LeerXML {
    private Document doc;
    public LeerXML(){
        try {
            File inputFile = new File("empadronamiento.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
    public NodeList evaluateXPath(String xpathExpr) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
        return nodeList;
    }

    public ArrayList<Empadronamiento> getEmpadronamientos()  {
        ArrayList<Empadronamiento> empadronamientos = new ArrayList<>();
        try{
            NodeList nodeList = evaluateXPath("/root/row");
            XPath xPath = XPathFactory.newInstance().newXPath();
            // String xpathExpr = "/productos/producto";
            // NodeList nodeList = (NodeList) xPath.compile(xpathExpr).evaluate(doc, XPathConstants.NODESET);
            for (int i=0; i<nodeList.getLength(); i++) {
                Element elementoProducto = (Element) nodeList.item(i);
                if ((elementoProducto != null) && (elementoProducto.getNodeType() == Element.ELEMENT_NODE)) {//Recorrer atributos de los nodos

                    String año = elementoProducto.getAttribute("Año");
                    String nacionalidad = elementoProducto.getAttribute("Nacionalidad");
                    String numeroEmpadronados = elementoProducto.getAttribute("Número_de_empadronados");

                    Empadronamiento empadronamiento = new Empadronamiento(Integer.parseInt(año),nacionalidad, Integer.parseInt(numeroEmpadronados));
                    empadronamientos.add(empadronamiento);
                }
            }
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return empadronamientos;
    }
}
