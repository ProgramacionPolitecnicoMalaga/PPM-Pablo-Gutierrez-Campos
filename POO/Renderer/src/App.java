import DAO.ConsultasDAO;
import DAO.ItemDAO;
import Vista.Controlador;
import Vista.VentanaPrincipal;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        VentanaPrincipal vista = new VentanaPrincipal();
        ItemDAO dao = new ConsultasDAO();
        ActionListener controlador = new Controlador(dao,vista);
        vista.setControlador(controlador);
        vista.iniciarVista();
    }
}
