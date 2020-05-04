public class App {
    public static void main(String[] args) throws TareasException {
        Tareas tareas = Tareas.getInstance();
        tareas.addTareas("Tarea 1");
        tareas.addTareas("Tarea 2");
        tareas.addTareas("Tarea 3");
        tareas.addTareas("Tarea 4");
        tareas.addTareas("Tarea 5");
        AvanceTarea avanzar = new AvanceTarea();
        avanzar.avanzar(3);
        System.out.println(tareas.getUltimaTareaRealizada());
        RetrocesoTarea retroceder = new RetrocesoTarea();
        retroceder.retroceder(-1);
        System.out.println(tareas.getUltimaTareaRealizada());
    }
}
