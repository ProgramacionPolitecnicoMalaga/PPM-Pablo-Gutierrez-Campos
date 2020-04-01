package Vista;

import DAO.ItemDAO;
import Modelo.Item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class ControladorAgregar implements ActionListener {
    private ItemDAO dao;
    private VistaAñadir vista;
    private VentanaPrincipal vista2;

    public ControladorAgregar(ItemDAO dao, VistaAñadir vista,VentanaPrincipal vista2) {
        this.dao = dao;
        this.vista = vista;
        this.vista2 = vista2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("agregar")) {
            String autor = vista.getTxtNombre();
            String texto = vista.getTxtTexto();
            String tema = vista.getBoxSelecionado();
            LocalDate fecha = LocalDate.parse(vista.getTxtFecha());
            Item item = new Item(autor,fecha,texto,tema);
           dao.insertarItem(item);
           vista2.cargarDatosItem(dao.mostrarItem());
        }
    }
}
