import Propiedades.Propiedades;
import Vista.VistaLogin;

import javax.swing.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class App {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        Propiedades propiedades = new Propiedades();
        VistaLogin vista = new VistaLogin();
        if(propiedades.getProperties("Usuario_validado") != null){
            vista.abrirVentanaPrincipal();
        } else {
            JFrame jFrame = new JFrame("Login");
            jFrame.setContentPane(vista.getPanelLogin());
            jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
            jFrame.pack();
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
        }
    }
}
