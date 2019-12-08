import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField textField1;
    private JButton añadirNúmerosButton;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    static float[] numeros1 = new float[3];
    int indice1 = 0;

    static float[] numeros2 = new float[3];
    int indice2 = 0;

    static float[] resultados = new float[3];
    int indice3 = 0;

    public Calculadora() {
        añadirNúmerosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numeroIntroducido = Integer.parseInt(textField1.getText());

                if (indice1  < 3) {
                    numeros1[indice1] = numeroIntroducido;
                    indice1 = indice1 + 1;
                } else if (indice2  < 3) {
                    numeros2[indice2] = numeroIntroducido;
                    indice2 = indice2 + 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Ya están todos los operandos, pulse ahora un tipo de operacion");
                }

                visualizarOperandos();

                textField1.setText("");
            }
        });

        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultados[0] = numeros1[0] + numeros2[0];
                resultados[1] = numeros1[1] + numeros2[1];
                resultados[2] = numeros1[2] + numeros2[2];

                visualizarResultado();
            }
        });

        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultados[0] = numeros1[0] - numeros2[0];
                resultados[1] = numeros1[1] - numeros2[1];
                resultados[2] = numeros1[2] - numeros2[2];

                visualizarResultado();
            }
        });

        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultados[0] = numeros1[0] * numeros2[0];
                resultados[1] = numeros1[1] * numeros2[1];
                resultados[2] = numeros1[2] * numeros2[2];

                visualizarResultado();
            }
        });

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultados[0] = numeros1[0] / numeros2[0];
                resultados[1] = numeros1[1] / numeros2[1];
                resultados[2] = numeros1[2] / numeros2[2];

                visualizarResultado();
            }
        });
    }

    private void visualizarOperandos(){
        // visualizar el array 1 de operandos
        String operandos1 = "";

        for (int i = 0; i < numeros1.length; i++ ){
            float valorArray = numeros1[i];
            String valorArrayTexto = String.valueOf(valorArray);

            operandos1 = operandos1 + valorArrayTexto + " ";
        }

        label1.setText(operandos1);

        // visualizar el array 2 de operandos
        String operandos2 = "";

        for (int i = 0; i < numeros2.length; i++ ){
            float valorArray = numeros2[i];
            String valorArrayTexto = String.valueOf(valorArray);

            operandos2 = operandos2 + valorArrayTexto + " ";
        }

        label2.setText(operandos2);
    }

    private void visualizarResultado(){
        // visualizar el array 1 de operandos
        String resultado = "";

        for (int i = 0; i < resultados.length; i++ ){
            float valorArray = resultados[i];
            String valorArrayTexto = String.valueOf(valorArray);

            resultado = resultado + valorArrayTexto + " ";
        }

        label3.setText(resultado);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
