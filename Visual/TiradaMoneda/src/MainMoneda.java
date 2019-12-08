import java.awt.event.ActionListener;

public class MainMoneda {
    public static void main(String[] args) {
        VistaMoneda vista = new VistaMoneda();
        Tirada tirada = new Tirada();
        ActionListener controlador = new CtrMoneda(vista,tirada);
        vista.setControlador(controlador);
        vista.arranca();
    }
}
