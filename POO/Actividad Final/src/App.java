import DAO.ConsultasUsuario;
import Vista.ControladorVista;
import Vista.Vista;

import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ActionListener controlador = new ControladorVista(new ConsultasUsuario() , vista);
        vista.setActionListenerControlador(controlador);
        vista.iniciarVista();
    }
}
