public class Actividad {
    private String descripcion;
    private long duracion;
    Empleado empleado;
    Proyecto proyecto;

    public Actividad(String descripcion, long duracion, Empleado empleado, Proyecto proyecto) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.empleado = empleado;
        this.proyecto = proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
