public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String categoria;

    public Empleado(String nombre, String apellidos, String DNI, String categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract double sueldo();

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", Sueldo='" + sueldo() + '\'' +
                '}';
    }
}

