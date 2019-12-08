import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException {
        Proyecto proyecto = new Proyecto("Apple", "Hola", 5.5,"32542");
        Proyecto proyecto1 = new Proyecto("Amazon", "Hola", 5.5,"32542");

        Empleado empleado = new Programador("pablo","gutierrez", "2234234", "Programador");
        Empleado empleado2 = new Programador("pablo","gutierrez", "2234234", "Programador");

        ArrayList<Actividad> a = new ArrayList<Actividad>();
        Actividad actividad1 = new Actividad("djkbs",2, empleado,proyecto);
        Actividad actividad2 = new Actividad("gggggs",3, empleado,proyecto1);
        Actividad actividad3 = new Actividad("gggggs",5, empleado2,proyecto);
        a.add(actividad1);
        a.add(actividad2);
        a.add(actividad3);

        Actividades actividades = new Actividades();
        actividades.crearListActEmpleado(a,empleado);

        CreadorXMLActividadesEmpleados c = new CreadorXMLActividadesEmpleados();
        c.crearXML(a,empleado);
        CreadorXMLActividadesProyectos c2 = new CreadorXMLActividadesProyectos();
        c2.crearXML(a,proyecto);
    }
}
