import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VistaAeropuerto extends JFrame{
    private JPanel PanelPrincipal;
    private JTextField Introducir;
    private JButton Buscar;
    private JPanel PanelSuperior;
    private JPanel PanelInferior;
    private JTextArea Resultados;
    private JComboBox AeropuertoBox;

    public VistaAeropuerto() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(PanelPrincipal);
    }

    public void arranca(){
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String obtenerNomAeropuertos(){
        return Introducir.getText();
    }

    public String obtenerNomAeropuertoBox(){
        return AeropuertoBox.getSelectedItem().toString();
    }

    public void anadirAeropuertos(ArrayList<String> res){
        if(AeropuertoBox.getWidth() > 0){ //eliminar los aeropuertos del pais anterior buscado
            AeropuertoBox.removeAllItems();
        }
        for(int i = 0; i < res.size(); i++){
            AeropuertoBox.addItem(res.get(i));
        }
    }

    public void mostrarDatos( ArrayList<String> res){
            Resultados.setText("");//reiniciar el textArea.
        for(int i = 0; i < res.size(); i++){
            Resultados.append(res.get(i));
            Resultados.append(System.getProperty("line.separator"));
        }

    }

    public void setControlador(ActionListener ctr){
        Buscar.addActionListener(ctr);
        Buscar.setActionCommand("Buscar");
        AeropuertoBox.addActionListener(ctr);
        AeropuertoBox.setActionCommand("Seleccionar");
    }
}