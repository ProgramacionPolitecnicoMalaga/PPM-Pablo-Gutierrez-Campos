package Vista;

import Propiedades.Propiedades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends Container {
    private JPanel panelIntercambio;
    private JMenu menuMostrarPanel;
    private JMenuItem menuPanel1;
    private JMenuItem menuPanel2;
    private JPanel panelPrincipal;


    public Principal() {

        VistaLectura panel1 = new VistaLectura();
        VistaEscritura panel2 = new VistaEscritura();
        panelIntercambio.add(panel1.getPanel1(),"Panel1");
        panelIntercambio.add(panel2.getPanel2(),"Panel2");

        menuPanel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ítem 1 pulsado");
                CardLayout layout = (CardLayout) panelIntercambio.getLayout();
                layout.show(panelIntercambio,"Panel1");
            }

        });

        menuPanel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ítem 2 pulsado");
                CardLayout layout = (CardLayout) panelIntercambio.getLayout();
                layout.show(panelIntercambio,"Panel2");
            }
        });
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

}
