package Vista;

import DAO.ItemDAO;
import Modelo.Item;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    ItemDAO dao;
    VentanaPrincipal vista;

    public Controlador(ItemDAO dao, VentanaPrincipal vista) {
        this.dao = dao;
        this.vista = vista;
        vista.cargarDatosItem(dao.mostrarItem());
    }
    public void crearVentana() {
        VistaAñadir vistaAñadir = new VistaAñadir();
        JFrame ventana = new JFrame("Añadir ítems");
        ControladorAgregar controladorAdd = new ControladorAgregar(dao,vistaAñadir,vista);
        vistaAñadir.setControladorEmpleado(controladorAdd);
        ventana.setDefaultCloseOperation(2);
        ventana.setContentPane(vistaAñadir);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("nuevo")){
            crearVentana();
        } else if (e.getActionCommand().equals("eliminar")){

            int index = vista.getjList().getAnchorSelectionIndex();

            Item item = vista.getDefaultListModel().get(index);
            dao.eliminarItem(item.getAutor());
            vista.getDefaultListModel().remove(index);
            vista.cargarDatosItem(dao.mostrarItem());

        }
    }
}
