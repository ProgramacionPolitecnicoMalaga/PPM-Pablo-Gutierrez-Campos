public class RetrocesoTarea {
    Tareas tareas;

    public RetrocesoTarea() throws TareasException {
        tareas = Tareas.getInstance();
    }

    public void retroceder(int numeroDeTareas){
        if(numeroDeTareas<0) {
            tareas.cambiarUltimaTareaRealizada(numeroDeTareas);
        }
    }

    public void mostrarTareas(){
        tareas.getUltimaTareaRealizada();
    }
}
