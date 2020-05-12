import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Persona> listaPersonas = crearLista();

        JFrame frame = new JFrame("Personas");
        frame.setContentPane(new Vista((ArrayList<Persona>) listaPersonas).getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static List<Persona> crearLista() {
        List<Persona> lista = new ArrayList<>(){
            @Override
            public String toString() {
                String resultado = "\n-----------------------------------";
                resultado += "\nEstado de la lista";
                for (Persona lista: this)
                    resultado += "\n" + lista.toString();
                return resultado;
            }
        };

        lista.add(new Persona("Pablo","Gutiérrez Campos",20));
        lista.add(new Persona("Francisco","Madueño Barrionuevo",21));
        lista.add(new Persona("Sergio","Romero Martín",21));

        return lista;
    }
}
