import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

public class Main {
    public static void main(String[] args) throws TransformerException, ParserConfigurationException, XPathExpressionException {
        Inmobiliaria inmobiliaria = new Inmobiliaria();
/*
        inmobiliaria.ponerEnVenta(new Activo(new Dirección("Calle 1"),1));
        inmobiliaria.ponerEnVenta(new Activo(new Dirección("Calle 2"),2));
        inmobiliaria.ponerEnAlquiler(new Activo(new Dirección("Calle 3"),3));
        inmobiliaria.ponerEnAlquiler(new Activo(new Dirección("Calle 4"),4));
        inmobiliaria.ponerEnAlquiler(new Activo(new Dirección("Calle 5"),5));

        CreadorXMLActivos XMLActivos = new CreadorXMLActivos();
        XMLActivos.crearXML(inmobiliaria);

        inmobiliaria.añadirCliente(new Cliente("Pablo","Gutiérrez","1"));
        inmobiliaria.añadirCliente(new Cliente("Pablo","Gutiérrez","2"));
        inmobiliaria.añadirCliente(new Cliente("Pablo","Gutiérrez","3"));
        inmobiliaria.añadirCliente(new Cliente("Pablo","Gutiérrez","4"));
        inmobiliaria.añadirCliente(new Cliente("Pablo","Gutiérrez","5"));

        CreadorXMLClientes XMLClientes = new CreadorXMLClientes();
        XMLClientes.crearXML(inmobiliaria);

        inmobiliaria.añadirClienteFinanciacion( new Formulario(inmobiliaria.getClientes().get(0), new Financiación(10,10)));
        inmobiliaria.añadirClienteFinanciacion( new Formulario(inmobiliaria.getClientes().get(3), new Financiación(15,1)));
        inmobiliaria.añadirClienteFinanciacion( new Formulario(inmobiliaria.getClientes().get(1), new Financiación(16,2)));

        CreadorXMLClientesFinanciacion XMLClientesFinanciacion = new CreadorXMLClientesFinanciacion();
        XMLClientesFinanciacion.crearXML(inmobiliaria);
 */
        System.out.println("-----------------------EJERCICIO1-------------------------");
        LeerXMLActivos leer1 = new LeerXMLActivos("activos.xml");
        NodeList nodeList = leer1.evaluateXPath("Activos/EnVenta/Venta");
        leer1.leerVentas(nodeList,inmobiliaria);
        System.out.println(inmobiliaria.getVentas());

        System.out.println("-----------------------EJERCICIO2-------------------------");
        NodeList nodeList2 = leer1.evaluateXPath("Activos/EnAlquiler/Alquiler");
        leer1.leerAlquileres(nodeList2,inmobiliaria);
        System.out.println(inmobiliaria.getAlquileres());

        System.out.println("-----------------------EJERCICIO3-------------------------");
        LeerXMLClientes leer2 = new LeerXMLClientes("clientes.xml");
        leer2.leerClientes(inmobiliaria);
        System.out.println(inmobiliaria.getClientes());


        LeerXMLClientesFinanciacion leer3 = new LeerXMLClientesFinanciacion("clientesFinanciacion.xml");
        leer3.leerClientesFinanciacion(inmobiliaria);
        System.out.println(inmobiliaria.getClientesFinanciacion());
    }
}
