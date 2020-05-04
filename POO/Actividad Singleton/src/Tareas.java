import java.util.ArrayList;

public class Tareas {

    private int ultimaTareaRealizada;
    private ArrayList<String> tareas = null;
    private static Tareas instanciaDeTareas;

    private Tareas() {
        ultimaTareaRealizada = -1;
        tareas = new ArrayList<>();
    }

    public static Tareas getInstance()  {
        if(instanciaDeTareas == null){
            instanciaDeTareas = new Tareas();
        } else {
            try {
                throw new TareasException("Ya hay una tarea creada");
            } catch (TareasException e) {
                e.printStackTrace();
            }
        }
        return instanciaDeTareas;
    }

    public void addTareas(String tarea){
        tareas.add(tarea);
    }

    public String getUltimaTareaRealizada(){
       return tareas.get(ultimaTareaRealizada);
    }

    public void cambiarUltimaTareaRealizada(int numeroDeTareas){
        if (numeroDeTareas > 0 && numeroDeTareas + ultimaTareaRealizada < tareas.size()){
           ultimaTareaRealizada += numeroDeTareas;
        } else if(numeroDeTareas < 0 &&  numeroDeTareas + ultimaTareaRealizada >= 0){
            ultimaTareaRealizada += numeroDeTareas;
        }

    }
}
