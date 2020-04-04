package Vista;

import Vista.DataTransfer;

import javax.swing.*;
import java.awt.event.*;

public class DialogoValidar extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtNickV;
    private JPasswordField txtPassV;
    private DataTransfer dataTransfer;

    public DialogoValidar(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });



        setLocationRelativeTo(getParent());
        pack();
        setVisible(true);
    }

    private void onOK() {

        dataTransfer.setDato("nombre",txtNickV.getText());
        char[] array = txtPassV.getPassword();
        String clave = new String(array);
        dataTransfer.setDato("clave",clave);
        dispose();
    }

    private void onCancel() {

        dispose();
    }

}
