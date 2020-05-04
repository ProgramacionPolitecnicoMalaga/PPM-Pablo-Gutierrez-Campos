public class AvanceTarea {
    Tareas tareas;

    public AvanceTarea() throws TareasException {
         tareas = Tareas.getInstance();
    }

    public void avanzar(int numeroDeTareas){
        if(numeroDeTareas>0) {
            tareas.cambiarUltimaTareaRealizada(numeroDeTareas);
        }
    }

    public void mostrarTareas(){
        tareas.getUltimaTareaRealizada();
    }
}
