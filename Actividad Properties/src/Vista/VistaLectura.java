package Vista;

import Intercambiadores.ControladorVistaPrincipal;
import Modelo.Mensaje;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.time.LocalDate;
import java.util.ArrayList;

public class VistaLectura {
    private JPanel panel1;
    private JList list1;
    private JTextArea textArea1;
    private DefaultListModel<String> lista;
    ControladorVistaPrincipal controlador;

    public VistaLectura() {
        lista = new DefaultListModel<String>();
        controlador = new ControladorVistaPrincipal();
        list1.setModel(lista);
        list1.setFixedCellWidth(panel1.getWidth());
        introducirDatosJlist();
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (list1.getValueIsAdjusting() == false){
                    introducirDatosTextArea();
                }
            }
        });
    }

    public void introducirDatosJlist() {
        lista.removeAllElements();
        ArrayList<Mensaje> mensajes = controlador.getMensajes();
        for (Mensaje m : mensajes) {
            lista.addElement(m.getEmisor() + " - " + m.getFecha().toString());

        }
    }

    public void introducirDatosTextArea(){
            textArea1.removeAll();
            String emisor = (String) list1.getSelectedValue();
            String[] mensajes = emisor.split(" ");
            Mensaje mensaje = controlador.getMensaje(mensajes[0]);
            textArea1.setText(mensaje.getTitulo() + "\n\n" + mensaje.getCuerpo());
        }


    public JPanel getPanel1() {
        return panel1;
    }


}
