import FactoryViewers.ViewerFactory;
import Lectores.LeerENV;
import Lectores.LeerXML;

public class App {
    public static void main(String[] args) {
        ViewerFactory selector = new ViewerFactory();
        LeerXML xml = new LeerXML();
        System.out.println(xml.getEmpadronamientos());
        LeerENV env = new LeerENV();
        System.out.println(env.getTipoViewer());

        selector.crearViewer(env.getTipoViewer());
    }
}
