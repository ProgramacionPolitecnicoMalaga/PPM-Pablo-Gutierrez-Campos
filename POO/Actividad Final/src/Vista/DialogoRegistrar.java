package Vista;

import javax.swing.*;
import java.awt.event.*;

public class DialogoRegistrar extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtNick;
    private JPasswordField txtPassword;
    private JComboBox boxAlgoritmo;
    private DataTransfer dataTransfer;
    public static String contraseña;

    public DialogoRegistrar(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        boxAlgoritmo.addItem("BCrypt");
        boxAlgoritmo.addItem("MD5");
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrar();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                cancelar();
            }
        });

        setLocationRelativeTo(getParent());
        pack();
        setVisible(true);
    }


    private void registrar() {
        dataTransfer.setDato("nombre",txtNick.getText());
        char[] array = txtPassword.getPassword();
        contraseña = new String(array);
        dataTransfer.setDato("clave",contraseña);
        dataTransfer.setDato("algoritmo",boxAlgoritmo.getSelectedItem().toString());
        dispose();
    }

    private void cancelar() {
        dispose();
    }
}
