import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Vista {
    private JTable table1;
    private JButton insertarButton;
    private JButton borrarButton;
    private JButton mostrarButton;
    private JPanel panel;
    private ArrayList<Persona> listaPersonas;
    private ListaPersonas personas;


    public JPanel getPanel() {
        return panel;
    }

    public Vista(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
        personas = new ListaPersonas(listaPersonas);
        table1.setModel(personas);

        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personas.añadirColumna();
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personas.borrarColumna(table1.getSelectedRow());
            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(listaPersonas);
            }
        });

        table1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE){
                    table1.getCellEditor().stopCellEditing();
                    personas.borrarColumna(table1.getSelectedRow());
                }
            }
        });


    }


}
