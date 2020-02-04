import java.util.ArrayList;
import java.util.Date;

public class Tareas {

    private ArrayList<Tarea> listaDeTareas;
    private ArrayList<Categoria> categorias;

    public Tareas() {
       listaDeTareas = new ArrayList<Tarea>();
       categorias = new ArrayList<Categoria>();
    }

    public ArrayList<Tarea> getListaDeTareas() {
        return listaDeTareas;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void añadirTarea(Tarea tarea){
        listaDeTareas.add(tarea);
    }

    public void añadirCategoria(Categoria categoria){
        categorias.add(categoria);
    }

    public ArrayList<Tarea> mostrarTareasPendientes(){
        ArrayList<Tarea> tareasPendientes = new ArrayList<>();
        for (Tarea t:listaDeTareas) {
            if(!t.isCompletado()) {
                tareasPendientes.add(t);
            }
        } return tareasPendientes;
    }

    public void eliminarTareasCompletada(){
        for (Tarea t2:listaDeTareas) {
            if(t2.isCompletado()) {
                listaDeTareas.remove(t2);
            }
        }
    }

    public ArrayList<Tarea> consultarTareaPorFecha(Date fecha){
        ArrayList<Tarea> auxFechas = new ArrayList<Tarea>();

        for (Tarea t3: listaDeTareas) {
            if(t3.getFechaLimite().compareTo(fecha)==0){
                auxFechas.add(t3);
            }

        } return auxFechas;
    }
    public ArrayList<Tarea> consultarTareasAtrasadas(Date fecha){
        ArrayList<Tarea> auxFechas = new ArrayList<Tarea>();

        for (Tarea t3: listaDeTareas) {
            if(t3.getFechaLimite().compareTo(fecha)>0){
                auxFechas.add(t3);
            }

        } return auxFechas;
    }

    public ArrayList<Tarea> consultarTareaEnTiempo(Date fecha){
        ArrayList<Tarea> auxFechas = new ArrayList<Tarea>();

        for (Tarea t3: listaDeTareas) {
            if(t3.getFechaLimite().compareTo(fecha)<0){
                auxFechas.add(t3);
            }

        } return auxFechas;
    }

    public ArrayList<Categoria> consultarTipoCategoria(Categoria categoria){
        ArrayList<Categoria> auxFechas = new ArrayList<Categoria>();

        for (Categoria c: categorias) {
            if(c.equals(categoria)){
                auxFechas.add(c);
            }

        } return auxFechas;
    }


    @Override
    public String toString() {
        return "Tareas{" +
                "listaDeTareas=" + listaDeTareas +
                '}';
    }
}
