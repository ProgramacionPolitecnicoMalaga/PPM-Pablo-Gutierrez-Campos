import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ListaPersonas extends AbstractTableModel {

    private ArrayList<Persona> listaDePersonas;
    private String[] columnas = {"Nombre","Apellidos","Edad"};

    public ListaPersonas(ArrayList<Persona> listaDePersonas) {
        this.listaDePersonas = listaDePersonas;
    }

    public ArrayList<Persona> getListaDePersonas() {
        return listaDePersonas;
    }


    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    @Override
    public int getRowCount() {
        return listaDePersonas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        if ((fila > -1) && (fila < listaDePersonas.size())){
            switch(columna){
                case 0: return listaDePersonas.get(fila).getNombre();
                case 1: return listaDePersonas.get(fila).getApellidos();
                case 2: return listaDePersonas.get(fila).getEdad();
            }
        }
        return null;
    }

    public void añadirColumna(){
        listaDePersonas.add(new Persona("","",0));
        fireTableDataChanged();
    }

    public void borrarColumna(int numeroFila){
        listaDePersonas.remove(numeroFila);
        fireTableRowsDeleted(numeroFila,numeroFila);
    }

    @Override
    public boolean isCellEditable(int posicionFila, int posicionColumna) {
        return true;
    }

    @Override
    public void setValueAt(Object valorNuevo, int posicionFila, int posicionColumna) {

        if ((posicionFila > -1) && (posicionFila < listaDePersonas.size())){
            if (posicionColumna == 0) listaDePersonas.get(posicionFila).setNombre((String) valorNuevo);
            else if (posicionColumna == 1) listaDePersonas.get(posicionFila).setApellidos((String) valorNuevo);
            else if (posicionColumna == 2) listaDePersonas.get(posicionFila).setEdad(Integer.parseInt(valorNuevo.toString()));
        }
        fireTableCellUpdated(posicionFila,posicionColumna);
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
