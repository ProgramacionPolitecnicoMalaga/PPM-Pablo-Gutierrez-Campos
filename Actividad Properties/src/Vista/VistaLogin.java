package Vista;

import Intercambiadores.InicioSesión;
import Propiedades.Propiedades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

public class VistaLogin extends JDialog {
    private JTextField usuario;
    private JPasswordField contraseña;
    private JButton loginBoton;
    private JPanel PanelLogin;
    private InicioSesión login;
    private Propiedades propiedades;

    public VistaLogin() throws NoSuchAlgorithmException, IOException {
         login = new InicioSesión();
         propiedades = new Propiedades();


        loginBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    login();
                } catch (NoSuchAlgorithmException | IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
    public String getUsuario(){
        return usuario.getText();
    }

    public String getContraseña(){
        char[] simbolos = contraseña.getPassword();
        return new String(simbolos);
    }

    public void abrirVentanaPrincipal(){
        Principal vistaPrincipal = new Principal();
        vistaPrincipal.setVisible(true);
        JFrame jFrame = new JFrame(getUsuario());
        Principal vista = new Principal();
        jFrame.setContentPane(vista.getPanelPrincipal());
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int altura = toolkit.getScreenSize().height - 200;
        int ancho = toolkit.getScreenSize().width - 1500;
        jFrame.setPreferredSize(new Dimension(altura, ancho));
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        this.setVisible(false);
        this.remove(this);
        this.dispose();

    }

    public void login() throws NoSuchAlgorithmException, IOException {
        boolean validación = login.iniciarSesion(getUsuario(),getContraseña());
        if(validación == true){
            Propiedades propiedadesUsuario = new Propiedades();
            propiedadesUsuario.setProperties("Usuario_validado",getUsuario());
            propiedadesUsuario.guardarCambios();
            abrirVentanaPrincipal();


        }
    }

    public JPanel getPanelLogin() {
        return PanelLogin;
    }
}
