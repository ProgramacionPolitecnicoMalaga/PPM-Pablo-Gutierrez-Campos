public class Paciente {
    private String nombre;
    private int edad;
    private int id_especialidad;
    private boolean incidencia_gravedad;

    public Paciente(String nombre, int edad, int id_especialidad, boolean incidencia_gravedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.id_especialidad = id_especialidad;
        this.incidencia_gravedad = incidencia_gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public boolean isIncidencia_gravedad() {
        return incidencia_gravedad;
    }

    public void setIncidencia_gravedad(boolean incidencia_gravedad) {
        this.incidencia_gravedad = incidencia_gravedad;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", id_especialidad=" + id_especialidad +
                ", incidencia_gravedad=" + incidencia_gravedad +
                '}';
    }
}
