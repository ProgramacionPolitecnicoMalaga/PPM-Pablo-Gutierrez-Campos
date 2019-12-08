import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaMoneda extends JFrame{
    private JPanel panelPrincipal;
    private JButton bTirar;
    private JTextField nTiradas;
    private JButton bRepetir;
    private JButton bLimpiar;
    private JPanel panelFoto;
    private JPanel panelBotones;
    private JLabel NTiradasActual;
    private JPanel panelSuperior;
    private JPanel panelInferior;
    private JPanel panelNTiradas;
    private JPanel panelPorcentajes;
    private JLabel porcentajesCruz;
    private JLabel porcentajesCara;
    private JLabel imagenMoneda;
    static ImageIcon cruz = new ImageIcon("C:\\ProyectosJava\\TiradaMoneda\\src\\cruz.png");
    static ImageIcon cara = new ImageIcon("C:\\ProyectosJava\\TiradaMoneda\\src\\cara.png");

    public VistaMoneda() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panelPrincipal);
    }

    public void arranca(){
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public int obtenerNumTiradas(){
        return Integer.parseInt(nTiradas.getText());
    }

    public void escribirResultados(double[] res){
        NTiradasActual.setText("Tiradas: " + Double.toString(res[2]));
        porcentajesCara.setText("Cara: " + Double.toString(res[0]));
        porcentajesCruz.setText("Cruz: " + Double.toString(res[1]));
        if(res[3] == 0) imagenMoneda.setIcon(cara);
        else imagenMoneda.setIcon(cruz);
    }
    public void limpiar(){
        NTiradasActual.setText("Tiradas:");
        porcentajesCara.setText("Cara:");
        porcentajesCruz.setText("Cruz:");
        nTiradas.setText("0");
    }

    public void setControlador(ActionListener ctr){
        bTirar.addActionListener(ctr);
        bTirar.setActionCommand("Tirar");
        bRepetir.addActionListener(ctr);
        bRepetir.setActionCommand("Repetir");
        bLimpiar.addActionListener(ctr);
        bLimpiar.setActionCommand("Limpiar");
    }
}


