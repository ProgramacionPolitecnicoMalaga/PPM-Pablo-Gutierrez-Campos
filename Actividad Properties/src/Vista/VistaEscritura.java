package Vista;

import Intercambiadores.ControladorVistaPrincipal;
import Modelo.Mensaje;
import Modelo.Usuario;
import Propiedades.Propiedades;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class VistaEscritura {
    private JPanel panel2;
    private JComboBox comboBox1;
    private JTextField títuloDelMensajeTextField;
    private JTextArea textArea1;
    private JButton enviarButton;
    private ControladorVistaPrincipal controladorVistaPrincipal;

    public VistaEscritura() {
         controladorVistaPrincipal = new ControladorVistaPrincipal();
         añadirCombo();
         enviarButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     escribirMensaje();
                 } catch (IOException ex) {
                     ex.printStackTrace();
                 }
             }
         });
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public JTextField getTítuloDelMensajeTextField() {
        return títuloDelMensajeTextField;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void añadirCombo(){
        ArrayList<Usuario> usuarios = controladorVistaPrincipal.getUsuarios();

        for (Usuario u:usuarios) {
            comboBox1.addItem(u.getUsuario());
        }
    }

    public void escribirMensaje() throws IOException {
        String tituloMensaje = títuloDelMensajeTextField.getText();
        String cuerpoMensaje = textArea1.getText();
        Propiedades propiedadesUsuario = new Propiedades();
        String emisor = propiedadesUsuario.getProperties("Usuario_validado");
        String receptor = (String) comboBox1.getSelectedItem();
        Usuario UsuarioEmisor = controladorVistaPrincipal.getUsuario(emisor);
        controladorVistaPrincipal.insertarMensaje(new Mensaje(tituloMensaje,cuerpoMensaje,emisor,receptor, LocalDate.now(),UsuarioEmisor.getId()));
    }
}
